/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 13 22:33:27 GMT 2024
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comment comment0 = new Comment("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "org.jsoup.nodes.Entities");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.prettyPrint(false);
      comment0.outerHtmlHead(stringBuilder0, 1, document_OutputSettings0);
      assertEquals("org.jsoup.nodes.Entities<!--org.jsoup.nodes.Entities-->", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comment comment0 = new Comment("^`y#P#Fpo64Ts*l-^", "^`y#P#Fpo64Ts*l-^");
      comment0.toString();
  }
}
