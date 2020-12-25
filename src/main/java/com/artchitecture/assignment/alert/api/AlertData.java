package com.artchitecture.assignment.alert.api;

public class AlertData {

    private String sensor_id;
    private AlertStatus alertStatus;
    private String date;

    public AlertData(String sensor_id, AlertStatus alertStatus,String date) {
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

    public AlertStatus getAlertStatus() {
        return alertStatus;
    }

    public void setAlertStatus(AlertStatus alertStatus) {
        this.alertStatus = alertStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
