package de.vit.bund.lehre.m08.aktenverwaltung;

public class Dienstleistungsakte extends Akte implements IDruckbar {
	private int dienstleistungsNr;
	private String dienstleitungsName;
	private String beschreibung;

	public Dienstleistungsakte(boolean archiviert, int dienstleistungsNr, String dienstleitungsName,
			String beschreibung) {
		super(archiviert);
		this.dienstleistungsNr = dienstleistungsNr;
		this.dienstleitungsName = dienstleitungsName;
		this.beschreibung = beschreibung;
	}

	public int getDienstleistungsNr() {
		return dienstleistungsNr;
	}

	public void setDienstleistungsNr(int dienstleistungsNr) {
		this.dienstleistungsNr = dienstleistungsNr;
	}

	public String getDienstleitungsName() {
		return dienstleitungsName;
	}

	public void setDienstleitungsName(String dienstleitungsName) {
		this.dienstleitungsName = dienstleitungsName;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	@Override
	public void drucken(Drucker drucker) {
		
	}

	@Override
	public String getDruckausgabe() {
		String ausgabe = getAktenzeichen()+"- "+getDienstleistungsNr()+" - "+getDienstleitungsName()+" - "+getBeschreibung();
		return ausgabe;
	}

	@Override
	public String getAktenzeichen() {
		return "D" + getDienstleistungsNr();
	}

}
