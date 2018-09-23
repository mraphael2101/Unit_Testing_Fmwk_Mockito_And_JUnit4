package com.packtup.junit.recap;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/* The Categories runner runs only the classes and methods that are annotated with either 
 * the category given with the @IncludeCategory annotation or a subtype of that category. 
 * Either classes or interfaces can be used as categories. Subtyping works, so if you use 
 * @IncludeCategory(SuperClass.class), a test marked @Category({SubClass.class}) will be 
 * run. We can exclude categories by using the @ExcludeCategory annotation. We can define 
 * two interfaces using the following code: */

interface SmartTests { /* category marker */ }
interface CrazyTests { /* category marker */ }

public class _25_JUnit4_Category_Test_Runner  
{
  @Test
  public void a() { fail(); }

  @Category(CrazyTests.class)
  @Test
  public void b() { }
}

@Category({CrazyTests.class, SmartTests.class})
class OtherTest 
{
  @Test
  public void c() { }
}

@RunWith(Categories.class)
@IncludeCategory(CrazyTests.class)
@ExcludeCategory(SmartTests.class)
@SuiteClasses( { _25_JUnit4_Category_Test_Runner.class, OtherTest.class }) 

class CrazyTestSuite 
{
  // Will run SomeTest.b, but not SomeTest.a or OtherTest.c
}