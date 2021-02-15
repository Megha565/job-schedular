package com.spring.jobSchedular;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.jobSchedular.dto.Employee;

@FeignClient(name="employeeDetail", url = "http://localhost:8080")
public interface EmployeeDetailProxy {
	
	@GetMapping("/api/employees")
	public List<Employee> getEmployeeList();

}
