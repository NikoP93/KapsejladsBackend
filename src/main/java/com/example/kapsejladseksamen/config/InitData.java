package com.example.kapsejladseksamen.config;

import com.example.kapsejladseksamen.model.BoatType;
import com.example.kapsejladseksamen.model.Sailboat;
import com.example.kapsejladseksamen.repository.SailboatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



    @Component
    public class InitData implements CommandLineRunner {

        @Autowired
        SailboatRepository sailboatRepository;


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


        }
    }
