package com.flightInfo.controller;

import com.flightInfo.entity.FlightDetails;
import com.flightInfo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlightRestController {

    private FlightService flightService;

    @Autowired
    public FlightRestController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public List<FlightDetails> findAll(){
        return flightService.findAll();
    }

    @GetMapping("/flights/{flightId}")
    public FlightDetails findFlightById(@PathVariable int flightId){

        FlightDetails flightById = flightService.findById(flightId);
        return flightById;
    }

    @PostMapping("/flights")
    public FlightDetails addFlight(@RequestBody FlightDetails flightDetails){

        flightDetails.setId(0);
        FlightDetails dbFlight = flightService.save(flightDetails);
        return dbFlight;
    }

    @PutMapping("/flights")
    public FlightDetails updateFlight(@RequestBody FlightDetails flightDetails){

        FlightDetails dbFlight = flightService.save(flightDetails);
        return dbFlight;
    }

    @DeleteMapping("/flights/{flightId}")
    public String deleteFlight(@PathVariable int flightId){

        FlightDetails flight = flightService.findById(flightId);

        if(flight == null){
            throw new RuntimeException("Flight not found in database...");
        }

        flightService.deleteById(flightId);

        return "Deleted employee id: " +flightId;
    }

}
