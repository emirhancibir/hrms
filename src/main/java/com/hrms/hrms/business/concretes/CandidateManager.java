package com.hrms.hrms.business.concretes;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccesDataResult;
import com.hrms.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private final CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao){
        super();
        this.candidateDao = candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccesDataResult<>(this.candidateDao.findAll(),"Data basarili bir sekilde listelendi");
    }
}
