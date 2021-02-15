package com.spring.jobSchedular.dto;

import java.util.List;



public class Department {
	
	
	private int deptId;
	
	
	private String deptname;
	
	  private List<Employee> employees;

	public Department(int deptId, String deptname) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
	}
	
	

	public Department() {
		
	}



	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	 
	 

}
