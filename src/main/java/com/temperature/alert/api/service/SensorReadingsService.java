package com.temperature.alert.api.service;

import com.temperature.alert.api.model.SensorReadings;
import com.temperature.alert.api.repository.SensorReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SensorReadingsService {

    @Autowired
    SensorReadingsRepository sensorReadingsRepository;

    public List<SensorReadings> getReadingsById(int sensor_id){
        return sensorReadingsRepository.findBySensorId(sensor_id);
    }

    public SensorReadings getLatestReadings(){
        return sensorReadingsRepository.findLatestReading();
    }

}
