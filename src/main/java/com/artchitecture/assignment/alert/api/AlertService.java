package com.artchitecture.assignment.alert.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlertService {

    @Autowired
    private DataRepository dataRepository;

    Map<String,AlertData> AlertMap = new HashMap<>();

    public AlertStatus getAlert(String sensor_id){
        AlertStatus alertStatus = new AlertStatus();

        SensorData sensorData = dataRepository.getData(sensor_id);

        if (sensorData.getData_value() > 30){
            alertStatus.setAlertLevel("Alert");
        }else {
            alertStatus.setAlertLevel("Normal");
        }

        AlertData alertData = new AlertData(sensor_id,alertStatus,sensorData.getDate());
        AlertMap.put(sensor_id,alertData);
        return alertStatus;
    }

    public AlertData getAlertHistory(String sensor_id){
        return AlertMap.get(sensor_id);
    }
}
