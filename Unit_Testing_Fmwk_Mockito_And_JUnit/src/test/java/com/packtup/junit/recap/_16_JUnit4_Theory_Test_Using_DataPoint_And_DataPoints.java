package com.packtup.junit.recap;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/* JUnit theories are an alternative to JUnit's parameterized tests. A JUnit theory encapsulates 
 * the tester's understanding of an object's universal behavior. This means whatever a theory 
 * asserts is expected to be true for all data sets. Theories are useful for finding bugs in 
 * boundary-value cases. Theories are similar to parameterized tests—both allow us to specify the 
 * test data outside of the test case. Parameterized tests are good but they have the following 
 * drawbacks: Parameters are declared as member variables. They pollute the test class and unnecessarily 
 * make the system complex. Parameters need to be passed to the single constructor or variables need to 
 * be annotated, simply making the class incomprehensible. Test data cannot be externalised */

@RunWith(Theories.class)
public class _16_JUnit4_Theory_Test_Using_DataPoint_And_DataPoints 
{
	/* @DataPoint identifies a single set of test data (similar to @Parameters), 
	 * that is, either a static variable or a method */
	@DataPoint public static String jack ="Jack"; 
	@DataPoint public static String mike ="Mike";
	
	/* @DataPoints identifies multiple sets of test data, generally an array */
	@DataPoints  public static char[] chars = new char[] {'A', 'B', 'C'};
	
	/* @Theory identifies a theory test to run. If a theory method takes an argument 
	 * and a variable annotated with @DataPoint matches the type, then the variable 
	 * is passed to the theory during execution */
	@Theory 
	public void build(char c, char d) 
	{
		System.out.println(c + " " + d);
	}
	
	@Theory
	public void sanity(String firstName, String lastName) 
	{
		System.out.println("Sanity check " + firstName + ", " + lastName);
	}
}