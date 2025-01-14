package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.model.Result;
import com.example.kapsejladseksamen.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public List<Result> getResultsByRaceID(int raceID) {
        return resultRepository.findResultByRaceRaceID(raceID);
    }
}
