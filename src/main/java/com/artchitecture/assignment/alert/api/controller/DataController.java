package com.artchitecture.assignment.alert.api.controller;

import com.artchitecture.assignment.alert.api.repository.DataRepository;
import com.artchitecture.assignment.alert.api.model.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataController {

    DataRepository dataRepository;

    @Autowired
    public DataController(DataRepository dataRepository){
        this.dataRepository = dataRepository;
    }

    @GetMapping("/data")
    public SensorData getData(@RequestParam String sensor_id){
        System.out.println("Getting data...Id: "+sensor_id);

        SensorData sensorData = dataRepository.getData(sensor_id);
        return sensorData;
    }

//    @PostMapping("/data")
//    public void addData(@RequestBody SensorData sensorData){
//        System.out.println("Adding data");
//        dataRepository.addData(sensorData);
//    }

}
