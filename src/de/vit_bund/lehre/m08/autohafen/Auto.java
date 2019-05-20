package de.vit_bund.lehre.m08.autohafen;

public class Auto {
	private String name;
	private String hersteller;
	private String farbe;
	private boolean cabriolet;
	private double preis;
	
	public Auto(String name, String hersteller, String farbe, boolean cabriolet, double preis) {
		setName(name);
		setHersteller(hersteller);
		setFarbe(farbe);
		setCabriolet(cabriolet);
		setPreis(preis);
	}
	
	public void gibInfos() {
		System.out.print("Name: "+getName()+";");
		System.out.print("Hersteller: "+getHersteller()+";");
		System.out.print("Farbe: "+getFarbe()+" kg;");
		System.out.print("Preis "+getPreis()+";");	
	}
	
	public double berechnePreisNeu(double prozenSatz) {
		return getPreis()-(getPreis()*(prozenSatz/100));
		
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

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
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
