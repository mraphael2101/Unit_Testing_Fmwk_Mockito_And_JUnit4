package com.packtup.junit.recap;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

class Factorial2
{
	public long factorial(long number) 
	{
		if(number == 0) 
			return 1;
		
		return number*factorial(number-1);
	}
}

@RunWith(Parameterized.class)
public class _14_JUnit4_Parameterized_Factorial_Test_Without_Constructor  
{
	/* To identify an individual test case in a parameterized test, a name is 
	 * required. The @Parameters annotation allows placeholders that are replaced 
	 * at runtime, and we can use them. The following are the placeholders: 
	 * {index}: This represents the current parameter index 
	 * {0}, {1},…: This represents the first, second, and so on, parameter values */
	@Parameters(name = "{index}: factorial({0})={1}")
	public static Collection<Object[]> factorialData() 
	{
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 },{ 6, 720 } });
	}

	
    /* Here, for each row in the data collection, the number variable will hold 
     * the 0th index of the array and the expectedResult variable will hold the 
     * 1st index */
	@Parameter(value=0)
    public int number;
    @Parameter(value=1)
    public int expectedResult;
	    

    @Test
    public void factorial() throws Exception 
    {
      Factorial2 fact = new Factorial2();
      assertEquals(fact.factorial(number) , expectedResult);
    }
}
