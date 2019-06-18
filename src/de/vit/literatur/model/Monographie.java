package de.vit.literatur.model;

import de.vit.akteure.Autor;

public abstract class Monographie extends Literatur implements IVerfasst {
	
	private Autor[] autoren;

	public Monographie(String titel, int anzahlAutoren) {
		super(titel);
		this.autoren = new Autor[anzahlAutoren];
	}


	public boolean istAutorInvolviert(Autor autor) {
		for(Autor a : autoren) {
			if (a != null && a.equals(autor)) return true;
		}
		return false;
	}

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
		return autorenNamen + super.getInfo();
	}

	public Autor[] getAutoren() {
		return autoren;
	}

	public void setAutoren(Autor[] autoren) {
		this.autoren = autoren;
	}

}
