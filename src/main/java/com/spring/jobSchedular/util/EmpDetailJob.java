package com.spring.jobSchedular.util;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jobSchedular.controller.EmployeeDetailController;

@Component
public class EmpDetailJob implements Job {
	
	@Autowired
	public EmployeeDetailController employeeDetailController;

	private static final Logger LOG = LoggerFactory.getLogger(EmpDetailJob.class);
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
			
	 	employeeDetailController.getEmployeeList();
		
	}

}
