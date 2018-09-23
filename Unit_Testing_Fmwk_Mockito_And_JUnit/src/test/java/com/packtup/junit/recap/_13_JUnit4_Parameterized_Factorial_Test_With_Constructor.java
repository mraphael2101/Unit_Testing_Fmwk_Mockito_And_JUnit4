package com.packtup.junit.recap;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

class Factorial
{
	public long factorial(long number) 
	{
		if(number == 0) 
			return 1;
		
		return number*factorial(number-1);
	}
}

/* Parameterized tests are used to perform multiple iterations over a single 
 * input to stress the object under test and reduce the amount of test code. 
 * The JUnit 4 framework has a Parameterized runner which can be used with 
 * the @RunWith annotation */

@RunWith(Parameterized.class)
public class _13_JUnit4_Parameterized_Factorial_Test_With_Constructor 
{
	@Parameters
	public static Collection<Object[]> factorialData() 
	{
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 },{ 6, 720 } });
	}

    /* The Parameterized runner needs a constructor to pass the collection of 
     * data. For each row in the collection, the 0th array element will be 
     * passed as the 1st constructor argument, the next index will be passed 
     * as 2nd argument, and so on. In the test class, we added two members to 
     * hold the number and the expected factorial value. In the constructor, 
     * set these values. The Parameterized runner will loop through the data 
     * collection (annotated with a @Parameters annotation) and pass the 
     * values to the constructor */
	
	private int number, expectedResult;
    
    public _13_JUnit4_Parameterized_Factorial_Test_With_Constructor(int input, int expected) 
    {
        number = input;
        expectedResult = expected;
    }
    
    // Below is the test method to assert the number and factorial as follows: 
    @Test
    public void factorial() throws Exception 
    {
      Factorial fact = new Factorial();
      assertEquals(fact.factorial(number) , expectedResult);
    }
}

