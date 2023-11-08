package com.example.demo.controller;

import com.example.demo.model.YourEntity;
import com.example.demo.repository.YourEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class YourEntityController {

    @Autowired
    private YourEntityRepository repository;

    @GetMapping("/entities")
    public List<YourEntity> getEntitiesByAgeGreaterThan(@RequestParam int age) {
        return repository.findByAgeGreaterThan(age);
    }
}

