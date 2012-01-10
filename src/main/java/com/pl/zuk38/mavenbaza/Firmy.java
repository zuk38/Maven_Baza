package com.pl.zuk38.mavenbaza;

public class Firmy {

	private String nazwaF;
	private String adresF;
	private TypyLokali typ;
	
	public Firmy(String nazwaF, String adresF, TypyLokali typ){
		this.nazwaF=nazwaF;
		this.adresF=adresF;
		this.typ=typ;
	}
	
	public void wyswietlF() {

		System.out.println("Nazwa: " + nazwaF + " Adres: " + adresF + " Typ: " + typ);
	}
	
	public String getNazwaF() {
		return nazwaF;
	}
	public void setNazwaF(String nazwaF) {
		this.nazwaF = nazwaF;
	}
	public String getAdresF() {
		return adresF;
	}
	public void setAdresF(String adresF) {
		this.adresF = adresF;
	}
	public TypyLokali getTyp() {
		return typ;
	}
	public void setTyp(TypyLokali typ) {
		this.typ = typ;
	}
}
