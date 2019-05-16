package de.vit_bund.lehre.m08.kraftfahrzeug;

public class Kennzeichen {
	private String kreis;
	private String buchstabenkombination;
	private int zahl;
	
	@Deprecated //(Danke Rubens für den Hinweis)
	public Kennzeichen() {};
	
	public Kennzeichen (String kreis, String buchstabenkombination) {
		setKreis(kreis);
		setBuchstabenkombination(buchstabenkombination);
		setZahl(setRandomZahl());
	}
	
	public Kennzeichen(String kreis, String buchstabenkombination,int zahl) {
		setKreis(kreis);
		setBuchstabenkombination(buchstabenkombination);
		setZahl(zahl);
	}
	
	public int setRandomZahl() {
		setZahl((int)(Math.random()*1000));
		return getZahl();
	}
	
	public String gibKennzeichen() {
		return getKreis()+" - "+getBuchstabenkombination()+" "+getZahl();
	}
	
	public String getKreis() {
		return kreis;
	}
	public void setKreis(String kreis) {
		this.kreis = kreis;
	}
	public String getBuchstabenkombination() {
		return buchstabenkombination;
	}
	public void setBuchstabenkombination(String buchstabenkombination) {
		this.buchstabenkombination = buchstabenkombination;
	}
	public int getZahl() {
		return zahl;
	}
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
}
