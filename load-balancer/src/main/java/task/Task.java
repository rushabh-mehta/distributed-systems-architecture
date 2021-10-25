package task;

import generated.LoadBalancerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import task.type.TaskType;

public class Task extends Thread{
    TaskType type;
    LoadBalancerQueryOuterClass.query request;
    StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver;
    int serverPort;
    String host;

    public Task(TaskType type, LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver){
        this.type = type;
        this.request = request;
        this.responseObserver = responseObserver;
    }

    public void setServerAddress(int serverPort, String host) {
        this.serverPort = serverPort;
        this.host = host;
    }

    public void run(){
        type.run(this.request, this.responseObserver, this.serverPort, this.host);
    }
}
