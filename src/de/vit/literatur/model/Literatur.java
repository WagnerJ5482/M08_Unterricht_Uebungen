package de.vit.literatur.model;

import de.vit.akteure.Autor;

public abstract class Literatur {
	private String titel;
	
	public Literatur(String titel) {
		this.titel = titel;
	}
	
	public String getInfo() {
		return "Titel: "+getTitel();
	}
	
	public String getBeschreibung() {
		// Der einfache Klassenname dieser Instanz
		String typ = this.getClass().getSimpleName();
		return typ;
	}
	
	public abstract boolean istAutorInvolviert(Autor autor);
	

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
}
