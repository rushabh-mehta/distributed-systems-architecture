package loadbalancer;

import generated.DataServerQueryGrpc;
import generated.DataServerQueryOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import loadbalancer.config.LoadBalancerConfig;
import loadbalancer.config.ServerConfig;
import processor.TaskProcessor;
import queue.TaskQueue;
import server.DataServer;
import server.DataServerResource;
import services.LoadBalancerQueryService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoadBalancer {
    public static void main(String[] args) throws IOException, InterruptedException {
         TaskQueue taskQueue = new TaskQueue();
         TaskProcessor taskProcessor = new TaskProcessor(taskQueue);
         taskProcessor.start();
        Server server = ServerBuilder
                .forPort(LoadBalancerConfig.port)
                .addService(new LoadBalancerQueryService(taskQueue))
                .build();
        String[] serverHosts = ServerConfig.hosts;
        int[] serverPorts  = ServerConfig.serverPorts;
        for(int i=0;i<serverHosts.length;i++){
            ManagedChannel channel = ManagedChannelBuilder.forAddress(serverHosts[i],serverPorts[i]).usePlaintext().build();
            DataServerQueryGrpc.DataServerQueryBlockingStub stub = DataServerQueryGrpc.newBlockingStub(channel);
            DataServerQueryOuterClass.dataEmpty.Builder dataEmpty = DataServerQueryOuterClass.dataEmpty.newBuilder();
            DataServerQueryOuterClass.serverInfo serverInfo = stub.getServerInfo(dataEmpty.build());
            DataServerResource dataServerResource = new DataServerResource(serverInfo.getTotalMemory()/(1024*1024),serverInfo.getFreeMemory()/(1024*1024),serverInfo.getCores());
            DataServer dataServer = new DataServer(serverPorts[i],serverHosts[i], dataServerResource);
            TaskProcessor.addServer(dataServer);
            System.out.println("===========================================");
            System.out.println("Server "+serverHosts[i]+" Port "+serverPorts[i]);
            System.out.println("Cores in server: "+serverInfo.getCores());
            System.out.println("Free memory in server: "+serverInfo.getFreeMemory()/(1024*1024)+"Mb");
            System.out.println("Total memory in server: "+serverInfo.getTotalMemory()/(1024*1024)+"Mb");
            System.out.println("===========================================");
            channel.awaitTermination(1, TimeUnit.SECONDS);
            channel.shutdown();
        }
        server.start();
        System.out.println("Load Balancer started at port "+LoadBalancerConfig.port);
        server.awaitTermination();
    }
}
