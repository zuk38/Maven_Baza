package com.pl.zuk38.movenbaza;

import pl.com.zuk38.services.FirmyDBManager;

public class Start {

	public static void main(String[] args) {
				
		Miasto Tczew = new Miasto("Tczew");
		Tczew.dodajFirme("Zajazd Roma", "ul. Armii Krajowej 6");
		Tczew.dodajFirme("Pasi Brzuszek", "ul. 3 Maja 45");
		Tczew.dodajFirme("Quchnia Smaq", "ul. Krolowej Jadwigi 17");
		Tczew.dodajFirme("DaGrasso", "ul. Zwirki 16");
		
		Tczew.wyswietlListe();
		
		Tczew.edytuj("Zajazd Roma", "Roma");
		Tczew.wyswietlListe();
		
		Tczew.edytuj("ul. 3 Maja 45", "ul. Gdanska 32");
		Tczew.wyswietlListe();
		
		Tczew.usun("Pasi Brzuszek");		
		Tczew.wyswietlListe();
		
		Tczew.usunPoz(2);
		Tczew.wyswietlListe();
		
		Firmy p = Tczew.szukaj("Roma");
		FirmyDBManager db = new FirmyDBManager();
		db.addFirmy(p);


	}

}
