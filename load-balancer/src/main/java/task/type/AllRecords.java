package task.type;

import generated.DataServerQueryGrpc;
import generated.DataServerQueryOuterClass;
import generated.LoadBalancerQueryOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AllRecords implements TaskType {
    String startDate;
    String endDate;
    String region;
    String stationId;

    public AllRecords(String startDate, String endDate, String region, String stationId){
        this.startDate = startDate;
        this.endDate = endDate;
        this.region = region;
        this.stationId = stationId;
    }
    @Override
    public void run(LoadBalancerQueryOuterClass.query request, StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver, int serverPort, String ipAddr) {
        // TODO add implementation to get all records from file using parser
        ManagedChannel channel = ManagedChannelBuilder.forAddress(ipAddr, serverPort).usePlaintext().build();
        DataServerQueryGrpc.DataServerQueryStub asyncStub = DataServerQueryGrpc.newStub(channel);
        DataServerQueryOuterClass.query query = DataServerQueryOuterClass.query.newBuilder().setStartDate(request.getStartDate()).build();
        CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<DataServerQueryOuterClass.result> serverResponseObserver = new StreamObserver<DataServerQueryOuterClass.result>() {
            @Override
            public void onNext(DataServerQueryOuterClass.result value) {
                System.out.println("Got response");
                LoadBalancerQueryOuterClass.result.Builder result = LoadBalancerQueryOuterClass.result.newBuilder();
                result.setResponseMessage(value.getResponseMessage());
                result.setResponseStatus(value.getResponseStatus());
                for(int i=0; i<value.getRecordsCount();i++){
                    LoadBalancerQueryOuterClass.record.Builder record = LoadBalancerQueryOuterClass.record.newBuilder();
                    record.setStationId(value.getRecords(i).getStationId());
                    record.setWindDirection(value.getRecords(i).getWindDirection());
                    record.setRelHumidity(value.getRecords(i).getRelHumidity());
                    record.setTemperature(value.getRecords(i).getTemperature());
                    record.setWindSpeed((value.getRecords(i).getWindSpeed()));
                    result.addRecords(record.build());
                }
                responseObserver.onNext(result.build());
                responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                finishLatch.countDown();
            }
        };
        asyncStub.getAllRecords(query,serverResponseObserver);
        try {
            //TODO improve exception handling
            finishLatch.await(1, TimeUnit.MINUTES);
            channel.awaitTermination(1, TimeUnit.MINUTES);
            channel.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
