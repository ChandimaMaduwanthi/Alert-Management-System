package com.temperature.alert.api.service;

import com.temperature.alert.api.model.SensorData;
import com.temperature.alert.api.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    public List<SensorData> getSensorData(){
        return sensorDataRepository.findAll();
    }

    public SensorData getSensorById(int id){
        return sensorDataRepository.findBySensorId(id);
    }

}
