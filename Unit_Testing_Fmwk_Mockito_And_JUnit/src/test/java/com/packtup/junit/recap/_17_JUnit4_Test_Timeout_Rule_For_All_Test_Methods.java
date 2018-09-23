package com.packtup.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/* The timeout rule applies the same timeout to all the test methods in a class */

public class _17_JUnit4_Test_Timeout_Rule_For_All_Test_Methods 
{
    @Rule
    public Timeout globalTimeout = Timeout.millis(10);
    
    @Test
    public void testInfiniteLoop1() throws InterruptedException
    {
      Thread.sleep(30);
    }
    
    @Test
    public void testInfiniteLoop2() throws InterruptedException
    {
      Thread.sleep(30);
    } 
}

