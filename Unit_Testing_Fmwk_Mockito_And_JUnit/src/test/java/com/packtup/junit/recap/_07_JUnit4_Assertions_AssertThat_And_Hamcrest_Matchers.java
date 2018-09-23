package com.packtup.junit.recap;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/* a matcher enables a partial or an exact match for an expectation, whereas 
 * assertEquals uses an exact match. Matcher provides utility methods such as 
 * is, either, or, not , and hasItem. The Matcher methods use the builder 
 * pattern so that we can combine one or more matchers to build a composite
 * matcher chain. The following are a few examples of matchers and assertThat: 
 * assertThat(calculatedTax, is(not(thirtyPercent)) ); 
 * assertThat(phdStudentList, hasItem(DrJohn) ); 
 * assertThat(manchesterUnitedClub, both(is(EPL_Champion)).and(is(UEFA_Champions_League_Champion)) ); 
 * Using a matcher improves readability. Hamcrest provides a utility matcher class 
 * called org.hamcrest.CoreMatchers. A few utility methods of CoreMatchers are allOf, 
 * anyOf, both, either, describedAs, everyItem, is, isA, anything, hasItem, hasItems, 
 * equalTo, any, instanceOf, not, nullValue, notNullValue, sameInstance, theInstance, 
 * startsWith, endsWith, and containsString. All these methods return a matcher */


public class _07_JUnit4_Assertions_AssertThat_And_Hamcrest_Matchers
{
  @Test
  public void verify_Matcher() throws Exception 
  {
    int age = 30;
    assertThat(age, equalTo(30));
    assertThat(age, is(30));
    
    assertThat(age, not(equalTo(33)));
    assertThat(age, is(not(33)));
  }
}

/* The is(a) attribute takes a value and returns a Boolean and is the same as is(equalTo(a)) 
 * The not attribute takes a value or a matcher. In the preceding code, we used 
 * assertThat(age, is(not(33)));. This expression is more readable than the assert methods */
 