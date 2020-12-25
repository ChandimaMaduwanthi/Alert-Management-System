package com.artchitecture.assignment.alert.api.repository;

import com.artchitecture.assignment.alert.api.model.SensorData;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryDataRepository implements DataRepository {

    Map<String, SensorData> DataMap = new HashMap<>();

    public InMemoryDataRepository(){
        SensorData data1 = new SensorData("1", "1","2018-12-01 10:20:12",35);
        SensorData data2 = new SensorData("2", "2","2018-12-01 10:20:12",25);
        SensorData data3 = new SensorData("3", "1","2018-12-01 10:20:12",25);
        DataMap.put("1",data1);
        DataMap.put("2",data2);
        DataMap.put("3",data3);
    }


    @Override
    public SensorData getData(String id) {
        return DataMap.get(id);
    }

    @Override
    public void addData(SensorData sensorData) {
        DataMap.put(sensorData.getSensor_id(),sensorData);
    }
}
