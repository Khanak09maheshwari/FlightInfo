package com.flightInfo.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "flight_details")
public class FlightDetails {

    //create private fields
    @Id
    @Column(name = "flight_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "airline")
    private String airlineName;

    @Column(name = "flight_source")
    private String source;

    @Column(name = "flight_destination")
    private String destination;

    @Column(name = "dept_date")
    private LocalDate departureDate;

    @Column(name = "arr_date")
    private LocalDate arrivalDate;

    @Column(name = "dept_time")
    private LocalTime departureTime;

    @Column(name = "arr_time")
    private LocalTime arrivalTime;

    //onetoone mapping
    @OneToOne(cascade = CascadeType.ALL)
    private FareDetails fareDetails;

    public FareDetails getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(FareDetails fareDetails) {
        this.fareDetails = fareDetails;
    }

    //create constructor
    public FlightDetails(){}

    public FlightDetails(String airlineName, String source, String destination, LocalDate departureDate, LocalDate arrivalDate, LocalTime departureTime, LocalTime arrivalTime) {
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    //create getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }




    //create toString method


    @Override
    public String toString() {
        return "FlightDetails{" +
                "id=" + id +
                ", airlineName='" + airlineName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
