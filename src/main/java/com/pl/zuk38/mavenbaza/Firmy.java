package com.pl.zuk38.mavenbaza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Firmy {
	
	@Id
	@GeneratedValue
	private int id;

	private String nazwaF;
	private String adresF;
	
	@ManyToOne
	private Miasto zawiera;
	
	public Miasto getZawiera() {
		return zawiera;
	}

	public void setZawiera(Miasto zawiera) {
		this.zawiera = zawiera;
	}
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
