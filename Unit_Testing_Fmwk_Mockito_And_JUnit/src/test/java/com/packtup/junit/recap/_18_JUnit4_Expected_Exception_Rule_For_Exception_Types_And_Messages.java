package com.packtup.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/* The ExpectedException rule allows you to assert the expected exception type and the 
 * exception message. The following code snippet verifies the exception class and the 
 * exception message. The expect object sets the expected exception class and expectMessage 
 * sets the expected message in the exception. If the message or exception class doesn't 
 * match the rule's expectation, the test fails. The ExpectedException object thrown is 
 * reset on each test */

public class _18_JUnit4_Expected_Exception_Rule_For_Exception_Types_And_Messages 
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void throwsNothing() {}

	@Test
	public void throwsNullPointerException() 
	{
		thrown.expect(NullPointerException.class);
		throw new NullPointerException();
	}

	@Test
	public void throwsIllegalStateExceptionWithMessage() 
	{
		thrown.expect(IllegalStateException.class);
		thrown.expectMessage("Is this a legal state?");

		throw new IllegalStateException("Is this a legal state?");
	}
} 