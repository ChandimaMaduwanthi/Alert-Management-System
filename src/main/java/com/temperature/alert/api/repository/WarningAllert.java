package com.temperature.alert.api.repository;

import org.springframework.data.jpa.repository.Query;



public class WarningAllert {
    @Query(value = "SELECT * FROM tepperature WHERE threshold<data_value")

}
