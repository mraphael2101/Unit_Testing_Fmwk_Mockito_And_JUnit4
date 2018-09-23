package com.packtup.junit.recap;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static com.packtup.junit.recap._11_JUnit4_Building_A_Custom_Matcher_LessThanOrEqual.lessThanOrEqual;

/* Reference page 30 for details about how this has been designed */

public class _12_JUnit4_Custom_Matcher_Test 
{
	@Test
	  public void lessthanOrEquals_custom_matcher() throws Exception
	  {
	    int actualGoalScored = 2;
	    assertThat(actualGoalScored, lessThanOrEqual(4));
	    assertThat(actualGoalScored, lessThanOrEqual(2));
	    
	    double originalPI = 3.14;
	    assertThat(originalPI, lessThanOrEqual(9.00));

	    String authorName = "Sujoy";
	    assertThat(authorName, lessThanOrEqual("Zachary"));
	    
	    // Uncomment to see the exception
	    //int maxInt = Integer.MAX_VALUE;
	    //assertThat(maxInt, lessThanOrEqual(Integer.MIN_VALUE));
	  }
}
