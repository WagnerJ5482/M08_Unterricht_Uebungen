package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Artikel extends Literatur {

	private final Autor[] autoren;
	private Ausgabe ausgabe;

	public Artikel(String titel, Ausgabe ausgabe, Autor[] autoren) {
		super(titel);
		this.autoren = autoren;
		this.ausgabe = ausgabe;
	}

	@Override
	public String getInfo() {
		return super.getInfo();
	}
	
	@Override
	public String getBeschreibung() {
		// TODO Automatisch generierter Methodenstub
		return super.getBeschreibung();
	}
	
	@Override
	public boolean istAutorInvolviert(Autor autor) {
		return false;
	}

}
