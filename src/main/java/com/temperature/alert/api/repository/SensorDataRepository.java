package com.temperature.alert.api.repository;

import com.temperature.alert.api.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorData,Integer> {
//    SensorData findSensorById(int id);
}
