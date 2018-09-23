package com.packtup.junit.recap;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/* The TestName rule makes the current test name available inside test methods. 
 * The TestName rule can be used in conjunction with the TestWatcher rule to 
 * make a unit testing framework compile a unit testing report. The following 
 * test snippet shows that the test name is asserted inside the test. The 
 * TestName rule to get the method name before test execution.*/


public class _23_JUnit4_Test_Name_Rule  
{
	@Rule
	public TestName name = new TestName();

	@Test
	public void testA() 
	{
		assertEquals("testA", name.getMethodName());
	}

	@Test
	public void testB() 
	{
		assertEquals("testB", name.getMethodName());
	}
} 

