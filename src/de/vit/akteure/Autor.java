package de.vit.akteure;

import de.vit.literatur.model.Abschlussarbeit;
import de.vit.literatur.model.Beitrag;
import de.vit.literatur.model.Buch;

public class Autor {
	private int id;
	private String vorname;
	private String nachname;
	
	private Buch[] werke;
	private Abschlussarbeit[] abschlussarbeiten;
	private Beitrag[] beitraege;
	
	public Autor() {
		
	}
	
	public Autor(int id, String vorname, String nachname) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
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
	public Abschlussarbeit[] getAbschlussarbeiten() {
		return abschlussarbeiten;
	}
	public void setAbschlussarbeiten(Abschlussarbeit[] abschlussarbeiten) {
		this.abschlussarbeiten = abschlussarbeiten;
	}
	public Beitrag[] getBeitraege() {
		return beitraege;
	}
	public void setBeitraege(Beitrag[] beitraege) {
		this.beitraege = beitraege;
	}

}
