package com.artchitecture.assignment.alert.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {

    @Autowired
    private AlertService alertService;

    @GetMapping("/alert")
    AlertStatus getAlert(@RequestParam String sensor_id){
        return alertService.getAlert(sensor_id);
    }

}
