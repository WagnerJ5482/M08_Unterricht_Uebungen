package de.vit.literatur.model;

import de.vit.akteure.Autor;

//Konstruktor hinzugefügt

public class Abschlussarbeit extends Literatur {
	private String typ;
	private Autor[] autoren;
	
	
	public Abschlussarbeit(String typ, Autor[] autoren, String titel) {
		super(titel);
		this.typ = typ;
		this.autoren = autoren;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public Autor[] getAutoren() {
		return autoren;
	}
	public void setAutoren(Autor[] autoren) {
		this.autoren = autoren;
	}

}
