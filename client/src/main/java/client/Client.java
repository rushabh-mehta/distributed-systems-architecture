package client;

import config.Config;
import generated.LoadBalancerQueryGrpc;
import generated.LoadBalancerQueryOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args){
        ManagedChannel channel = ManagedChannelBuilder.forAddress(Config.loadBalancerHost,Config.loadBalancerPort).usePlaintext().build();
        LoadBalancerQueryGrpc.LoadBalancerQueryStub asyncQueryStub = LoadBalancerQueryGrpc.newStub(channel);
        int numRequests = 100;
        long startTime = System.currentTimeMillis();
        List<CountDownLatch> latches = new ArrayList<>();
        for(int i=0;i<numRequests;i++){
            LoadBalancerQueryOuterClass.query query= LoadBalancerQueryOuterClass.query.newBuilder().setStartDate("Test Date").build();
            final CountDownLatch finishLatch = new CountDownLatch(1);
            latches.add(finishLatch);
            StreamObserver<LoadBalancerQueryOuterClass.result> responseObserver = new StreamObserver<LoadBalancerQueryOuterClass.result>() {
                @Override
                public void onNext(LoadBalancerQueryOuterClass.result value) {
                    //TODO handle - response received
//                    System.out.println("Got result========");
//                    System.out.println(value.getResponseStatus());
//                    System.out.println(value.getResponseMessage());
//                    for(int i=0;i< value.getRecordsCount();i++){
//                        System.out.println(value.getRecords(i).getStationId());
//                        System.out.println(value.getRecords(i).getWindDirection());
//                        System.out.println(value.getRecords(i).getRelHumidity());
//                        System.out.println(value.getRecords(i).getTemperature());
//                        System.out.println(value.getRecords(i).getWindSpeed());
//                    }
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {
                    System.out.println("Got response from server");
                     finishLatch.countDown();
                }
            };
            asyncQueryStub.getAllRecords(query,responseObserver);
        }
        for(int i=0;i<latches.size();i++){
            try {
                latches.get(i).await(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        double timeReq = totalTime/numRequests;
        System.out.println("Avg Time per request: "+timeReq/1000+" seconds");
    }
}
