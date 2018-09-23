package com.packtup.junit.recap;

import static org.junit.Assert.assertTrue;
import org.junit.Assume;
import org.junit.Test;

/* We will assume that SONAR is not running. If SONAR does run during 
 * the test execution, the assumption will fail and the tests will be 
 * ignored.
 * Here, for simplicity, we added a isSonarRunning variable to replicate 
 * a SONAR server facade. In the actual code, we can call an API to get 
 * the value. We will set the variable to false. Then, in the test, we 
 * will reset the value to true. This means SONAR is running. So, 
 * our assumption that SONAR is not running is false; hence, the test 
 * will be ignored 
 * When we change the value of the isSonarRunning variable to false, as 
 * given in the following code snippet, the test will be executed */


public class _06_JUnit4_Validate_Assumptions_Using_Assume_Methods 
{
	boolean isSonarRunning = false;
	
	@Test 
	public void very_critical_test() throws Exception 
	{
		isSonarRunning = true;
		Assume.assumeFalse(isSonarRunning);
		assertTrue(true);
	}
}