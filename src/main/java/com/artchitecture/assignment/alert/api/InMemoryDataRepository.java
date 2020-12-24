package com.artchitecture.assignment.alert.api;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryDataRepository implements DataRepository {

    Map<String,SensorData> DataMap = new HashMap<>();

    public InMemoryDataRepository(){
        SensorData data1 = new SensorData("1","2018-12-01 10:20:12","35C");
        DataMap.put("1",data1);
    }


    @Override
    public SensorData getData(String id) {
        return DataMap.get(id);
    }
}
