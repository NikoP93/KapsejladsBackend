package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.model.Result;
import com.example.kapsejladseksamen.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<Result> deleteResult(int id) {
        Optional<Result> result = resultRepository.findById(id);
        if (result.isPresent()) {
            resultRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Result> updateResult(int id, Result result) {
        Optional<Result> resultOptional = resultRepository.findById(id);
        if (resultOptional.isPresent()) {
            result.setResultID(id);
            resultRepository.save(result);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Result> addResult(Result result) {
        Result savedResult = resultRepository.save(result);
        return new ResponseEntity<>(savedResult, HttpStatus.OK);

    }


}
