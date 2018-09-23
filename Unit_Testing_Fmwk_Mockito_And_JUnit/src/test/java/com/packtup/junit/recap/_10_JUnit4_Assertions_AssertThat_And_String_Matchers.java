package com.packtup.junit.recap;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/* String matcher operates on String only. Note that startsWith, endsWith, and 
 * containsStrings are not the only string matchers. Other built-in matchers 
 * such as both, either, anyOf, and so on, can be applied to a String object.
 *  JUnitMatchers has built-in matcher methods, but all of these methods are 
 *  deprecated. Use Hamcrest matchers instead of using JUnitMatcher */


public class _10_JUnit4_Assertions_AssertThat_And_String_Matchers 
{
	@Test
	public void verify_Strings() throws Exception 
	{
		String name = "John Jr Dale";
		assertThat(name, startsWith("John"));
		assertThat(name, endsWith("Dale"));
		assertThat(name, containsString("Jr"));
	}	
}
