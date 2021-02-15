package com.spring.jobSchedular.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jobSchedular.dto.TimerInfo;
import com.spring.jobSchedular.util.TimerUtil;

@Service
public class SchedularService {
	
	 private static final Logger LOG = LoggerFactory.getLogger(SchedularService.class);
	
	private final Scheduler scheduler;

    @Autowired
    public  SchedularService(final Scheduler scheduler) {
        this.scheduler = scheduler;
    }
    
    public <T extends Job> void schedule(final Class<T> jobClass, final TimerInfo info) {
        final JobDetail jobDetail = TimerUtil.buildJobDetail(jobClass, info);
        final Trigger trigger = TimerUtil.buildTrigger(jobClass, info);

        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            LOG.error(e.getMessage(), e);
        }
    }
    
    @PostConstruct
    public void init() {
        try {
            scheduler.start();
        } catch (SchedulerException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    @PreDestroy
    public void preDestroy() {
        try {
            scheduler.shutdown();
        } catch (SchedulerException e) {
            LOG.error(e.getMessage(), e);
        }
    }

}
