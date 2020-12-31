package com.temperature.alert.api.repository;

import com.temperature.alert.api.model.SensorData;
import com.temperature.alert.api.model.SensorReadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SensorDataRepository extends JpaRepository<SensorData,Integer> {

    @Query("select s from SensorData s where s.sensor_id=:x")
    SensorData findBySensorId(@Param("x") int sensor_id);
}
