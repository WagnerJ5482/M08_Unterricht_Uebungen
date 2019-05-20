package de.vit_bund.lehre.m08.autohafen;

public class Auto {
	private String name;
	private String hersteller;
	private String frabe;
	private boolean cabriolet;
	private double preis;
	
	public void gibInfos() {
		
	}
	
	public double berechnePreisNeu(double prozenSatz) {
		return 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public String getFrabe() {
		return frabe;
	}

	public void setFrabe(String frabe) {
		this.frabe = frabe;
	}

	public boolean isCabriolet() {
		return cabriolet;
	}

	public void setCabriolet(boolean cabriolet) {
		this.cabriolet = cabriolet;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
}
