package com.packtup.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;
import static org.junit.Assert.assertNull;

/* Verifier is a base class of ErrorCollector, which can otherwise turn passing tests into 
 * failing tests if a verification check fails. The following example demonstrates the 
 * Verifier rule. Verifier's verify method is executed after each test execution. If the 
 * verify method defines any assertions, and that assertion fails, then the test is marked 
 * as failed. In the below example, the test should not fail as the test method doesn't 
 * perform any comparison; however, it still fails. It fails because the Verifier rule checks 
 * that after every test execution, the errorMsg string should be set as null, but the test 
 * method sets the value to Giving a value; hence, the verification fails. */


public class _21_JUnit4_Verifier_Rule_IMPORTANT  
{
	private String errorMsg = null;

	@Rule
	public TestRule rule = new Verifier() 
	{
		protected void verify() 
		{
			assertNull("ErrorMsg should be null after each test execution" , errorMsg);
		}
	};

	@Test
	public void testName() throws Exception 
	{
		errorMsg = "Giving a value";
	}
} 