package task.type;

import gash.obs.madis.MesonetData;
import gash.obs.madis.MesonetProcessor;
import generated.DataServerQueryOuterClass;
import io.grpc.stub.StreamObserver;
import task.config.AllRecordsConfig;

import java.util.List;

public class AllRecords implements TaskType{
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
    public void run(DataServerQueryOuterClass.query request, StreamObserver<DataServerQueryOuterClass.result> responseObserver) {
        System.out.println("Executed request");
        DataServerQueryOuterClass.result.Builder result = DataServerQueryOuterClass.result.newBuilder();
        result.setResponseMessage("Message received by server");
        result.setResponseStatus("200");
        List<MesonetData> dataList = MesonetProcessor.getData(AllRecordsConfig.dataSourceStr, AllRecordsConfig.catFStr, AllRecordsConfig.outdirStr,null);
        int size = dataList.size()>1000 ? 1000 : dataList.size();
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
        responseObserver.onNext(result.build());
        responseObserver.onCompleted();
    }
}
