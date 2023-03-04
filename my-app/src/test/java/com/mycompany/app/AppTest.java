package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase {

   /**  Create the test case  */  												   // Added comment to explain purpose of this method. 

   public AppTest(String testName) {      super(testName);   }                       // Removed unnecessary line break.

   /** @return the suite of tests being tested */                                     // Added comment to explain purpose of this method. 

   public static Test suite() { return new TestSuite(AppTest.class); }                // Removed unnecessary line break.

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
