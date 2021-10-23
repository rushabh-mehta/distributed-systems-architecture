package task.type;

import generated.LoadBalancerQueryOuterClass;
import io.grpc.stub.StreamObserver;

public interface TaskType {
    public abstract void run(LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver, int serverPort);
}
