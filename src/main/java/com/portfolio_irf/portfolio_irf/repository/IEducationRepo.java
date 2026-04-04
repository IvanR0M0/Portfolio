package com.portfolio_irf.portfolio_irf.repository;

import com.portfolio_irf.portfolio_irf.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepo extends JpaRepository<Education, Integer>{
}
