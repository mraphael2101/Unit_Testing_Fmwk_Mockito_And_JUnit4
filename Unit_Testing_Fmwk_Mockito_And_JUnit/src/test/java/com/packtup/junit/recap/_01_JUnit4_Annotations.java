package com.packtup.junit.recap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/* @Before and @After can be applied to any public void methods. @AfterClass and 
 * @BeforeClass can be applied to only public static void methods */

public class _01_JUnit4_Annotations 
{
  @BeforeClass
  public static void beforeClass() { System.out.println("***Before Class is invoked"); }

  @AfterClass
  public static void afterClass()  { System.out.println("***After Class is invoked"); }
  
  
  @Before
  public void before() { System.out.println("____________________\n \t Before is invoked"); }
  
  @After
  public void after()  { System.out.println("\t After is invoked \n=================");     }

  
  @Test
  public void someTest() { System.out.println("\t\t someTest is invoked"); }
  
  @Test
  public void someTest2() { System.out.println("\t\t someTest2 is invoked"); }
}

