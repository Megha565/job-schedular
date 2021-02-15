package com.spring.jobSchedular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jobSchedular.EmployeeDetailProxy;
import com.spring.jobSchedular.dto.Employee;
import com.spring.jobSchedular.repository.EmployeeRepository;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {
	
	@Autowired
	EmployeeDetailProxy employeeDetailProxy;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public int getAllEmployee() {
		List<Employee> employeeDetails = new ArrayList<>();
		/*get list of employee from database*/
		employeeDetails = employeeDetailProxy.getEmployeeList();
		/* save the list into elastic search*/
		employeeRepository.saveAll(employeeDetails);
		return employeeDetails.size();
	}

}
