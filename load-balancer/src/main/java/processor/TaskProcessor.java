package processor;

import loadbalancer.config.ServerConfig;
import queue.TaskQueue;
import task.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskProcessor extends Thread{
    private TaskQueue taskQueue;
    private int numThreads = 4;
    private boolean _forever = true;
    private ExecutorService executor;

    public TaskProcessor(TaskQueue taskQueue){
        this.taskQueue = taskQueue;
        this.numThreads = numThreads;
        executor = Executors.newCachedThreadPool();
    }
    public void run(){
        // TODO add implementation for better server selection algorithm
        int[] serverPorts = ServerConfig.serverPorts;
        String[] hosts = ServerConfig.hosts;
        int count = 0;
        int currServerPort;
        String currHost;
        while(_forever){
            try {
                Task task = taskQueue.getQ().poll(2000, TimeUnit.MILLISECONDS);
                if(task!=null){
                    currServerPort = serverPorts[count%(serverPorts.length)];
                    currHost = hosts[count%(hosts.length)];
                    count++;
                    task.setServerAddress(currServerPort,currHost);
                    executor.submit(task);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
