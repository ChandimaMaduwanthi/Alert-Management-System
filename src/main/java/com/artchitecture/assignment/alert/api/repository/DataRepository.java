package com.artchitecture.assignment.alert.api.repository;

import com.artchitecture.assignment.alert.api.model.SensorData;

public interface DataRepository {

    SensorData getData(String id);

    void addData(SensorData sensorData);
}
