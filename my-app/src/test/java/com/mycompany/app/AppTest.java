package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /** 
     * Constructor for the AppTest class.  This constructor takes in a string parameter, which is used as the name of the test case.  
     * @param testName The name of the test case.  This will be used to identify which tests are being run. 
     */ 

    public AppTest(String testName) { 

        super(testName); 

    }

    /**
     * @return the suite of tests being tested
     */
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
