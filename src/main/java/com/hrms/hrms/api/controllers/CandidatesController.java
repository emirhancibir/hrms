package com.hrms.hrms.api.controllers;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.List;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {
    private final CandidateService candidateService;

    @Autowired
    public CandidatesController(CandidateService candidateService) {
        super();
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(Candidate candidate) throws ServiceException, RemoteException {
        return this.candidateService.add(candidate);
    }



}
