package com.example.kapsejladseksamen.controller;

import com.example.kapsejladseksamen.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RaceController {

    @Autowired
    private RaceService raceService;


}
