package com.temperature.alert.api.service;

import com.temperature.alert.api.model.AlertData;
import com.temperature.alert.api.model.SensorReadings;
import com.temperature.alert.api.repository.AlertDataRepository;
import com.temperature.alert.api.repository.SensorReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertDataService {

    @Autowired
    AlertDataRepository alertDataRepository;

    public List<AlertData> getAlerts(){
        return alertDataRepository.findAll();
    }

    public List<AlertData> getAlertsById(int sensor_id){
        return alertDataRepository.findBySensorId(sensor_id);
    }

    public AlertData getLatestAlert(){
        return alertDataRepository.findLatestAlert();
    }
}
