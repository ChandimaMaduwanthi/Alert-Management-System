package com.temperature.alert.api.repository;

import com.temperature.alert.api.model.SensorReadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorReadingsRepository extends JpaRepository<SensorReadings, Integer> {
    @Query("select r from SensorReadings r where r.sensor_id=:x")
    List<SensorReadings> findBySensorId(@Param("x") int sensor_id);
}
