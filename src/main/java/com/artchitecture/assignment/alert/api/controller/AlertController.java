package com.artchitecture.assignment.alert.api.controller;

import com.artchitecture.assignment.alert.api.model.AlertData;
import com.artchitecture.assignment.alert.api.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {

    @Autowired
    private AlertService alertService;

    @GetMapping("/alertHistory")
    public AlertData getAlertHistory(@RequestParam String sensor_id){
        AlertData alertData = alertService.getAlertHistory(sensor_id);

        if (alertData.getAlertStatus().equals("Alert")){
            System.out.println("Send notifications");
        }
        return alertData;
    }

}
