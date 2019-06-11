package de.vit.literatur.model;

public class Kapitel {
	private String titel;
	private final Buch buch;

	public Kapitel(String titel, Buch buch) {
		this.titel = titel;
		this.buch = buch;
	}
	
	
	private Buch getBuch() {
		return this.buch;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

}
