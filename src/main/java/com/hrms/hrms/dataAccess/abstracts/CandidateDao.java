package com.hrms.hrms.dataAccess.abstracts;

import com.hrms.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
