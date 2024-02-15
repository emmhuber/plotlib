/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 13 21:59:20 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HtmlTreeBuilder_ESTest extends HtmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "#root", parseErrorList0, (ParseSettings) null);
      Element element1 = htmlTreeBuilder0.getActiveFormattingElement("#root");
      assertNull(element1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.removeFromActiveFormattingElements((Element) null);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "#root", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.removeFromActiveFormattingElements(element0);
      assertEquals(0, element0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.pushActiveFormattingElements(element0);
      htmlTreeBuilder0.clearFormattingElementsToLastMarker();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("3g_C2;z");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("3g_C2;z", element0, "3g_C2;z", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.clearFormattingElementsToLastMarker();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "#root", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.pushActiveFormattingElements((Element) null);
      htmlTreeBuilder0.clearFormattingElementsToLastMarker();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader(",u?fpTv*Np?u31.v] ");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "textarea", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.removeLastFormattingElement();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Tag tag0 = Tag.valueOf("option");
      Element element0 = new Element(tag0, "Zlx");
      ParseErrorList parseErrorList0 = ParseErrorList.tracking((-3247));
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      htmlTreeBuilder0.parseFragment("option", element0, "Zlx", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.generateImpliedEndTags("option");
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.generateImpliedEndTags("html");
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader(",u?fpTv*Np?u31.v] ");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "textarea", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.insertStartTag("textarea");
      assertEquals(1, element0.siblingIndex());
      
      boolean boolean0 = htmlTreeBuilder0.inSelectScope("textarea");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("3g_C2;z");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("3g_C2;z", element0, "3g_C2;z", parseErrorList0, parseSettings0);
      boolean boolean0 = htmlTreeBuilder0.inSelectScope("script");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Document.createShell("tr");
      Elements elements0 = document0.getElementsContainingText("tr");
      htmlTreeBuilder0.stack = (ArrayList<Element>) elements0;
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inSelectScope("G8EbO+z2Md#AB");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Should not be reachable
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      String string0 = "aKz?C\\uLMrr*";
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      List<Node> list0 = htmlTreeBuilder0.parseFragment(string0, (Element) null, "Ffmot", (ParseErrorList) null, parseSettings0);
      assertEquals(1, list0.size());
      
      String[] stringArray0 = new String[0];
      boolean boolean0 = htmlTreeBuilder0.inScope(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "#root", parseErrorList0, (ParseSettings) null);
      String[] stringArray0 = new String[6];
      stringArray0[2] = "[e?CE";
      stringArray0[4] = "html";
      boolean boolean0 = htmlTreeBuilder0.inScope(stringArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("4o\"T");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.initialiseParse(stringReader0, "4o\"T", parseErrorList0, (ParseSettings) null);
      boolean boolean0 = htmlTreeBuilder0.inButtonScope("b]'XhY`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("3g_C2;z");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("3g_C2;z", element0, "3g_C2;z", parseErrorList0, parseSettings0);
      boolean boolean0 = htmlTreeBuilder0.inScope("script");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("html", parseSettings0);
      Element element0 = new Element(tag0, "html");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("=sLS", (Element) null, "8=,HL/_", (ParseErrorList) null, parseSettings0);
      htmlTreeBuilder0.resetInsertionMode();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.popStackToBefore("[e?CE");
      htmlTreeBuilder0.resetInsertionMode();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("body");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("body", element0, "body", parseErrorList0, parseSettings0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertOnStackAfter(element0, element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(true, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      String[] stringArray0 = new String[7];
      stringArray0[3] = "html";
      htmlTreeBuilder0.popStackToClose(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("tr");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "tr", parseErrorList0, parseSettings0);
      htmlTreeBuilder0.popStackToClose("C");
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("boDy");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("boDy", element0, "boDy", parseErrorList0, parseSettings0);
      boolean boolean0 = htmlTreeBuilder0.removeFromStack(element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      htmlTreeBuilder0.insertInFosterParent(element0);
      assertEquals(1, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("script", parseSettings0);
      Element element0 = new Element(tag0, "script");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      CharacterReader characterReader0 = new CharacterReader("3");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.StartTag token_StartTag0 = tokeniser0.startPending;
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("textarea", attributes0);
      FormElement formElement0 = htmlTreeBuilder0.insertForm(token_StartTag1, true);
      assertEquals("3", formElement0.baseUri());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("[e?CE", parseSettings0);
      Element element0 = new Element(tag0, "[e?CE");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      CharacterReader characterReader0 = new CharacterReader("3");
      Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
      Token.StartTag token_StartTag0 = tokeniser0.startPending;
      Attributes attributes0 = new Attributes();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("html", attributes0);
      Element element1 = htmlTreeBuilder0.insertEmpty(token_StartTag1);
      assertEquals(0, element1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("tr");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "tr", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.insertStartTag("tr");
      ParseErrorList parseErrorList1 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("boDy", element0, "boDy", parseErrorList1, parseSettings0);
      assertEquals(1, element0.siblingIndex());
      assertEquals(0, parseErrorList1.size());
      assertTrue(parseErrorList1.equals((Object)parseErrorList0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = new Document("s>:xd1q");
      htmlTreeBuilder0.maybeSetBaseUri(document0);
      assertEquals("s>:xd1q", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      Tag tag0 = Tag.valueOf("script", parseSettings0);
      Element element0 = new Element(tag0, "script");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      htmlTreeBuilder0.parseFragment("#root", element0, "3", parseErrorList0, (ParseSettings) null);
      Token.CData token_CData0 = new Token.CData("3");
      htmlTreeBuilder0.insert(token_CData0);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("noframes");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      List<Node> list0 = htmlTreeBuilder0.parseFragment("noframes", element0, "noframes", parseErrorList0, parseSettings0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader(",u?fpTv*Np?u31.v] ");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "textarea", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.insertStartTag("textarea");
      List<Node> list0 = htmlTreeBuilder0.parseFragment("boDy", element0, "boDy", parseErrorList0, parseSettings0);
      assertEquals(1, element0.siblingIndex());
      assertEquals(1, list0.size());
      assertEquals(0, parseErrorList0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      String string0 = "aKz?C\\uLMrr*";
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      htmlTreeBuilder0.parseFragment(string0, (Element) null, "Ffmot", (ParseErrorList) null, parseSettings0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.aboveOnStack((Element) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.clearStackToTableContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inTableScope("Hd");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Token.Comment token_Comment0 = new Token.Comment();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.isSpecial((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = new Document("g)'4J0SjA)uZ9Av\"eVR");
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.push(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.setFosterInserts(true);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Tag tag0 = Tag.valueOf("Mxw`WrK");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "O^YE?(-~OS/p[FKHL", attributes0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.replaceActiveFormattingElement(formElement0, formElement0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      boolean boolean0 = htmlTreeBuilder0.isFragmentParsing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Tag tag0 = Tag.valueOf("tbody");
      CDataNode cDataNode0 = new CDataNode("Msa");
      Attributes attributes0 = cDataNode0.attributes();
      Element element0 = new Element(tag0, "Msa", attributes0);
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.isInActiveFormattingElements(element0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      String string0 = htmlTreeBuilder0.getBaseUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = htmlTreeBuilder0.getDocument();
      assertNull(document0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.setPendingTableCharacters((List<String>) null);
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.state();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.clearStackToTableRowContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      FormElement formElement0 = htmlTreeBuilder0.getFormElement();
      assertNull(formElement0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      htmlTreeBuilder0.generateImpliedEndTags();
      assertEquals(100, HtmlTreeBuilder.MaxScopeSearchDepth);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("tr");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "tr", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.insertStartTag("tr");
      htmlTreeBuilder0.parseFragment("boDy", element0, "boDy", parseErrorList0, parseSettings0);
      assertEquals(2, parseErrorList0.size());
      assertFalse(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.inListItemScope("v+|B0k");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.clearStackToTableBodyContext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      ArrayList<Element> arrayList0 = htmlTreeBuilder0.getStack();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = htmlTreeBuilder0.getHeadElement();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = new Document("dt");
      // Undeclared exception!
      try { 
        htmlTreeBuilder0.replaceOnStack(document0, document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.HtmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      StringReader stringReader0 = new StringReader("tr");
      ParseErrorList parseErrorList0 = new ParseErrorList((byte)116, 1293);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      htmlTreeBuilder0.parse(stringReader0, "textarea", parseErrorList0, parseSettings0);
      Element element0 = htmlTreeBuilder0.getHeadElement();
      List<Node> list0 = htmlTreeBuilder0.parseFragment("boDy", element0, "boDy", parseErrorList0, parseSettings0);
      assertEquals(0, element0.siblingIndex());
      assertTrue(parseErrorList0.isEmpty());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Element element0 = new Element("3g_C2;z");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = htmlTreeBuilder0.defaultSettings();
      htmlTreeBuilder0.parseFragment("3g_C2;z", element0, "3g_C2;z", parseErrorList0, parseSettings0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3g_c2;z";
      htmlTreeBuilder0.popStackToClose(stringArray0);
  }
}
