package processor;

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
        int[] servers = {8082};
        int count = 0;
        int currServer = servers[0];
        while(_forever){
            try {
                Task task = taskQueue.getQ().poll(2000, TimeUnit.MILLISECONDS);
                if(task!=null){
                    currServer = servers[count%(servers.length)];
                    count++;
                    task.setServerAddress(currServer);
                    executor.submit(task);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
