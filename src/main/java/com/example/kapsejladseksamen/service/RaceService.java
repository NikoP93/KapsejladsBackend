package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {

    @Autowired
    private RaceRepository raceRepository;
}
