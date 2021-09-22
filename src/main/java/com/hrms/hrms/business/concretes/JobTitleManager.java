package com.hrms.hrms.business.concretes;

import java.util.List;

import com.hrms.hrms.business.abstracts.JobTitleService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccesDataResult;
import com.hrms.hrms.core.utilities.results.SuccesResult;
import com.hrms.hrms.dataAccess.abstracts.JobTitleDao;
import com.hrms.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class JobTitleManager implements JobTitleService {

	private final JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccesDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Data basarili bir sekilde listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccesResult("İs basligi eklendi");
	}

	@Override
	public Result delete(JobTitle jobTitle) {
		this.jobTitleDao.deleteById(jobTitle.getId());
		return new SuccesResult("İs basligi cikarildi");
	}

}
