package de.vit_bund.lehre.m08.autohafen;

import java.util.ArrayList;
import java.util.Arrays;


public class Autocontainer {
	private String zielort;
	private int zaehlerAutos;
	private int anzahlAutos;
	private Auto[] inhalt;
	
	public Autocontainer(String zielort, int anzahlAutos) {
		setZielort(zielort);
		setAnzahlAutos(anzahlAutos);
		setInhalt(new Auto[getAnzahlAutos()]);
		setZaehlerAutos(0);
		
	}
	
	public void addAuto(Auto auto) {
		if (zaehlerAutos<anzahlAutos) {
			inhalt[zaehlerAutos] = auto;
			this.zaehlerAutos = this.zaehlerAutos + 1;}
		else {
				System.out.println("container is fully loaded");
			}
		}
//		ArrayList<Auto> buchliste = new ArrayList<Auto>(Arrays.asList(getInhalt()));
//		while (buchliste.remove(null));	
//		buchliste.add(auto);
//		setInhalt(buchliste.toArray(getInhalt()));
	
	public void printAutoliste() {
		for(Auto autoliste : getInhalt()) {
			autoliste.gibInfos();
		}
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
