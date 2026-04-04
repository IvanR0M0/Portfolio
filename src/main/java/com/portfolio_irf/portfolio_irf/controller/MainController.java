package com.portfolio_irf.portfolio_irf.controller;

import com.portfolio_irf.portfolio_irf.model.Education;
import com.portfolio_irf.portfolio_irf.model.LaboralExp;
import com.portfolio_irf.portfolio_irf.model.Project;
import com.portfolio_irf.portfolio_irf.service.EducationService;
import com.portfolio_irf.portfolio_irf.service.LaboralExpService;
import com.portfolio_irf.portfolio_irf.service.ProjectService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    private final ProjectService ps;
    private final LaboralExpService lbs;
    private final EducationService es;

    public MainController(ProjectService ps, LaboralExpService lbs, EducationService es){
        this.ps = ps;
        this.lbs = lbs;
        this.es = es;
    }

    @GetMapping("/")
    public String index(Model model){
        List<Project> projectList = ps.findAll();
        model.addAttribute("project",projectList);
        List<LaboralExp> laboralExpList = lbs.findAll();
        model.addAttribute("experiencias", lbs.findAll());

        List<Education> educationList = es.findAll();
        model.addAttribute("education", es.findAll());

        return "index";
    }

    @GetMapping("/projects")
    public String allProjects(Model model){
        List<Project> projectList = ps.findAll();
        model.addAttribute("projects", projectList);
        return "projects";
    }
}
