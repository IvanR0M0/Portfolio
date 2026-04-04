package com.portfolio_irf.portfolio_irf.service;

import com.portfolio_irf.portfolio_irf.model.LaboralExp;
import com.portfolio_irf.portfolio_irf.repository.ILaboralExpRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboralExpService {
    private ILaboralExpRepo ilbr;

    public LaboralExpService(ILaboralExpRepo ilbr){
        this.ilbr=ilbr;
    }

    public List<LaboralExp> findAll(){
        return ilbr.findAll();
    }

    public LaboralExp create(LaboralExp lb) {
        return ilbr.save(lb);
    }

}



