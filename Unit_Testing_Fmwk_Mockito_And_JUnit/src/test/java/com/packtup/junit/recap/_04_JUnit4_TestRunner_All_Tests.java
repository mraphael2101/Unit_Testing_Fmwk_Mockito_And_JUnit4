package com.packtup.junit.recap;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ _01_JUnit4_Annotations.class, 
				_02_JUnit4_Annotations_Ignore.class, 
				_03_JUnit4_Assertions.class })


public class _04_JUnit4_TestRunner_All_Tests 
{

}
