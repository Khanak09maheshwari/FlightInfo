package com.flightInfo.service;

import com.flightInfo.dao.FlightDaoRepository;
import com.flightInfo.entity.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    private FlightDaoRepository flightDaoRepository;

    public FlightServiceImpl(FlightDaoRepository flightDaoRepository) {
        this.flightDaoRepository = flightDaoRepository;
    }

    @Autowired


    @Override
    public List<FlightDetails> findAll() {

        return flightDaoRepository.findAll();

    }

    @Override
    public FlightDetails findById(int theId) {

        Optional<FlightDetails> result = flightDaoRepository.findById(theId);

        FlightDetails flightDetails =result.get();

        return flightDetails;
    }

    @Override
    public FlightDetails save(FlightDetails flightDetails) {

        return flightDaoRepository.save(flightDetails);
    }

    @Override
    public void deleteById(int theId) {

        flightDaoRepository.deleteById(theId);
    }
}
