package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Buch extends Monographie{
	
	private int ausgabe;
	private String beschreibung;
	
	
	private Kapitel[] kapitel;
	
	public Buch(String titel, int ausgabe, int anzahlAutoren, int anzahlKapitel) {
		this(titel,anzahlAutoren,anzahlKapitel);
		this.ausgabe = ausgabe;
	}
	
	public Buch(String titel, int ausgabe, int anzahlAutoren) {
		super(titel, anzahlAutoren);
		this.ausgabe = ausgabe;
		
	}
	
	public Kapitel[] getKapitel() {
		return this.kapitel;
	}
	
	public void setKapitel(Kapitel[] kapitel) {
		this.kapitel = kapitel;
	}
	public int getAusgabe() {
		return ausgabe;
	}
	public void setAusgabe(int ausgabe) {
		this.ausgabe = ausgabe;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getInfo() {
		return super.getInfo() + " (" + this.getAusgabe() + ". Ausg.)";
	}
	

}
