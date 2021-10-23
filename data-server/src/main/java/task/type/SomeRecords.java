package task.type;

import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class SomeRecords implements TaskType{
    String startDate;
    String endDate;
    String region;
    String stationId;

    public SomeRecords(String startDate, String endDate, String region, String stationId){
        this.startDate = startDate;
        this.endDate = endDate;
        this.region = region;
        this.stationId = stationId;
    }
    @Override
    public void run(DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver) {
        // TODO add implementation to get some records from file using parser
    }
}
