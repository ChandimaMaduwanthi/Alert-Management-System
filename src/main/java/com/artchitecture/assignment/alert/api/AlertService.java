package com.artchitecture.assignment.alert.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    @Autowired
    private DataRepository dataRepository;

    public AlertStatus getAlert(String sensor_id){
        AlertStatus alertStatus = new AlertStatus();

        SensorData sensorData = dataRepository.getData(sensor_id);

        if (sensorData.getData_value() > 30){
            alertStatus.setAlertLevel("Alert");
        }else {
            alertStatus.setAlertLevel("Normal");
        }

        return alertStatus;
    }
}
