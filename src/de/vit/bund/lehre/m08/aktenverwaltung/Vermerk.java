package de.vit.bund.lehre.m08.aktenverwaltung;

import java.time.LocalDate;

public class Vermerk {
	private String titel;
	private LocalDate datum;
	private String inhalt;
	private final Akte akte;

	public Vermerk(String titel, LocalDate datum, String inhalt, Akte akte) {
		this.titel = titel;
		this.datum = datum;
		this.inhalt = inhalt;
		this.akte = akte;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public Akte getAkte() {
		return akte;
	}


}
