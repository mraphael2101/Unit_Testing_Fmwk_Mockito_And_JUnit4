package com.packtup.junit.recap;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.Statement;

/* TestWatcher is a base class for rules that take note of the testing action without modifying 
 * it. In the below example we have created a TestWatcher class that listens to every test 
 * execution. It collects both the failure and success instances, and then prints the result 
 * in the afterClass() method */ 

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class _22_JUnit4_Test_Watcher_Rule 
{
	private static String dog = "";

	@Rule
	public TestWatcher watchman = new TestWatcher() 
	{
		@Override
		public Statement apply(Statement base, Description description) 
		{
			return super.apply(base, description);
		}

		@Override
		protected void succeeded(Description description) 
		{
			dog += description.getDisplayName() + " " + "Success\n";
		}

		@Override
		protected void failed(Throwable e, Description description) 
		{
			dog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
		}

		@Override
		protected void starting(Description description) 
		{
			super.starting(description);
		}

		@Override
		protected void finished(Description description) 
		{
			super.finished(description);
		}
	};

	@Test
	public void red_test() { fail(); }

	@Test
	public void green() { }

	@AfterClass
	public static void afterClass() { System.out.println(dog); }
} 