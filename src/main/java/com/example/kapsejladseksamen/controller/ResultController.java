package com.example.kapsejladseksamen.controller;

import com.example.kapsejladseksamen.model.Result;
import com.example.kapsejladseksamen.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/results")
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    @GetMapping("/resultsbyraceid/{id}")
    public List<Result> getResultByRaceId(@PathVariable int id) {
        return resultService.getResultsByRaceID(id);
    }

}
