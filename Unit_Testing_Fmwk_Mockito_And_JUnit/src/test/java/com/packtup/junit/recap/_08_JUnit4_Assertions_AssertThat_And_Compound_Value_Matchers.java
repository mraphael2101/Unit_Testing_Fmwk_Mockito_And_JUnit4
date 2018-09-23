package com.packtup.junit.recap;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/* Assert the initialized variable with an either matcher to compare two values against an 
 * actual or calculated value. If any of them match, then the assertion is passed. If none 
 * of them match, then AssertionError is thrown. The either(Matcher) method takes a matcher 
 * and returns a CombinableEitherMatcher class. The CombinableEitherMatcher class has a 
 * or(Matcher other) method so that either and or can be combined. The or(Matcher other) method 
 * is translated to return (new CombinableMatcher(first)).or(other); and finally to new 
 * CombinableMatcher(new AnyOf(templatedListWith(other)));. Using both, we can compare two values 
 * against an actual or calculated value. If any of them don't match, then the AssertionError 
 * exception is thrown. The allOf matcher is more like both with multiple values. Using allOf, 
 * we can compare multiple values against an actual or calculated value. If any of them don't match, 
 * then the AssertionError exception is thrown. Similar to both, we can use allOf along with not 
 * to check whether a value does or doesn't belong to a set. In the preceding example, using allOf 
 * and not, we checked whether the marks attribute is not 1, 100, or 30 */


public class _08_JUnit4_Assertions_AssertThat_And_Compound_Value_Matchers 
{
	@Test
	public void verify_multiple_values() throws Exception 
	{
		double marks = 100.00;
		
		assertThat(marks, either(is(100.00)).or(is(90.9)));

		assertThat(marks, both(not(99.99)).and(not(60.00)));

		assertThat(marks, anyOf(is(100.00),is(1.00),is(55.00),is(88.00),is(67.8)));

		assertThat(marks, not(anyOf(is(0.00),is(200.00))));

		assertThat(marks, not(allOf(is(1.00),is(100.00), is(30.00))));
	}
}
