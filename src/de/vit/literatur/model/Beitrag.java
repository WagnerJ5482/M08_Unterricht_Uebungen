package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Beitrag extends Literatur {
	private final Sammelband sammelband;
	private Autor[] autoren;
	
	public Beitrag (Sammelband sammelband, String titel) {
		super(titel);
		this.sammelband = sammelband;
	}
	
	public Autor[] getAutoren() {
		return autoren;
	}

	public void setAutoren(Autor[] autoren) {
		this.autoren = autoren;
	}

	public Sammelband getSammelband() {
		return sammelband;
	}
	
	
}
