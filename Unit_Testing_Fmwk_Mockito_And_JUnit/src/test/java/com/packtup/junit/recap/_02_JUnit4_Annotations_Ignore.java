package com.packtup.junit.recap;

import static org.junit.Assert.assertSame;
import org.junit.Ignore;
import org.junit.Test;


/* Sometimes we comment out tests because the feature is not developed. JUnit came up 
 * with a solution for this. Instead of commenting a test, we can just ignore it by 
 * annotating the test method with @Ignore. Commenting out a test or code is bad as 
 * it does nothing but increases the code size and reduces its readability. Also, 
 * when you comment out a test, then the test report doesn't tell you anything about 
 * the commented-out test; however, if you ignore a test, then the test report will 
 * tell you that something needs to be fixed as some tests are ignored. So, you can 
 * keep track of the ignored test */


public class _02_JUnit4_Annotations_Ignore 
{
	@Ignore
	@Test
	public void assertIncompleteTest() throws Exception 
	{
		Integer i = new Integer("12");
		Integer j = i;
		assertSame(i,j);
	}
}
