package com.packtup.junit.recap;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* The code below is an example of how to build your own matchers to use in assertThat. 
 * In this example, we compare two values and return true only if the actual object 
 * is less than or equal to the expected value? */

public class _11_JUnit4_Building_A_Custom_Matcher_LessThanOrEqual<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> 
{
	private final Comparable<T> expectedValue;
	
	public _11_JUnit4_Building_A_Custom_Matcher_LessThanOrEqual(T expectedValue) 
	{
		super();
		this.expectedValue = expectedValue;
	}

	@Override
	public void describeTo(Description description) 
	{
		description.appendText(" less than or equals(<=) "+expectedValue);
	}

	@Override
	public boolean matches(Object t) 
	{
		int compareTo = expectedValue.compareTo((T)t);
		return compareTo > -1;
	}

	@Factory
	public static<T extends Comparable<T>>  Matcher<T> lessThanOrEqual(T t) 
	{
		return new _11_JUnit4_Building_A_Custom_Matcher_LessThanOrEqual(t);
	}
}
