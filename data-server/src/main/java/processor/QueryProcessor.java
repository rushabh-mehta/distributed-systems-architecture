package processor;

import queue.TaskQueue;
import task.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QueryProcessor extends Thread{
     private ExecutorService executor;
    private TaskQueue taskQueue;
    private int numThreads = 5;
    private boolean _forever = true;
    public QueryProcessor(){
        executor = Executors.newFixedThreadPool(this.numThreads);
    }
    public QueryProcessor(TaskQueue taskQueue, int numThreads){
        this.taskQueue = taskQueue;
        this.numThreads = numThreads;
        executor = Executors.newFixedThreadPool(numThreads);
    }
    public void run(){
        // TODO improve implementation of queue polling
        // TODO add implementation for custom threadpool
        while(_forever){
            try {
                Task task = taskQueue.get_queue().poll(2000, TimeUnit.MILLISECONDS);
                if(task!=null){
                    executor.submit(task);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
