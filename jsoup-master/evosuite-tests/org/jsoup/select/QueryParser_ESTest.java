/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 13 21:42:47 GMT 2024
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueryParser_ESTest extends QueryParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":containsOwn(%s)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("~[w&s*=s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("~[w&s*!=s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("meta[name=charset]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[^-a-zA-Z0-9_:.]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("[%s^%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(" F79fmW|");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matchText");
      assertEquals(":matchText", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":root");
      assertEquals(":root", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":empty");
      assertEquals(":empty", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-of-type");
      assertEquals(":only-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":only-child");
      assertEquals(":only-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-of-type");
      assertEquals(":last-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-of-type");
      assertEquals(":first-of-type", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":last-child");
      assertEquals(":last-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":first-child");
      assertEquals(":first-child", evaluator0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-of-type(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-last-child(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":nth-child(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse nth-index '': unexpected format
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":matchesOwn(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":matches(regex) query must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":contains(%s)");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("*|");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("u+u(8ue']dWm");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at '8ue'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("width must be > 0");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("T,ct,eqw-rqtMnn");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("Bo*AL I");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("org.jsoup.nodes.CDataNode");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("T9t,eqw-r_qtM+nn");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse("~[%s^=%s]");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":not(selector) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(".t8]3d/HR");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '.t8]3d/HR': unexpected token at ']3d/HR'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Evaluator evaluator0 = QueryParser.parse(":has(el) subselect must not be empty");
      assertNotNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":gt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse("2nd#xRVMS6{!");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '2nd#xRVMS6{!': unexpected token at '{!'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":lt(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":containsData(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        QueryParser.parse(":eq(");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index must be numeric
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }
}
