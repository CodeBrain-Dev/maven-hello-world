package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase {

   /**  Create the test case.  */  											   // Added a comment to describe what this code block does. 

   public AppTest(String testName) {                                         // Changed indentation for consistency with rest of file. 

      super(testName);                                                       // Changed indentation for consistency with rest of file. 

   }

   /** Return the suite of tests being tested. */                             // Added a comment to describe what this code block does. 

   public static Test suite() {                                              // Changed indentation for consistency with rest of file. 

      return new TestSuite(AppTest.class);                                    // Changed indentation for consistency with rest of file.
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
