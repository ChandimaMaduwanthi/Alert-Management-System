package com.temperature.alert.api.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "sensors")
public class SensorData {

    @Id
    private int sensor_id;
    private String threshold;

    public SensorData() {
    }

    public SensorData(int sensor_id, String threshold) {
        this.sensor_id = sensor_id;
        this.threshold = threshold;
    }

    public int getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(int sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

}
