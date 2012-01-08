package com.pl.zuk38.movenbaza;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
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


    public void testdodajFirme() {
		
		Miasto tcz = new Miasto("Tczew");
		assertNotNull(tcz);
		assertEquals("Tczew", tcz.getNazwa());
		
		tcz.dodajFirme("FirmaTest", "ul. testowa 1");
		assertNotNull(tcz.getLokale().get(0));
		
	
	}
}
