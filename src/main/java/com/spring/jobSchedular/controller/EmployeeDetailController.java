package com.spring.jobSchedular.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jobSchedular.dto.Employee;
import com.spring.jobSchedular.service.EmployeeDetailService;
import com.spring.jobSchedular.util.EmpDetailJob;



@RestController

public class EmployeeDetailController {
	
	@Autowired
	public EmployeeDetailService employeeDetailService;
	
	private static final Logger LOG = LoggerFactory.getLogger(EmpDetailJob.class);
	
	public int getEmployeeList(){
		LOG.info("entered inside EmployeeDetailController::getEmployeeList");
		int empList = 0;
		empList = employeeDetailService.getAllEmployee();
		LOG.info("before leaving EmployeeDetailController::getEmployeeList");
		return empList;
	}

}
