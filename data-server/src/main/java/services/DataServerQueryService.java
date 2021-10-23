package services;

import gash.obs.madis.MesonetData;
import gash.obs.madis.MesonetProcessor;
import generated.DataServerQueryGrpc;
import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import queue.TaskQueue;
import task.Task;
import task.type.AllRecords;
import task.type.SomeRecords;
import task.type.TaskType;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DataServerQueryService extends DataServerQueryGrpc.DataServerQueryImplBase {
    TaskQueue queue;

    public DataServerQueryService(TaskQueue queue) {
        this.queue = queue;
    }

    @Override
    public void getAllRecords(DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver) {
        TaskType type = new AllRecords(request.getStartDate(), request.getEndDate(), request.getRegion(), request.getStationId());
        Task task = new Task(type, request, responseObserver);
        queue.addTask(task);
    }

    @Override
    public void getSomeRecords(DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver) {
        TaskType type = new SomeRecords(request.getStartDate(), request.getEndDate(), request.getRegion(), request.getStationId());
        Task task = new Task(type, request, responseObserver);
        queue.addTask(task);
    }
}
