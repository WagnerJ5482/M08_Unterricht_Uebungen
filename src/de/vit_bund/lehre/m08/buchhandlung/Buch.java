package de.vit_bund.lehre.m08.buchhandlung;
import java.util.Currency;

public class Buch {
	private String autor;
	private String titel;
	private double preis;
	private int auflage;
	private int nachkommstellen;

	@Deprecated
	public Buch() {};

	public Buch( String autor, String titel, double preis, int auflage) {
		if (preis >= 0.0 )setPreis(preis);
		else {System.out.println("Preis ungültig und wird auf 0.0 gesetzt");
				setPreis(0.0);};
		setAuflage(auflage);
		setAutor(autor);
		setTitel(titel);
		setNachkommstellen(2);
	}

	public void gibInfos() {
		Currency waehrung = Currency.getInstance("EUR");
		System.out.println("------------------------------------");
		System.out.println( "Autor: "+this.getAutor());
		System.out.println("Titel: "+this.getTitel());
		System.out.println("Nettopreis: "+this.getPreis()+" "+waehrung.getSymbol());
		System.out.println("Auflage: "+this.getAuflage());
		System.out.println("------------------------------------");

	}
	
	public void bestimmeBestseller() {
		switch (getAuflage()) {
		case 1:
			System.out.println("Neuerscheinung");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Aufsteiger");
			break;
		default:
			System.out.println("Bestseller");
		}
	}
	

    public double round(double value) {
        return Math.round(Math.pow(10.0, this.nachkommstellen) * value) / Math.pow(10.0, this.nachkommstellen);
    }

	public double berechneMwSt() {
		return round(berechneMwSt(0.07));

	}

	public double berechneMwSt(double mwstSatz) {
		return round(this.preis*mwstSatz);
	}

	public void setBruttopreis(double bruttoPreis) {
		this.preis = bruttoPreis / 1.07;
	}

	public double getBruttopreis() {
		return round(this.preis*1.07);
	}

	/*
	 * Standard Getter und Setter
	 */

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public int getAuflage() {
		return auflage;
	}

	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}

	public int getNachkommstellen() {
		return nachkommstellen;
	}

	public void setNachkommstellen(int nachkommstellen) {
		this.nachkommstellen = nachkommstellen;
	}

}