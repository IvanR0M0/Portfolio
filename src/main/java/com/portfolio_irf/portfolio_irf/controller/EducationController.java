package com.portfolio_irf.portfolio_irf.controller;

import com.portfolio_irf.portfolio_irf.model.Education;
import com.portfolio_irf.portfolio_irf.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    EducationService es;

    @PostMapping("/")
    public Education create(@RequestBody Education education){
        return es.create(education);
    }

    @GetMapping("/")
    public List<Education> findAll(){
        return es.findAll();
    }
}

