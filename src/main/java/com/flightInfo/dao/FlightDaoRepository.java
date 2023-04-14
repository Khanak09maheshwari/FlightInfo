package com.flightInfo.dao;

import com.flightInfo.entity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDaoRepository extends JpaRepository<FlightDetails , Integer> {
    //no need to write code here
}
