package de.vit.literatur.model;

import java.util.Date;

import de.vit.akteure.Autor;

public class Ausgabe extends Literatur implements IVerleihbar {
	
	private int ausgabeNummer;
	private Date erscheinungsdatum;
	private final Zeitschrift zeitschrift;

	public Ausgabe(String titel, Zeitschrift zeitschrift ) {
		super(titel);
		this.zeitschrift = zeitschrift;
	}

	@Override
	public boolean istAutorInvolviert(Autor autor) {
		return false;
	}

	@Override
	public void ausgeben(String kunde) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public String getAusgegebenAn() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}

	@Override
	public void verleihen(Date bis) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public Date getVerliehenBis() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}

}
