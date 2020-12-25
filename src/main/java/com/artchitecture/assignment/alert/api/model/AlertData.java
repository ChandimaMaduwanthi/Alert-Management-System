package com.artchitecture.assignment.alert.api.model;

public class AlertData {

    private String sensor_id;
    private String alertStatus;
    private String date;

    public AlertData(String sensor_id, String alertStatus,String date) {
        this.sensor_id = sensor_id;
        this.alertStatus = alertStatus;
        this.date = date;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getAlertStatus() {
        return alertStatus;
    }

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
