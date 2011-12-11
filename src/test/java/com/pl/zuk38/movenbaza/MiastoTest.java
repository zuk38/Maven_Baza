package com.pl.zuk38.movenbaza;

import static org.junit.Assert.*;

import org.junit.Test;


public class MiastoTest {

	@Test
	public void testdodajFirme() {
		
		Miasto tcz = new Miasto("Tczew");
		assertNotNull(tcz);
		assertEquals("Tczew", tcz.getNazwa());
		
		tcz.dodajFirme("FirmaTest", "ul. testowa 1");
		assertNotNull(tcz.lokale.get(0));
		
	
	}

	@Test
	public void testWyswietlListe() {
		fail("Not yet implemented");
	}

	@Test
	public void testSzukaj() {
		fail("Not yet implemented");
	}

	@Test
	public void testEdytuj() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsun() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunPoz() {
		fail("Not yet implemented");
	}

}
