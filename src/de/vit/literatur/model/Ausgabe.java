package de.vit.literatur.model;

import java.util.Date;

import de.vit.akteure.Autor;

public class Ausgabe extends Literatur {
	
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

}
