/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 13 22:11:07 GMT 2024
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("xmlns:");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      Element element0 = document0.appendElement("xmlns:");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(element0, 0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      document0.attr("xmlns:[^-a-zA-Z0-9_:.]", true);
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(document0, 22);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("org.jsoup.helper.W3CDom");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      w3CDom_W3CBuilder0.head((Node) null, 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("");
      document0.text("");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("3HQMr@");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      DataNode dataNode0 = new DataNode("l'&{QzRqMg)(o!o@;f");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(dataNode0, 1564);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      String string0 = w3CDom0.asString(document1);
      assertEquals("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n</head>\n<body></body>\n</html>\n", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      Comment comment0 = new Comment("ins");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(comment0, 1376);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }
}
