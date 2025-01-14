package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.model.BoatType;
import com.example.kapsejladseksamen.model.Sailboat;
import com.example.kapsejladseksamen.repository.SailboatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SailboatService {

    @Autowired
    private SailboatRepository sailboatRepository;

    public List<Sailboat> getAll(){
        return sailboatRepository.findAll();
    }

    public List<Sailboat> findByBoatType(BoatType boatType){
        return sailboatRepository.findByBoatType(boatType);
    }

    public ResponseEntity<Sailboat> addSailboat(Sailboat sailboat){
        Sailboat savedSailboat = sailboatRepository.save(sailboat);
        return new ResponseEntity<>(savedSailboat, HttpStatus.CREATED);
    }


    public ResponseEntity<Sailboat> deleteSailboat(int id){
        Optional<Sailboat> boatOptional = sailboatRepository.findById(id);
        if (boatOptional.isPresent()){
            sailboatRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Sailboat> updateSailboat(Sailboat sailboat, int id){
        Optional<Sailboat> boatOptional = sailboatRepository.findById(id);
        if (boatOptional.isPresent()){
            sailboat.setBoatID(id);
            sailboatRepository.save(sailboat);
            return new ResponseEntity<>(sailboat, HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
