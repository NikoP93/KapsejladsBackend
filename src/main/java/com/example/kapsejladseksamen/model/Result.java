package com.example.kapsejladseksamen.model;

import jakarta.persistence.*;

@Entity
public class Result {

    @Id
    @GeneratedValue
    private int resultID;
    private int position;
    private int points;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "boatidfk", referencedColumnName = "boatID")
    private Sailboat sailboat;

    @ManyToOne
    @JoinColumn(name = "raceidfk", referencedColumnName = "raceID")
    private Race race;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status staus) {
        this.status = staus;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public Sailboat getSailboat() {
        return sailboat;
    }

    public void setSailboat(Sailboat sailboat) {
        this.sailboat = sailboat;
    }
}
