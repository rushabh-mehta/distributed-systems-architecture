package processor;

import loadbalancer.config.ServerConfig;
import queue.TaskQueue;
import server.DataServer;
import server.DataServerResource;
import task.Task;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskProcessor extends Thread{
    private TaskQueue taskQueue;
    private int numThreads = 4;
    private boolean _forever = true;
    private ExecutorService executor;
    private static final int[] serverPorts = ServerConfig.serverPorts;
    private static final String[] hosts = ServerConfig.hosts;
    private static List<DataServer> servers = new ArrayList<>();
    private static long tasksProcessed;
    private static DataServer currServer=null;
    private static int serverWeightsUsed=0;
    private static int currServerInd=0;


    public TaskProcessor(TaskQueue taskQueue){
        this.taskQueue = taskQueue;
        executor = Executors.newCachedThreadPool();
        tasksProcessed = 0;
    }

    public static void addServer(DataServer server) {
        TaskProcessor.servers.add(server);
        Collections.sort(servers,new Comparator<DataServer>() {
            @Override
            public int compare(DataServer d1, DataServer d2) {
                DataServerResource r1 = d1.getServerResource();
                DataServerResource r2 = d2.getServerResource();
                int metric1 = (int)((r1.getCores()*100)+ r1.getFreeMemory());
                int metric2 = (int)((r2.getCores()*100)+ r2.getFreeMemory());
                return metric1-metric2;
            }
        });
        setServerWeights();
    }
    public static void setServerWeights(){
        int i = 1;
        for(DataServer server : servers){
            server.setWeight(i++);
        }
    }

    private static final void getNextServerAddress(){
        if(currServer==null){
            currServer = servers.get(currServerInd);
            serverWeightsUsed++;
        }
        else if(currServer.getWeight()==serverWeightsUsed){ //max weight limit reached change server
            currServerInd = (currServerInd+1)%servers.size();
            currServer = servers.get(currServerInd);
            serverWeightsUsed = 0;
        }else{
            serverWeightsUsed++;
        }
    }
    public void run(){
        // TODO add implementation for better server selection algorithm
        while(_forever){
            try {
                Task task = taskQueue.getQ().poll(2000, TimeUnit.MILLISECONDS);
                if(task!=null){
                    getNextServerAddress();
                    task.setServerAddress(currServer.getPort(), currServer.getHost());
                    executor.submit(task);
                    tasksProcessed++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


