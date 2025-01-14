package com.example.kapsejladseksamen.repository;

import com.example.kapsejladseksamen.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result,Integer> {

    List<Result> findResultBySailboatBoatID(int sailboatID);
    List<Result> findResultByRaceRaceID(int raceID);
}
