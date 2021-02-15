package com.spring.jobSchedular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jobSchedular.dto.TimerInfo;
import com.spring.jobSchedular.util.EmpDetailJob;

@Service
public class JobTriggerService {
	
	private final SchedularService scheduler;

    @Autowired
    public JobTriggerService(final SchedularService scheduler) {
        this.scheduler = scheduler;
    }
    
    public void runHelloWorldJob() {
        final TimerInfo info = new TimerInfo();
        info.setTotalFireCount(2);
        info.setRemainingFireCount(info.getTotalFireCount());
        info.setRepeatIntervalMs(120000);
        info.setInitialOffsetMs(1000);
        info.setCallbackData("My callback data");
       // info.isRunForever();

        scheduler.schedule(EmpDetailJob.class, info);
    }

}
