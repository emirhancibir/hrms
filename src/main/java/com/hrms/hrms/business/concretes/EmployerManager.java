package com.hrms.hrms.business.concretes;

import java.util.List;

import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.SuccesDataResult;
import com.hrms.hrms.dataAccess.abstracts.EmployerDao;
import com.hrms.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerManager implements EmployerService {

	private final EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccesDataResult<>(this.employerDao.findAll(), "Data basarili bir sekilde listelendi");
	}

}
