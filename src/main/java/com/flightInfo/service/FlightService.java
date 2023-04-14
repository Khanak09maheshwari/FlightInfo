package com.flightInfo.service;

import com.flightInfo.entity.FlightDetails;

import java.util.List;

public interface FlightService {

    List<FlightDetails> findAll();

    FlightDetails findById(int theId);

    FlightDetails save(FlightDetails flightDetails);

    void deleteById(int theId);
}
