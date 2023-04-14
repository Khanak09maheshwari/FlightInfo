package com.flightInfo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fare_details")
public class FareDetails {
    //set private fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "eco_fare")
    private double economicalFare;

    @Column(name = "business_fare")
    private double businessFare;

    //create constructor
    public FareDetails(){}

    public FareDetails(double economicalFare, double businessFare) {
        this.economicalFare = economicalFare;
        this.businessFare = businessFare;
    }

    //create getter/setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEconomicalFare() {
        return economicalFare;
    }

    public void setEconomicalFare(double economicalFare) {
        this.economicalFare = economicalFare;
    }

    public double getBusinessFare() {
        return businessFare;
    }

    public void setBusinessFare(double businessFare) {
        this.businessFare = businessFare;
    }


    //create to string method


    @Override
    public String toString() {
        return "FareDetails{" +
                "id=" + id +
                ", economicalFare=" + economicalFare +
                ", businessFare=" + businessFare +
                '}';
    }
}
