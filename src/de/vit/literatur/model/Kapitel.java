package de.vit.literatur.model;

public class Kapitel {
	
	private String titel;
	private final Buch buch;

	public Kapitel(Buch buch) {
		this.buch = buch;
	}
	
	@SuppressWarnings("unused")
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
