package com.example.kapsejladseksamen.repository;

import com.example.kapsejladseksamen.model.BoatType;
import com.example.kapsejladseksamen.model.Sailboat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SailboatRepository extends JpaRepository<Sailboat, Integer> {


    List<Sailboat> findByBoatType(BoatType boatType);
}
