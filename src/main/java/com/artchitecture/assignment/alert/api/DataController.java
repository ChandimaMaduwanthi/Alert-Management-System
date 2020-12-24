package com.artchitecture.assignment.alert.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/data")
    public SensorData getData(@RequestParam String sensor_id){
        System.out.println("Getting data...Id: "+sensor_id);

        DataRepository dataRepository = new InMemoryDataRepository();
        SensorData sensorData = dataRepository.getData(sensor_id);
        return sensorData;
    }

}
