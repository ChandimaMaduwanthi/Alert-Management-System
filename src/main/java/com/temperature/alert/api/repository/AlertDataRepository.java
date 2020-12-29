package com.temperature.alert.api.repository;

import com.temperature.alert.api.model.AlertData;
import com.temperature.alert.api.model.SensorReadings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertDataRepository extends JpaRepository<AlertData,Integer> {
    @Query("select a from AlertData a where a.sensor_id=:x")
    List<AlertData> findBySensorId(@Param("x") int sensor_id);
}
