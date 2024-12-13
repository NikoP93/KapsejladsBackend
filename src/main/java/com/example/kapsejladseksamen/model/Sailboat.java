package com.example.kapsejladseksamen.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sailboat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boatID;
    private BoatType boatType;
    private String boatName;

    public int getBoatID() {
        return boatID;
    }

    public void setBoatID(int boatID) {
        this.boatID = boatID;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public BoatType getBoatType() {
        return boatType;
    }

    public void setBoatType(BoatType boatType) {
        this.boatType = boatType;
    }
}
