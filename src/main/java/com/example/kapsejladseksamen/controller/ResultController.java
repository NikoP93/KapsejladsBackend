package com.example.kapsejladseksamen.controller;

import com.example.kapsejladseksamen.model.Result;
import com.example.kapsejladseksamen.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/result/{id}")
    public ResponseEntity<Result> deleteResult(@PathVariable int id) {
        return resultService.deleteResult(id);
    }

    @PutMapping("/result/{id}")
    public ResponseEntity<Result> updateResult(@RequestBody Result result, @PathVariable int id) {
        return resultService.updateResult(id,result);
    }

    @PostMapping("/result")
    public ResponseEntity<Result> addResult(@RequestBody Result result) {
        return resultService.addResult(result);
    }

}
