package task;

import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import task.type.TaskType;

import java.util.concurrent.CountDownLatch;

public class Task extends Thread{
    TaskType type;
    DataServerQueryOuterClass.query request;
    StreamObserver<DataServerQueryOuterClass.result> responseObserver;

    public Task(TaskType type, DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver){
        this.type = type;
        this.request = request;
        this.responseObserver = responseObserver;
    }


    public void run(){
        type.run(this.request, this.responseObserver);
    }

}
