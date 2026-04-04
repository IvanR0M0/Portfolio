package com.portfolio_irf.portfolio_irf.service;

import com.portfolio_irf.portfolio_irf.model.Project;
import com.portfolio_irf.portfolio_irf.repository.IProjectRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    private IProjectRepo ipr;

    public ProjectService(IProjectRepo ipr){
        this.ipr=ipr;
    }

    public List<Project> findAll(){
        return ipr.findAll();
    }

    public Project create(Project p) {
        return ipr.save(p);
    }

}

