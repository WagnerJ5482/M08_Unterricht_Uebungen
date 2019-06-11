package de.vit.assoziationen;

public class Adresse {
	private String typ;
	private String strasse;
	private int hausnummer;
	private final Person bewohner; 
	private Ort ort;
	
	public Adresse(Person bewohner,String typ, String strasse, int hausnummer) {
		this.bewohner = bewohner;
		this.typ = typ;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}
	
	
	public Person getBewohner() {
		return this.bewohner;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}



	public Ort getOrt() {
		return ort;
	}



	public void setOrt(Ort ort) {
		this.ort = ort;
	}

}
