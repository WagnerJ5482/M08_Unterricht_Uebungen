package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Zeitschrift extends Literatur implements IHerausgegeben {

	private Autor[] autoren;
	private Ausgabe[] ausgaben;
	
	public Zeitschrift(String titel, Autor[] autoren) {
		super(titel);
		this.autoren = autoren;
		
	}
	@Override
	public String getInfo() {
		return super.getInfo();
	}
	
	@Override
	public String getBeschreibung() {
		return super.getBeschreibung();
	}

	@Override
	public boolean istAutorInvolviert(Autor autor) {
		// TODO Automatisch generierter Methodenstub
		return false;
	}
	@Override
	public Autor[] getHerausgeber() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}

}
