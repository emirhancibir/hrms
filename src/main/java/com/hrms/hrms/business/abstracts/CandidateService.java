package com.hrms.hrms.business.abstracts;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.List;

public interface CandidateService {

    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate) throws ServiceException, RemoteException;

}
