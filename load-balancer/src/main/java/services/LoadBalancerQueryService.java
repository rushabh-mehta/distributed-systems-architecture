package services;

import generated.LoadBalancerQueryGrpc;
import generated.LoadBalancerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import queue.TaskQueue;
import task.Task;
import task.type.AllRecords;
import task.type.SomeRecords;
import task.type.TaskType;

public class LoadBalancerQueryService extends LoadBalancerQueryGrpc.LoadBalancerQueryImplBase {
    TaskQueue queue;
    static int count = 0;

    public LoadBalancerQueryService(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @Override
    public void getAllRecords(LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver) {
        TaskType type = new AllRecords(request.getStartDate(), request.getEndDate(), request.getRegion(), request.getStationId());
        Task task = new Task(type, request, responseObserver);
        System.out.println("Got request");
        queue.addTask(task);
    }

    @Override
    public void getSomeRecords(LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver) {
        TaskType type = new SomeRecords(request.getStartDate(), request.getEndDate(), request.getRegion(), request.getStationId());
        Task task = new Task(type, request, responseObserver);
        queue.addTask(task);
    }
}
