package com.spring.jobSchedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobSchedularApplication.class, args);
	}

}
