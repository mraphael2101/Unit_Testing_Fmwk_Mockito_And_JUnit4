package com.packtup.junit.recap;

import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/* This code shows you how to assert a collection of values against a value or numerous 
 * values. Consider the following example. A salary list is populated with three values: 
 * 50.00, 200.00, and 500.00. Use hasItem to check whether a value exists in a collection, 
 * and use hasItems to check whether multiple values exist in a collection, as shown in 
 * the following code */


public class _09_JUnit4_Assertions_AssertThat_And_Collection_Matchers 
{
	@Test
	public void verify_collection_values() throws Exception 
	{
		List<Double> salary =Arrays.asList(50.0, 200.0, 500.0);

		assertThat(salary, hasItem(50.00));
		assertThat(salary, hasItems(50.00, 200.00));
		assertThat(salary, not(hasItem(1.00)));
	}
}
