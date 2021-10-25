package task.type;

import gash.obs.madis.MesonetData;
import gash.obs.madis.MesonetProcessor;
import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import task.config.AllRecordsConfig;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
       System.out.println("Executed request");
        System.out.println("test");
        DataServerQueryOuterClass.result.Builder result = DataServerQueryOuterClass.result.newBuilder();
        Set<String> stationIds = new HashSet<>();
        stationIds.add(request.getStationId());
        System.out.println("StationID"+request.getStationId());
        List<MesonetData> dataList = MesonetProcessor.getData(AllRecordsConfig.dataSourceStr, AllRecordsConfig.catFStr, AllRecordsConfig.outdirStr,stationIds);
        System.out.println("datasize"+dataList.size());
        int size = Math.min(dataList.size(), 1000);
        for(int i=0;i<size;i++){
            MesonetData data = dataList.get(i);
            DataServerQueryOuterClass.record.Builder record = DataServerQueryOuterClass.record.newBuilder();
            record.setStationId(data.getStationID().toString());
            record.setWindDirection(data.getWindDir().toString());
            record.setRelHumidity(data.getRelHumidity().toString());
            record.setTemperature(data.getTemperature().toString());
            record.setWindSpeed(data.getWindSpeed().toString());
            result.addRecords(record.build());
        }
        result.setResponseMessage("Message received by server");
        result.setResponseStatus("200");
        responseObserver.onNext(result.build());
        responseObserver.onCompleted();
    }
}
