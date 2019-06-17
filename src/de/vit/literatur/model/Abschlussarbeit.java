package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Abschlussarbeit extends Literatur {
	private String typ;
	private Autor[] autoren;
	
	
	public Abschlussarbeit(String titel,String typ) {
		super(titel);
		this.typ = typ;
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

	@Override
	public String getBeschreibung() {
		return getTyp();
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
		return autorenNamen + super.getInfo() + " (" + this.typ + ")";
	}

}
