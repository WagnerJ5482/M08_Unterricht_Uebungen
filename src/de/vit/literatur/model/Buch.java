package de.vit.literatur.model;

public class Buch {
	private String titel;
	private int ausgabe;
	private Kapitel kapitel;
	
	
	public Buch(Kapitel kapitel,String titel, int ausgabe) {
		this.kapitel = kapitel;
		this.titel = titel;
		this.ausgabe = ausgabe;
	}
	
	public Kapitel getKapitel() {
		return this.kapitel;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getAusgabe() {
		return ausgabe;
	}
	public void setAusgabe(int ausgabe) {
		this.ausgabe = ausgabe;
	}
}
