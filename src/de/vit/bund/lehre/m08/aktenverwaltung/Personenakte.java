package de.vit.bund.lehre.m08.aktenverwaltung;

public abstract class Personenakte extends Akte {
	private String vorname;
	private String nachname;

	public Personenakte(boolean archiviert, String vorname, String nachname) {
		super(archiviert);
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
