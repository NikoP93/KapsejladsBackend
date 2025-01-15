package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.model.Race;
import com.example.kapsejladseksamen.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;

    public List<Race> getAllRaces(){
        return raceRepository.findAll();
    }

    public Race getRaceById(int id){
        return raceRepository.findRaceByRaceID(id);
    }
}
