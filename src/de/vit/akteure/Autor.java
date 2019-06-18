package de.vit.akteure;

import de.vit.literatur.model.Abschlussarbeit;
import de.vit.literatur.model.Beitrag;
import de.vit.literatur.model.Buch;
import de.vit.literatur.model.IHerausgegeben;
import de.vit.literatur.model.IVerfasst;

public class Autor {
	private int id;
	private String vorname;
	private String nachname;
	
	private Buch[] werke;
	private Abschlussarbeit[] abschlussarbeiten;
	private Beitrag[] beitraege;
	
	private IHerausgegeben[] herausgaben;
	private IVerfasst[] publikationen;
	
	public Autor() {
		
	}
	
	public Autor(String vorname, String nachname) {
		this();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof Autor))
			return false;
		if (arg0 == this)
			return true;
		Autor autor = (Autor) arg0;
		return this.nachname.equals(autor.nachname) && this.vorname.equals(autor.vorname);
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
