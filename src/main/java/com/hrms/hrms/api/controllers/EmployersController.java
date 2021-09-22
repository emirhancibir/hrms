package com.hrms.hrms.api.controllers;

import java.util.List;

import com.hrms.hrms.business.abstracts.EmployerService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employers")
public class EmployersController {

	private final EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	} 
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
}
