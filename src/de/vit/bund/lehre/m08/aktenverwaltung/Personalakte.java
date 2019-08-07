package de.vit.bund.lehre.m08.aktenverwaltung;

public class Personalakte extends Personenakte {
	private int personalNr;

	public Personalakte(boolean archiviert, String vorname, String nachname, int personalNr) {
		super(archiviert, vorname, nachname);
		this.personalNr = personalNr;
	}

	public int getPersonalNr() {
		return personalNr;
	}

	public void setPersonalNr(int personalNr) {
		this.personalNr = personalNr;
	}

	@Override
	public String getAktenzeichen() {
		return "P"+getPersonalNr();
	}

}
