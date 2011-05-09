package com.camechis.sample.batch.gridgain;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/applicationContext.xml"})
public class GridGainIntegrationTest {

	@Autowired
	private Job job;
	
	@Autowired JobLauncher jobLauncher;
	
	@Test
	public void testJob( ) throws Exception {
		JobParametersBuilder builder = new JobParametersBuilder();
		builder.addDate("date", new Date());
		jobLauncher.run(job, builder.toJobParameters() );
		
	}
	
}
