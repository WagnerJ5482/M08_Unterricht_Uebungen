package de.vit.assoziationen;

import java.util.Date;

public class Person {
	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	private Adresse[] adressen;
	
	public Person(String vorname, String nachname) {
		super();
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

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Adresse[] getAdressen() {
		return adressen;
	}

	public void setAdressen(Adresse[] adressen) {
		this.adressen = adressen;
	}

}
