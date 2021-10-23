package queue;

import task.Task;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue {
    private LinkedBlockingQueue<Task> _queue;

    public TaskQueue(){
        _queue = new LinkedBlockingQueue<Task>();
    }

    public void addTask(Task t){
        try {
            this._queue.put(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch(NullPointerException n){
            n.printStackTrace();
        }
    }

    public LinkedBlockingQueue<Task> getQ() {
        return _queue;
    }
}
