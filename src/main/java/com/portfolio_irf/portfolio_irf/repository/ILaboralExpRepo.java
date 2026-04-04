package com.portfolio_irf.portfolio_irf.repository;

import com.portfolio_irf.portfolio_irf.model.LaboralExp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaboralExpRepo extends JpaRepository<LaboralExp, Integer> {
}



