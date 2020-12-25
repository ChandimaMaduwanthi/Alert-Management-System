package com.artchitecture.assignment.alert.api.service;

import com.artchitecture.assignment.alert.api.AlertData;
import com.artchitecture.assignment.alert.api.DataRepository;
import com.artchitecture.assignment.alert.api.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlertService {

    @Autowired
    private DataRepository dataRepository;

    Map<String, AlertData> AlertMap = new HashMap<>();

    public String getAlert(String sensor_id){

        String alertStatus;

        SensorData sensorData = dataRepository.getData(sensor_id);

        if (sensorData.getData_value() > 30){
            alertStatus = "Alert";
        }else {
            alertStatus = "Normal";
        }

        AlertData alertData = new AlertData(sensor_id,alertStatus,sensorData.getDate());
        AlertMap.put(sensor_id,alertData);
        return alertStatus;
    }

    public AlertData getAlertHistory(String sensor_id){
        String alertStatus = getAlert(sensor_id);
        return AlertMap.get(sensor_id);
    }
}
