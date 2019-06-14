package de.vit.literatur.model;

public class Buch extends Literatur{
	private int ausgabe;
	private Kapitel kapitel;
	
	
	public Buch(Kapitel kapitel,String titel, int ausgabe) {
		super(titel);
		this.kapitel = kapitel;
		this.ausgabe = ausgabe;
	}
	
	public Kapitel getKapitel() {
		return this.kapitel;
	}
	public int getAusgabe() {
		return ausgabe;
	}
	public void setAusgabe(int ausgabe) {
		this.ausgabe = ausgabe;
	}
}
