package de.vit_bund.lehre.m08.buchhandlung;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Buchpaket {
	private String ueberschrift;
	private int zaehlerBuecher;
	private Buch[] inhalt;

	public Buchpaket() {
	}

	public Buchpaket(String ueberschrift, int anzahlBuecher) {
		setUeberschrift(ueberschrift);
		setInhalt(new Buch[anzahlBuecher]);
		setZaehlerBuecher(0);
	}


	public void addBuch(Buch buch) {
		if (getZaehlerBuecher()<getInhalt().length) {
			getInhalt()[getZaehlerBuecher()] = buch;
			setZaehlerBuecher(zaehlerBuecher++);
		}
		else
			System.out.println("Das Buchpaket ist voll");

		//		ArrayList<Buch> buchliste = new ArrayList<Buch>(Arrays.asList(getInhalt()));
		//		buchliste.add(buch);
		//		while (buchliste.remove(null))
		//		setInhalt(buchliste.toArray(getInhalt()));
	}

	public void printListe(){
		System.out.println("Buchpaket " + getUeberschrift()+ ": ");
		for(Buch printliste : getInhalt()) {
			if(printliste != null) {						// k.A. warum !printliste.equals(null) nicht klappt
				System.out.println(printliste.getTitel()+"; ");
			}
		}
	}

	public double berechneGesamtpreis() {
		double gesamtpreis = 0.0;
		int zaehlerBuchliste = 0;
		while(zaehlerBuchliste < getInhalt().length 
				&& getInhalt()[zaehlerBuchliste] != null ) {
			gesamtpreis += getInhalt()[zaehlerBuchliste].getPreis();
			zaehlerBuchliste ++;
		}

		// Für Arrays mit Lücken:
		//		while (zaehlerBuchliste < getInhalt().length) {
		//			Buch buch = inhalt[zaehlerBuchliste];
		//			if (buch != null) {
		//				gesamtpreis += buch.getPreis();
		//			}
		//			zaehlerBuchliste++;
		//		}

		// ForEach Schleife:
		//		for(Buch buchliste : getInhalt()){
		//		if (buchliste != null) {
		//			gesamtpreis =+ buchliste.getBruttopreis();
		//		}
		//		}

		return gesamtpreis;
	}

	public String getUeberschrift() {
		return ueberschrift;
	}
	public void setUeberschrift(String ueberschrift) {
		this.ueberschrift = ueberschrift;
	}
	public int getZaehlerBuecher() {
		return zaehlerBuecher;
	}
	public void setZaehlerBuecher(int zaehlerBuecher) {
		this.zaehlerBuecher = zaehlerBuecher;
	}

	public Buch[] getInhalt() {
		return inhalt;
	}
	public void setInhalt(Buch[] inhalt) {
		this.inhalt = inhalt;
	}


}
