package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Buch extends Literatur{
	
	private int ausgabe;
	private Autor[] autoren;
	private Kapitel[] kapitel;
	
	
	public Buch(String titel, int ausgabe) {
		super(titel);
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

	public Autor[] getAutoren() {
		return autoren;
	}

	public void setAutoren(Autor[] autoren) {
		this.autoren = autoren;
	}
}
