package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase {

    /**  Create the test case.  */  											   // Added comment for clarity. 

    /**  @param testName name of the test case. */  				               // Added comment for clarity. 

    public AppTest( String testName ) { super(testName); }

    /**  @return the suite of tests being tested. */  	                         // Added comment for clarity. 

    public static Test suite() { return new TestSuite(AppTest.class); }
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
