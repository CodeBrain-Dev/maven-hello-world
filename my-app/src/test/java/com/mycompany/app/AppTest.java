package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase {

   /**  Create the test case.  */  													   // Added a comment to explain what this method does. 

   public AppTest(String testName) {      super(testName);   }

   /** Return the suite of tests being tested. */                                      // Added a comment to explain what this method does. 

   public static Test suite() {      return new TestSuite(AppTest.class);   }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
