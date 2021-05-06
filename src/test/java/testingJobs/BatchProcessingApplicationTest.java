package testingJobs;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.batchprocessing.BatchProcessingApplication;

@SpringBatchTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=BatchProcessingApplication.class)
public class BatchProcessingApplicationTest {

	
	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;
	
	@Test
	public void ExecutaJobCompleted() {
        JobExecution jobExecution = jobLauncherTestUtils.launchStep("step1");
        Assert.assertEquals("FAILED", jobExecution.getExitStatus().getExitCode());
	}
	 /* Exit codes:
	 * <ul>
	 * <li>Codes beginning with EXECUTING have severity 1</li>
	 * <li>Codes beginning with COMPLETED have severity 2</li>
	 * <li>Codes beginning with NOOP have severity 3</li>
	 * <li>Codes beginning with STOPPED have severity 4</li>
	 * <li>Codes beginning with FAILED have severity 5</li>
	 * <li>Codes beginning with UNKNOWN have severity 6</li>
	 */
	
}
