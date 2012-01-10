package com.pl.zuk38.mavenbaza;

import java.util.ArrayList;
import java.util.List;

public class Miasto {
	
	private String nazwa;
	private List<Firmy> lokale = new ArrayList<Firmy>();
	

	public Miasto(String nazwa){
		this.setNazwa(nazwa);
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}
	
	public void dodajFirme(String nazwaF, String adresF, TypyLokali typ){
		
		lokale.add(new Firmy(nazwaF, adresF, typ));
	}	
	public void wyswietlListe(){
		System.out.println("--------------------");
		System.out.println("Miasto: " + nazwa + "\nRestauracje:");
		for(Firmy lista : lokale){
			lista.wyswietlF();			
		}
		System.out.println("--------------------");

	}
	public Firmy szukaj(String tekst){
		for(Firmy lok: lokale){
			
			if(lok.getNazwaF().equals(tekst) || lok.getAdresF().equals(tekst)) {
					return lok;
			}		
		}
		return null;
		
	}
	
	
	public void edytuj(String doZmiany, String NowaWartosc){
		for(Firmy lok : lokale){
			if(lok.getNazwaF().equals(doZmiany)) {
										lok.setNazwaF(NowaWartosc);
										System.out.println("Zmieniono nazwe Firmy");
			}
			
			if(lok.getAdresF().equals(doZmiany)) {
										lok.setAdresF(NowaWartosc);
										System.out.println("Zmieniono adres Firmy");
			}
		}
	}
	public void edytujObjekt(String doZmiany, String NowaWartosc){
		Firmy a;
		a = szukaj(doZmiany);
		a.setNazwaF(NowaWartosc);
	}

	public void usun(String doUsuniencia) {		
		lokale.remove(szukaj(doUsuniencia));
	}
	public void zmienTyp(String nazwa, TypyLokali typ){
	szukaj(nazwa).setTyp(typ);
	}
	public void usunPoz(int pozycja){		
		lokale.remove(pozycja);		
	}
	public Firmy pobFirme(int i){
		return lokale.get(i);
	}


}	


