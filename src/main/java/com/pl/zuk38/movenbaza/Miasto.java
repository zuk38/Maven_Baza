package com.pl.zuk38.movenbaza;

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
	
	public void dodajFirme(String nazwaF, String adresF){
		
		getLokale().add(new Firmy(nazwaF, adresF));
	}	
	public void wyswietlListe(){
		System.out.println("--------------------");
		System.out.println("Miasto: " + nazwa + "\nRestauracje:");
		for(Firmy lista : getLokale()){
			lista.wyswietlF();			
		}
		System.out.println("--------------------");

	}
	public Firmy szukaj(String tekst){
		
		Firmy a = null;
		for(Firmy lista: getLokale()){
			
			if(lista.getNazwaF().equals(tekst) || lista.getAdresF().equals(tekst)) {
				System.out.println("Restauracja: " + lista.getNazwaF() + " " + lista.getAdresF() + " znajdujaca sie w: " + getNazwa());
				a = lista;
			}			
		}
		return a;
	}
	
	
	public void edytuj(String doZmiany, String NowaWartosc){
		for(Firmy lista : getLokale()){
			if(lista.getNazwaF().equals(doZmiany)) {
										lista.setNazwaF(NowaWartosc);
										System.out.println("Zmieniono nazwe Firmy");
			}
			
			if(lista.getAdresF().equals(doZmiany)) {
										lista.setAdresF(NowaWartosc);
										System.out.println("Zmieniono adres Firmy");
			}
		}
	}
	public void edytujObjekt(String doZmiany, String NowaWartosc){
		Firmy a;
		a = szukaj(doZmiany);
		a.setNazwaF(NowaWartosc);
		System.out.println("ZMIANA!" + a.getNazwaF());
	}

	public void usun(String doUsuniencia) {		
		System.out.println(getLokale().remove(szukaj(doUsuniencia)) + " zostala usunienta!");
		}
	
	public void usunPoz(int pozycja){		
		System.out.println("Firma : " + getLokale().get(pozycja).getNazwaF() + " zostanie usunienta.");
		getLokale().remove(pozycja);
		
	}

	public List<Firmy> getLokale() {
		return lokale;
	}

	public void setLokale(List<Firmy> lokale) {
		this.lokale = lokale;
	}
}	


