package com.example.kapsejladseksamen.config;

import com.example.kapsejladseksamen.model.BoatType;
import com.example.kapsejladseksamen.model.Race;
import com.example.kapsejladseksamen.model.Result;
import com.example.kapsejladseksamen.model.Sailboat;
import com.example.kapsejladseksamen.repository.RaceRepository;
import com.example.kapsejladseksamen.repository.ResultRepository;
import com.example.kapsejladseksamen.repository.SailboatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
    public class InitData implements CommandLineRunner {

        @Autowired
        SailboatRepository sailboatRepository;

        @Autowired
        ResultRepository resultRepository;

        @Autowired
        RaceRepository raceRepository;


        @Override
        public void run(String... args) throws Exception {

            Sailboat sailboat = new Sailboat();
            sailboat.setBoatType(BoatType.LONGERTHAN40);
            sailboat.setBoatName("F24");
            sailboatRepository.save(sailboat);

            Sailboat sailboat2 = new Sailboat();
            sailboat2.setBoatType(BoatType.SMALLERTHAN25);
            sailboat2.setBoatName("Bæveren");
            sailboatRepository.save(sailboat2);

            Sailboat sailboat3 = new Sailboat();
            sailboat3.setBoatType(BoatType.FROM25TO40);
            sailboat3.setBoatName("Blå Svane");
            sailboatRepository.save(sailboat3);

            Sailboat sailboat4 = new Sailboat();
            sailboat4.setBoatType(BoatType.LONGERTHAN40);
            sailboat4.setBoatName("Hans peter");
            sailboatRepository.save(sailboat4);

            Sailboat sailboat5 = new Sailboat();
            sailboat5.setBoatType(BoatType.FROM25TO40);
            sailboat5.setBoatName("Prince of Denmark");
            sailboatRepository.save(sailboat5);

            Race race1 = new Race();
            race1.setBoatType(BoatType.LONGERTHAN40);
            race1.setDate(LocalDate.of(2024, 05, 3));
            raceRepository.save(race1);

            Race race2 = new Race();
            race2.setBoatType(BoatType.SMALLERTHAN25);
            race2.setDate(LocalDate.of(2024, 05, 3));
            raceRepository.save(race2);

            Race race3 = new Race();
            race3.setBoatType(BoatType.FROM25TO40);
            race3.setDate(LocalDate.of(2024, 05, 3));
            raceRepository.save(race3);

            Result result1 = new Result();
            result1.setRace(race1);
            result1.setSailboat(sailboat);
            result1.setPoints(1);
            result1.setPosition(1);
            resultRepository.save(result1);

            Result result2 = new Result();
            result2.setRace(race1);
            result2.setSailboat(sailboat2);
            result2.setPoints(2);
            result2.setPosition(2);
            resultRepository.save(result2);

            Result result3 = new Result();
            result3.setRace(race1);
            result3.setSailboat(sailboat3);
            result3.setPoints(3);
            result3.setPosition(3);
            resultRepository.save(result3);




        }
    }
