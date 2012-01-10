package com.pl.zuk38.mavenbaza;

import java.util.ArrayList;
import java.util.List;

import com.pl.zuk38.mavenbaza.Firmy;
import com.pl.zuk38.mavenbaza.Miasto;
import com.pl.zuk38.mavenbaza.TypyLokali;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
	private Miasto testowe = new Miasto("Testowe");
	
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
    
    public void test1dodajFirme() {
		assertNotNull(testowe);
		assertEquals(testowe.getNazwa(),"Testowe");
		
		testowe.dodajFirme("FirmaTest", "ul. testowa 1", TypyLokali.disco);
		assertNotNull(testowe.pobFirme(0));
		}
   
    public void test2WyswietlFirmy(){	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", TypyLokali.disco);
		assertNotNull(testowe.pobFirme(0).getNazwaF());
	
		}
    public void test3szukaFirmy(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", TypyLokali.disco);
    	assertNotNull(testowe.pobFirme(0));
    	assertSame(testowe.pobFirme(0),testowe.szukaj("FirmaTest")); 
    }
    public void test4usunPoz(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", TypyLokali.disco);
    	assertNotNull(testowe.pobFirme(0));
    	testowe.usunPoz(0);
    	assertNull(testowe.szukaj("FirmaTest"));
    }
    public void test5edytuj(){
    	
    	testowe.dodajFirme("FirmaTest", "ul. testowa 1", TypyLokali.disco);
    	testowe.edytuj(testowe.pobFirme(0).getNazwaF(), "Firma");
    	assertTrue(testowe.pobFirme(0).getNazwaF()=="Firma");
    }
    
   
}
