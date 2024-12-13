package com.example.kapsejladseksamen.controller;

import com.example.kapsejladseksamen.model.Sailboat;
import com.example.kapsejladseksamen.service.SailboatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class SailboatController {

    @Autowired
    private SailboatService sailboatService;

    @GetMapping("/sailboats")
    public List<Sailboat> getAllSailboats() {
        return sailboatService.getAll();
    }

    @PostMapping("/sailboat")
    public ResponseEntity<Sailboat> addSailboat(@RequestBody Sailboat sailboat) {
        return sailboatService.addSailboat(sailboat);
    }

    @DeleteMapping("/sailboat{id}")
    public ResponseEntity<Sailboat> deleteSailboat(@PathVariable int id) {
        return sailboatService.deleteSailboat(id);
    }

    @PutMapping("/sailboat{id}")
    public ResponseEntity<Sailboat> updateSailboat(@PathVariable int id, @RequestBody Sailboat sailboat) {
        return sailboatService.updateSailboat(sailboat,id);
    }

}
