package com.portfolio_irf.portfolio_irf.controller;

import com.portfolio_irf.portfolio_irf.model.Project;
import com.portfolio_irf.portfolio_irf.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/projt")
public class ProjectController {
    @Autowired
    ProjectService ps;

    @PostMapping("/")
    public Project create(@RequestBody Project project){
        return ps.create(project);
    }

    @GetMapping("/")
    public List<Project> readAll(){
        return ps.findAll();
    }

}
