package com.artchitecture.assignment.alert.api;

public class SensorData {

    private String sensor_id;
    private String date;
    private String data_value;

    public SensorData(String sensor_id, String date, String data_value) {
        this.sensor_id = sensor_id;
        this.date = date;
        this.data_value = data_value;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
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
