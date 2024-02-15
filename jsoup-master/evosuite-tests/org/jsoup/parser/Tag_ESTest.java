/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 13 21:55:13 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tag_ESTest extends Tag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("input", parseSettings0);
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tag tag0 = Tag.valueOf("meta");
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("title");
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("O>gf1j<Q&]Z$uG\"", parseSettings0);
      tag0.hashCode();
      assertFalse(tag0.isSelfClosing());
      assertTrue(tag0.formatAsBlock());
      assertTrue(tag0.isInline());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("N");
      assertFalse(tag0.isSelfClosing());
      
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag1 = Tag.valueOf("N", parseSettings0);
      Tag tag2 = tag0.setSelfClosing();
      boolean boolean0 = tag1.equals(tag2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf(")");
      Tag tag1 = Tag.valueOf("nw\"(Fu");
      boolean boolean0 = tag0.equals(tag1);
      assertFalse(tag1.isFormListed());
      assertFalse(tag1.isSelfClosing());
      assertFalse(tag1.preserveWhitespace());
      assertTrue(tag1.isInline());
      assertFalse(boolean0);
      assertFalse(tag1.isData());
      assertFalse(tag1.isFormSubmittable());
      assertTrue(tag1.formatAsBlock());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("O>gf1j<Q&]Z$uG\"", parseSettings0);
      Tag tag1 = Tag.valueOf("O>gf1j<Q&]Z$uG\"", parseSettings0);
      boolean boolean0 = tag1.equals(tag0);
      assertFalse(tag1.isSelfClosing());
      assertFalse(tag1.preserveWhitespace());
      assertFalse(tag1.isFormSubmittable());
      assertFalse(tag1.canContainBlock());
      assertTrue(boolean0);
      assertTrue(tag1.formatAsBlock());
      assertFalse(tag1.isFormListed());
      assertFalse(tag1.isData());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("O>gf1j<Q&]Z$uG\"", parseSettings0);
      Object object0 = new Object();
      boolean boolean0 = tag0.equals(object0);
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(boolean0);
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertTrue(tag0.isInline());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("title");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Tag.isKnownTag("U;T(h7='ooFPh}?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("title", parseSettings0);
      boolean boolean0 = tag0.isKnownTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tag tag0 = Tag.valueOf("A/*&nC];/by#");
      boolean boolean0 = tag0.isKnownTag();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(boolean0);
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("E_%~@");
      assertFalse(tag0.isSelfClosing());
      
      tag0.setSelfClosing();
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag tag0 = Tag.valueOf("E_%~@");
      boolean boolean0 = tag0.isSelfClosing();
      assertFalse(tag0.preserveWhitespace());
      assertFalse(boolean0);
      assertFalse(tag0.isFormSubmittable());
      assertTrue(tag0.isInline());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormListed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("menuitem", parseSettings0);
      boolean boolean0 = tag0.isSelfClosing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Tag tag0 = Tag.valueOf("meta");
      boolean boolean0 = tag0.isData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("title", parseSettings0);
      boolean boolean0 = tag0.isData();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Tag tag0 = Tag.valueOf("A/*&nC];/by#");
      boolean boolean0 = tag0.isInline();
      assertTrue(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormSubmittable());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isSelfClosing());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("title", parseSettings0);
      boolean boolean0 = tag0.isInline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("S", parseSettings0);
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Tag tag0 = Tag.valueOf("N");
      boolean boolean0 = tag0.isFormSubmittable();
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(boolean0);
      assertFalse(tag0.isFormListed());
      assertFalse(tag0.canContainBlock());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Y7}H87r*_\"nDbyCn@V");
      boolean boolean0 = tag0.canContainBlock();
      assertFalse(tag0.isData());
      assertFalse(tag0.isFormSubmittable());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isFormListed());
      assertFalse(boolean0);
      assertFalse(tag0.preserveWhitespace());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("FkxGxN=]", parseSettings0);
      boolean boolean0 = tag0.isBlock();
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isFormListed());
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isFormSubmittable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("FkxGxN=]", parseSettings0);
      boolean boolean0 = tag0.isFormListed();
      assertFalse(boolean0);
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isFormSubmittable());
      assertTrue(tag0.isInline());
      assertFalse(tag0.preserveWhitespace());
      assertFalse(tag0.isSelfClosing());
      assertFalse(tag0.isData());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("menu", parseSettings0);
      String string0 = tag0.toString();
      assertEquals("menu", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("menu", parseSettings0);
      String string0 = tag0.getName();
      assertEquals("menu", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("menu", parseSettings0);
      boolean boolean0 = tag0.formatAsBlock();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("FkxGxN=]", parseSettings0);
      assertNotNull(tag0);
      
      boolean boolean0 = tag0.preserveWhitespace();
      assertFalse(tag0.isFormSubmittable());
      assertFalse(tag0.isSelfClosing());
      assertFalse(boolean0);
      assertTrue(tag0.formatAsBlock());
      assertFalse(tag0.isData());
      assertFalse(tag0.isBlock());
      assertFalse(tag0.isFormListed());
  }
}
