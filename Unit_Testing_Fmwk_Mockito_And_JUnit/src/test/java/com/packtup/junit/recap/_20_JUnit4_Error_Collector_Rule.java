package com.packtup.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.equalTo;

/* The ErrorCollector rule allows the execution of a test to continue after the 
 * first problem is found. A potential use for this library is to collect all the 
 * incorrect rows in a table and report them all at once. In the below example, none 
 * of the verification passes but the test still finishes its execution, and at the 
 * end, notifies all errors */

public class _20_JUnit4_Error_Collector_Rule  
{
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void fails_after_execution() 
	{
		collector.checkThat("a" , equalTo("b"));
		collector.checkThat(1   , equalTo(2));
		collector.checkThat("ae", equalTo("g"));
	}
} 


