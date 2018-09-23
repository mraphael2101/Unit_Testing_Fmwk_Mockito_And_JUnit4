package com.packtup.junit.recap;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;

/* Annotating the class with @FixMethodOrder(MethodSorters.NAME_ASCENDING), 
 * results in the tests being executed in an ascending order */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class _05_JUnit4_Test_Execution_Ordering 
{
	@Test   
	public void edit() throws Exception 
	{
	    System.out.println("edit executed");
	}
	
	@Test   
	public void create() throws Exception 
	{
	    System.out.println("create executed");
	}
	
	@Test   
	public void remove() throws Exception 
	{
	    System.out.println("remove executed");
	}
}
