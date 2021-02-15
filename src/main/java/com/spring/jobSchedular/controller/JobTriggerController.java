package com.spring.jobSchedular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jobSchedular.service.JobTriggerService;

@RestController
@RequestMapping("/api/timer")
public class JobTriggerController {
	
	private final JobTriggerService service;

    @Autowired
    public JobTriggerController(JobTriggerService service) {
        this.service = service;
    }

    @PostMapping("/runhelloworld")
    public void runHelloWorldJob() {
        service.runHelloWorldJob();
    }
	

}
