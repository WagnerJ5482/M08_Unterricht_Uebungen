package de.vit_bund.lehre.m08.kraftfahrzeug;

public class Kfz {
	private String farbe;
	private int gewicht;
	private String marke;
	private Kennzeichen kennzeichen;
	private int anzahlRaeder;
	
	@Deprecated //(Danke Rubens für den Hinweis)
	public Kfz() {};
	
	public Kfz(String farbe, int gewicht, String marke, Kennzeichen kennzeichen, int anzahlRaeder) {
		setFarbe(farbe);
		setGewicht(gewicht);
		setMarke(marke);
		setKennzeichen(kennzeichen);
		setAnzahlRaeder(anzahlRaeder);
	}
	
	public int gibAchslastDurchschnittRaeder() {
			return getGewicht()/(getAnzahlRaeder()/2);
	}
	
	public void gibInfos() {
		System.out.print("Farbe: "+getFarbe()+";");
		System.out.print("Marke: "+getMarke()+";");
		System.out.print("Gewicht: "+getGewicht()+" kg;");
		System.out.print("RÃ¤der "+getAnzahlRaeder()+";");
		System.out.print("Kennzeichen: "+getKennzeichen().gibKennzeichen()+";");	
	}
		
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public String getMarke() {
		return marke;
	}
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public Kennzeichen getKennzeichen() {
		return kennzeichen;
	}
	public void setKennzeichen(Kennzeichen kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}
	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}
	
}
