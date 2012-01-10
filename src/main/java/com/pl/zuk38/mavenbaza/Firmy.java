package com.pl.zuk38.mavenbaza;

public class Firmy {

	private String nazwaF;
	private String adresF;
	
	public Firmy(String nazwaF, String adresF){
		this.nazwaF=nazwaF;
		this.adresF=adresF;
	}
	
	public void wyswietlF() {

		System.out.println("Nazwa: " + nazwaF + " Adres: " + adresF);
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
}
