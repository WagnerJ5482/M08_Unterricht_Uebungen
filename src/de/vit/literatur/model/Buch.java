package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Buch extends Literatur{
	
	private int ausgabe;
	private String beschreibung;
	
	private Autor[] autoren;
	private Kapitel[] kapitel;
	
	public Buch(String titel, int ausgabe, int anzahlAutoren, int anzahlKapitel) {
		this(titel,anzahlAutoren,anzahlKapitel);
		this.ausgabe = ausgabe;
	}
	
	public Buch(String titel, int ausgabe, int anzahlAutoren) {
		super(titel);
		this.ausgabe = ausgabe;
		this.autoren = new Autor[anzahlAutoren];
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

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	@Override
	public String getInfo() {
		String autorenNamen = "";
		if(this.autoren != null) {
			for(Autor autor : this.autoren) {
				if(autor != null) {
					// Trennzeichen hinzufügen, wenn nicht erster Autor
					if(!autorenNamen.equals(""))
						autorenNamen += ", ";
					// Name des Autors hinzufügen
					autorenNamen += autor.getVorname() + " " + autor.getNachname(); 
				}
			}
			autorenNamen += ": ";
		}
		return autorenNamen + super.getInfo() + " (" + this.getAusgabe() + ". Ausg.)";
	}
}
