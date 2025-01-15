package com.example.kapsejladseksamen.repository;

import com.example.kapsejladseksamen.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race,Integer> {

    Race findRaceByRaceID(int id);
}
