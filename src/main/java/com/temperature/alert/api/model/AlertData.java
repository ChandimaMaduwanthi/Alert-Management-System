package com.temperature.alert.api.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "alerts")
public class AlertData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int sensor_id;
    private String date;
    private String data_value;

    public AlertData() {
    }

    public AlertData(int sensor_id, String date, String data_value) {
        this.sensor_id = sensor_id;
        this.date = date;
        this.data_value = data_value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(int sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }
}
