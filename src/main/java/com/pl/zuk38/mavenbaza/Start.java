package com.pl.zuk38.mavenbaza;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.pl.zuk38.services.FirmyDBManager;


public class Start {

	public static void main(String[] args) {
				
		Miasto Tczew = new Miasto("Tczew");
		Tczew.dodajFirme("Zajazd Roma", "ul. Armii Krajowej 6", TypyLokali.restauracja);
		Tczew.dodajFirme("Pasi Brzuszek", "ul. 3 Maja 45", TypyLokali.pizzeria);
		Tczew.dodajFirme("Quchnia Smaq", "ul. Krolowej Jadwigi 17", TypyLokali.restauracja);
		Tczew.dodajFirme("DaGrasso", "ul. Zwirki 16", TypyLokali.pizzeria);
		
		Tczew.wyswietlListe();
		
		Tczew.edytuj("Zajazd Roma", "Roma");
		Tczew.wyswietlListe();
		
		Tczew.edytuj("ul. 3 Maja 45", "ul. Gdanska 32");
		Tczew.wyswietlListe();
		
		Tczew.usun("Pasi Brzuszek");
		Tczew.zmienTyp("Roma", TypyLokali.disco);
		Tczew.wyswietlListe();
		
		Tczew.usunPoz(2);
		Tczew.wyswietlListe();
		
		Firmy p = Tczew.pobFirme(0);
		//FirmyDBManager db = new FirmyDBManager();
		//db.addFirmy(p);
		
		Miasto Gniew = new Miasto("Gniew");
		Firmy f1 = new Firmy("Roma", "ul. aaa 1" , TypyLokali.disco);
		Firmy f2 = new Firmy("Zajazd", "ul. bbb 1" , TypyLokali.pizzeria);
		
		Gniew.dodajFirmeObjekt(f1);
		Gniew.dodajFirmeObjekt(f2);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.persist(Gniew);
		
		Firmy f3 = (Firmy) session.get(Firmy.class, 1);
		
		session.getTransaction().commit();
		
		System.out.println(f3.getNazwaF() + " " + f3.getAdresF() + " " + f3.getTyp());
		
	}

}
