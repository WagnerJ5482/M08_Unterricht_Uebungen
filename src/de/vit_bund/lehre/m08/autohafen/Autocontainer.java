package de.vit_bund.lehre.m08.autohafen;

import java.util.Arrays;
import java.util.List;


public class Autocontainer {
	private String zielort;
	private int zaehlerAutos;
	private int anzahlAutos;
	private Auto[] inhalt;
	
	public Autocontainer(String zielort, int anzahlAutos) {
		setInhalt(new Auto[anzahlAutos]);
		setZielort(zielort);
		setAnzahlAutos(anzahlAutos);		
	}
	
	public void addAuto(Auto auto) {
		List<Auto> autocontainer = Arrays.asList(getInhalt());
		autocontainer.add(auto);
		setInhalt(autocontainer.toArray(getInhalt()));
	}
	
	public void printAutoliste() {
		
	}
	
	public void berechnePreisMax() {
		
	}

	public String getZielort() {
		return zielort;
	}

	public void setZielort(String zielort) {
		this.zielort = zielort;
	}

	public int getZaehlerAutos() {
		return zaehlerAutos;
	}

	public void setZaehlerAutos(int zaehlerAutos) {
		this.zaehlerAutos = zaehlerAutos;
	}

	public int getAnzahlAutos() {
		return anzahlAutos;
	}

	public void setAnzahlAutos(int anzahlAutos) {
		this.anzahlAutos = anzahlAutos;
	}

	public Auto[] getInhalt() {
		return inhalt;
	}

	public void setInhalt(Auto[] inhalt) {
		this.inhalt = inhalt;
	}
	
}
