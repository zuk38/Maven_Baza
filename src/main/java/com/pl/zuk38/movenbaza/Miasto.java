package com.pl.zuk38.movenbaza;

import java.util.ArrayList;
import java.util.List;

public class Miasto {
	
	private String nazwa;
	public List<Firmy> lokale = new ArrayList<Firmy>();
	

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
		
		lokale.add(new Firmy(nazwaF, adresF));
	}	
	public void wyswietlListe(){
		System.out.println("--------------------");
		System.out.println("Miasto: " + nazwa + "\nRestauracje:");
		for(Firmy lista : lokale){
			lista.wyswietlF();			
		}
		System.out.println("--------------------");

	}
	public int szukaj(String tekst){
		int nr=-1;
		for(Firmy lista: lokale){
			nr++;
			if(lista.getNazwaF().equals(tekst) || lista.getAdresF().equals(tekst)) {
				System.out.println("Pozycja na liscie nr: " + nr);
				System.out.println("Restauracja: " + lista.getNazwaF() + " " + lista.getAdresF() + " znajdujaca sie w: " + getNazwa());
			}			
		}
		return nr;
	}
	
	public int szukajKilku(String[] tab ){
		int nr=-1;
				for(Firmy lista: lokale){
			nr++;
			if(lista.getNazwaF().equals(tab[nr]) || lista.getAdresF().equals(tab[nr])) {
				System.out.println("Pozycja na liscie nr: " + nr);
				System.out.println("Restauracja: " + lista.getNazwaF() + " " + lista.getAdresF() + " znajdujaca sie w: " + getNazwa());
			}			
		}
		return nr;
	}
	
	public void edytuj(String doZmiany, String NowaWartosc){
		for(Firmy lista : lokale){
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

	public void usun(String doUsuniencia) {		
		System.out.println(lokale.remove(szukaj(doUsuniencia)) + " zostala usunienta!");
		}
	
	public void usunPoz(int pozycja){		
		System.out.println("Firma : " + lokale.get(pozycja).getNazwaF() + " zostanie usunienta.");
		lokale.remove(pozycja);
		
	}
}	


