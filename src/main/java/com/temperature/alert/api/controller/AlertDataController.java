package com.temperature.alert.api.controller;

import com.temperature.alert.api.model.AlertData;
import com.temperature.alert.api.service.AlertDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlertDataController {

    @Autowired
    AlertDataService alertDataService;

    @GetMapping("/alerts")
    public List<AlertData> getAlerts(){
        return alertDataService.getAlerts();
    }

    @GetMapping("/alerts/{sensor_id}")
    public List<AlertData> getAlertsById(@PathVariable int sensor_id){
        return alertDataService.getAlertsById(sensor_id);
    }

    @GetMapping("/alerts/latest")
    public AlertData getLatestReadings(){
        return alertDataService.getLatestAlert();
    }
}
