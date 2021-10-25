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
    private static final int[] serverPorts = ServerConfig.serverPorts;
    private static final String[] hosts = ServerConfig.hosts;

    public TaskProcessor(TaskQueue taskQueue){
        this.taskQueue = taskQueue;
        this.numThreads = numThreads;
        executor = Executors.newCachedThreadPool();
    }
    private static final Server getNextServerAddress(int count){
        int currServerPort = serverPorts[count%(serverPorts.length)];
        String currHost = hosts[count%(hosts.length)];
        return new Server(currServerPort,currHost);
    }
    public void run(){
        // TODO add implementation for better server selection algorithm
        int count = 0;
        while(_forever){
            try {
                Task task = taskQueue.getQ().poll(2000, TimeUnit.MILLISECONDS);
                if(task!=null){
                    count++;
                    Server nextServer = getNextServerAddress(count);
                    task.setServerAddress(nextServer.getPort(), nextServer.getHost());
                    executor.submit(task);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Server{
    private int port;
    private String host;

    public Server(int port, String host) {
        this.port = port;
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
