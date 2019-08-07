package de.vit.bund.lehre.m08.aktenverwaltung;

public class Kundenakte extends Personenakte implements IDruckbar {
	private int kundenNr;

	public Kundenakte(boolean archiviert, String vorname, String nachname, int kundenNr) {
		super(archiviert, vorname, nachname);
		this.kundenNr = kundenNr;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public void setKundenNr(int kundenNr) {
		this.kundenNr = kundenNr;
	}

	@Override
	public void drucken(Drucker drucker) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public String getDruckausgabe() {
		String ausgabe = getAktenzeichen()+" - "+getKundenNr();
		return ausgabe;
	}

	@Override
	public String getAktenzeichen() {
		return "K"+getKundenNr();
	}
}
