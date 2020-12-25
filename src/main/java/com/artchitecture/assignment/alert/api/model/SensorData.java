package com.artchitecture.assignment.alert.api.model;

public class SensorData {

    private String id;
    private String sensor_id;
    private String date;
    private int data_value;

    public SensorData(String id, String sensor_id, String date, int data_value) {
        this.id = id;
        this.sensor_id = sensor_id;
        this.date = date;
        this.data_value = data_value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getData_value() {
        return data_value;
    }

    public void setData_value(int data_value) {
        this.data_value = data_value;
    }
}
