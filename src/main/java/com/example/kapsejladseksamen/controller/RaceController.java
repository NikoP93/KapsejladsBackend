package com.example.kapsejladseksamen.controller;

import com.example.kapsejladseksamen.model.Race;
import com.example.kapsejladseksamen.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RaceController {

    @Autowired
    RaceService raceService;

    @GetMapping("/races")
    public List<Race> getAllRaces() {
       return raceService.getAllRaces();
    }

    @GetMapping("/race/{id}")
    public Race getRaceById(@PathVariable int id) {
        return raceService.getRaceById(id);
    }


}
