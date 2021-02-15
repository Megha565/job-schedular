package com.spring.jobSchedular.dto;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="employeejob2",type="employee",shards=2)

public class Employee implements Serializable {


private int id;
private String firstName;
private String lastname;
private String email;
private int deptId;
private String deptname;
private Department department;

public Employee() {
	
}

public Employee( String firstName, String lastname, String email) {
	super();
	
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
}



public Employee(int id, String firstName, String lastname, String email, int deptId, String deptname,
		Department department) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
	this.deptId = deptId;
	this.deptname = deptname;
	this.department = department;
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

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + "]";
}




}
