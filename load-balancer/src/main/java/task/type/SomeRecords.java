package task.type;

import generated.LoadBalancerQueryOuterClass;
import io.grpc.stub.StreamObserver;

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
    public void run(LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver, int serverPort, String ipAddr) {
        // TODO add implementation to get some records from file using parser

    }
}
