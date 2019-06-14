package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Literatur {
	private String titel;
	
	public Literatur(String titel) {
		this.titel = titel;
	}
	
	public String getInfo() {
		return "getInfoAusgabe";
	}
	
	public String getBeschreibung() {
		return "getBeschreibungAusgabe";
	}
	
	public boolean istAutorInvolviert(Autor autor) {
		return true;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
}
