package com.temperature.alert.api.controller;

import com.temperature.alert.api.model.SensorData;
import com.temperature.alert.api.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SensorDataController {

    @Autowired
    private SensorDataService sensorDataService;

    @GetMapping("/sensors")
    public List<SensorData> getSensorData(){
        return sensorDataService.getSensorData();
    }

    @GetMapping("/sensors/{id}")
    public SensorData getSensorById(@PathVariable int id){
        return sensorDataService.getSensorById(id);
    }

}
