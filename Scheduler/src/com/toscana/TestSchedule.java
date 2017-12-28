package com.toscana;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class TestSchedule {

	public static void main(String[] args) {
		try {
			// Grab the Scheduler instance from the Factory
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			// define the job and tie it to our HelloJob class
			JobDetail job = JobBuilder.newJob(TestJob.class).withIdentity("testJob").build();

			// Trigger the job to run on the next round minute
			Trigger trigger = TriggerBuilder.newTrigger()
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(30).repeatForever())
					.build();
			// CronTrigger the job to run on the every 20 seconds
			CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("crontrigger", "crontriggergroup1")
					.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ? *")).build();

			SchedulerFactory schFactory = new StdSchedulerFactory();
			Scheduler sch = schFactory.getScheduler();

			// and start it off
			scheduler.start();

			// Tell quartz to schedule the job using the trigger
			sch.scheduleJob(job, cronTrigger);
			//sch.scheduleJob(job, trigger);

			// scheduler.shutdown();

		} catch (SchedulerException se) {
			se.printStackTrace();
		}

	}

}
