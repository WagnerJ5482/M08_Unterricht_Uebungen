package de.vit.akteure;

import de.vit.literatur.model.Buch;

public class Autor {
	private int id;
	private String vorname;
	private String nachname;
	private Buch[] werke;
	
	
	public Autor(int id, String vorname, String nachname, Buch[] werke) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.werke = werke;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Buch[] getWerke() {
		return werke;
	}
	public void setWerke(Buch[] werke) {
		this.werke = werke;
	}

}
