package com.portfolio_irf.portfolio_irf.controller;

import com.portfolio_irf.portfolio_irf.model.LaboralExp;
import com.portfolio_irf.portfolio_irf.service.LaboralExpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labExp")
public class LaboralExpController {

    @Autowired
    LaboralExpService lbs;

    @PostMapping("/")
    public LaboralExp create(@RequestBody LaboralExp laboralExp){
        return lbs.create(laboralExp);
    }

    @GetMapping("/")
    public List<LaboralExp> readAll(){
        return lbs.findAll();
    }

}
