package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import processor.QueryProcessor;
import queue.TaskQueue;
import server.config.DataServerConfig;
import services.DataServerQueryService;

import java.io.IOException;

public class DataServer {
    public static void main(String[] args) throws IOException, InterruptedException{
        TaskQueue taskQueue = new TaskQueue();
        QueryProcessor taskProcessor = new QueryProcessor(taskQueue, 5);
        taskProcessor.start();
        Server server = ServerBuilder.forPort(DataServerConfig.port)
                .addService(new DataServerQueryService(taskQueue))
                .build();
        server.start();
        System.out.println("Server started at port "+ DataServerConfig.port);
        server.awaitTermination();
    }
}
