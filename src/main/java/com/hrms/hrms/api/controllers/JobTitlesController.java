package com.hrms.hrms.api.controllers;

import java.util.List;

import com.hrms.hrms.business.abstracts.JobTitleService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

	private final JobTitleService jobTitleService;

	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll() {
		return this.jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.delete(jobTitle);
	}
}
