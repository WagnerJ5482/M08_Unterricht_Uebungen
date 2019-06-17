package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Beitrag extends Literatur {
	private final Sammelband sammelband;
	private Autor[] autoren;
	
	public Beitrag ( String titel, Sammelband sammelband) {
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
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung() + " im Sammelband " + this.getSammelband().getInfo();
	}

	@Override
	public boolean istAutorInvolviert(Autor autor) {
		// TODO Automatisch generierter Methodenstub
		return false;
	}
	
	
}
