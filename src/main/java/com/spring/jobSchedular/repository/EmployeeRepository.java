package com.spring.jobSchedular.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.spring.jobSchedular.dto.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Integer> {

}
