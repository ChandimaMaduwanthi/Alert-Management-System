package com.temperature.alert.api.controller;

import com.temperature.alert.api.model.AlertData;
import com.temperature.alert.api.repository.AlertDataRepository;
import com.temperature.alert.api.service.AlertDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlertDataController {

    @Autowired
    AlertDataRepository alertDataRepository;

    @Autowired
    AlertDataService alertDataService;

    @GetMapping("/alerts")
    public List<AlertData> getAlerts(){
        return alertDataRepository.findAll();
    }

    @GetMapping("/alerts/{sensor_id}")
    public List<AlertData> getAlertsById(@PathVariable int sensor_id){
        return alertDataService.getAlertsById(sensor_id);
    }
}
