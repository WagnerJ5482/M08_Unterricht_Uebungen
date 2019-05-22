package de.vit_bund.lehre.m08.bruch;

public class Bruch {
	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner) {
		setZaehler(zaehler);
		setNenner(nenner);
	}
	
	public void ausgabe() {
		System.out.println("Zaehler = "+getZaehler() + "Nenner = " + getNenner());
	}
	
	public Bruch subtrahiere(Bruch bruch) {
		int zaehlerNeu = getZaehler()*bruch.getNenner()-getNenner()*bruch.getZaehler();
		int nennerNeu = getNenner()*bruch.getNenner();
		return new Bruch(zaehlerNeu, nennerNeu);
	}
	public Bruch addiere(Bruch bruch) {
		int zaehlerNeu = getZaehler()*bruch.getNenner()+getNenner()*bruch.getZaehler();
		int nennerNeu = getNenner()*bruch.getNenner();
		return new Bruch(zaehlerNeu, nennerNeu);
	}
	
	
	public int getZaehler() {
		return zaehler;
	}
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}
	public int getNenner() {
		return nenner;
	}
	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
	

}
