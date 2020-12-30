package com.temperature.alert.api.controller;

import com.temperature.alert.api.model.SensorReadings;
import com.temperature.alert.api.repository.SensorReadingsRepository;
import com.temperature.alert.api.service.SensorReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SensorReadingsController {

    @Autowired
    SensorReadingsRepository sensorReadingsRepository;

    @Autowired
    SensorReadingsService sensorReadingsService;


    @GetMapping("/readings")
    public List<SensorReadings> getReadings() {
        return sensorReadingsRepository.findAll();
    }

    @GetMapping("/readings/{sensor_id}")
    public List<SensorReadings> getReadingsById(@PathVariable int sensor_id){
        return sensorReadingsService.getReadingsById(sensor_id);
    }

    @GetMapping("/readings/latest")
    public SensorReadings getLatestReadings(){
        return sensorReadingsService.getLatestReadings();
    }

}
