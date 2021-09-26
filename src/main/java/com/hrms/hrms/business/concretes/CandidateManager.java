package com.hrms.hrms.business.concretes;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.core.adapters.abstracts.MernisService;
import com.hrms.hrms.core.adapters.concretes.MernisServiceAdapter;
import com.hrms.hrms.core.utilities.results.*;
import com.hrms.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
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

    @Override
    public Result add(Candidate candidate) throws ServiceException, RemoteException {
        MernisServiceAdapter mernisService = new MernisServiceAdapter();
        boolean result = mernisService.checkIfRealPerson(candidate.getIdentityNumber(),candidate.getFirstName(),candidate.getLastName(),candidate.getBirthYear());
        if (result){
            this.candidateDao.save(candidate);
            return new SuccesResult("İş arayan mernis ile doğrulandı ve sisteme eklendi");
        }else {
            return new ErrorResult("Doğrulama gecersiz");
        }
    }
}
