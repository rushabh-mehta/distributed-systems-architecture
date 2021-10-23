package loadbalancer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import processor.TaskProcessor;
import queue.TaskQueue;
import services.LoadBalancerQueryService;

import java.io.IOException;

public class LoadBalancer {
    public static void main(String[] args) throws IOException, InterruptedException {
         TaskQueue taskQueue = new TaskQueue();
         TaskProcessor taskProcessor = new TaskProcessor(taskQueue);
         taskProcessor.start();
        Server server = ServerBuilder
                .forPort(8081)
                .addService(new LoadBalancerQueryService(taskQueue))
                .build();
        server.start();
        System.out.println("Load Balancer started at port 8081");
        server.awaitTermination();
    }
}
