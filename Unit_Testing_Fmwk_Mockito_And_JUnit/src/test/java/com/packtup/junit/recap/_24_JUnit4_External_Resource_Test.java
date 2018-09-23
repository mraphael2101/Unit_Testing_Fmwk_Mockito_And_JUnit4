package com.packtup.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestName;

/* Sometimes JUnit tests need to communicate with external resources such as files 
 * or databases or server sockets. Dealing with external resources is always messy 
 * because you need to set up state and tear it down later. The ExternalResource rule 
 * provides a mechanism that makes resource handling a bit more convenient. JUnit makes 
 * this setup and cleanup work the responsibility of the resource. The Resource class 
 * represents an external resource */

class Resource 
{
	public void open()  { System.out.println("Opened"); }

	public void close() { System.out.println("Closed"); }

	public double get() { return Math.random(); }
} 

/* The following test class creates an ExternalResource and handles the resource lifecycle.
 * The anonymous ExternalResource class overrides the before and after methods of the 
 * ExternalResource class. In the before method, it starts the resource and prints 
 * the test method name using the TestName rule. In the after method, it just closes 
 * the resource. The following is the test run output*/

public class _24_JUnit4_External_Resource_Test 
{
	Resource resource;
	public @Rule TestName name = new TestName();

	public @Rule ExternalResource rule = new ExternalResource() 
	{
		@Override protected void before() throws Throwable 
		{
			resource = new Resource();
			resource.open();
		}

		@Override protected void after()  
		{
			resource.close();
			System.out.println("\n");
		}
	};

	@Test
	public void someTest() throws Exception 
	{
		System.out.println(resource.get());
		System.out.println(name.getMethodName());
	}

	@Test
	public void someTest2() throws Exception 
	{
		System.out.println(resource.get());
		System.out.println(name.getMethodName());
	}
} 