package com.example.kapsejladseksamen.service;

import com.example.kapsejladseksamen.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;
}
