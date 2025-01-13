package com.example.kapsejladseksamen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int raceID;
    private LocalDate date;
    private BoatType boatType;

}
