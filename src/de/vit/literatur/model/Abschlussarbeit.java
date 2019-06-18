package de.vit.literatur.model;

public class Abschlussarbeit extends Monographie {
	private String typ;	
	
	public Abschlussarbeit(String titel,String typ) {
		this(titel);
		this.typ = typ;
	}
	
	public Abschlussarbeit(String titel) {
		super(titel,1);
	}
	
	
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}


	public String getBeschreibung() {
		return getTyp();
	}
	
	
	public String getInfo() {
		return super.getInfo() + " (" + this.typ + ")";
	}



}
