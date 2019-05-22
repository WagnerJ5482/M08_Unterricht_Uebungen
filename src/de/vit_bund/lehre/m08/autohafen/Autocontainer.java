package de.vit_bund.lehre.m08.autohafen;

import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.Arrays;


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
			this.zaehlerAutos++;}
		//kürzer: inhalt[zaehlerAutos++]=auto;
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
			System.out.println();
		}
		}

	
	public void berechnePreisMax() {
		double gesamtpreis = 0.0;
		for(Auto autoliste : getInhalt()) {
			if (autoliste.getPreis()>gesamtpreis) {
				gesamtpreis =+ autoliste.getPreis();
			}
		}
		System.out.println(gesamtpreis);
	}

	public void kategorisiereContainer() {
		switch (zaehlerAutos) {
		case 0:
		case 1: 
		case 2:
		case 3:
			System.out.println("leicht");
			break;
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("medium");
			break;
		default:
			System.out.println("schwer");
		}
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
