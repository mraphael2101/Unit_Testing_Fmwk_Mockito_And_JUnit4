package com.packtup.junit.recap;

import static org.junit.Assert.*;

import org.junit.Test;

/* JUnit tests are automated to get quick feedback after a change in the code. If a 
 * test runs for a long time, it violates the quick feedback principle. JUnit provides 
 * a timeout value (in milliseconds) in the @Test annotation to make sure that if a 
 * test runs longer than the specified value, the test fails. The following is an 
 * example of a timeout */


public class _15_JUnit4_Test_Timeout_For_Individual_Test_Method 
{
	@Test(timeout=10)
	public void forEver() throws Exception 
	{
		Thread.sleep(100);
	}
}
