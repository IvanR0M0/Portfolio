package com.portfolio_irf.portfolio_irf.service;

import com.portfolio_irf.portfolio_irf.model.Education;
import com.portfolio_irf.portfolio_irf.repository.IEducationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    private IEducationRepo ier;

    public EducationService(IEducationRepo ier){
        this.ier=ier;
    }

    public List<Education> findAll(){
        return ier.findAll();
    }
    public Education create(Education e){
        return ier.save(e);
    }
}
