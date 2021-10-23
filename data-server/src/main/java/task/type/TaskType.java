package task.type;

import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public interface TaskType {
     void run(DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver);
}
