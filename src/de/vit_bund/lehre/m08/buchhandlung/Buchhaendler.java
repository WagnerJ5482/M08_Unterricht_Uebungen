package de.vit_bund.lehre.m08.buchhandlung;

public class Buchhaendler {

	public static void main(String[] args) {
		Buch buch1 = new Buch("J.R.R. Tolkien", "Herr der Ringe", 29.95, 12);
		Buch buch2 = new Buch("George R.R. Martin", "GoT", 25.00, 3);
		Buch buch3 = new Buch("J.K Rowling", "Harry Potter und der Stein der Weisen", 14.95, 1);
		Buch buch4 = new Buch("Michael Ende", "Der satanarchäolügenialkohöllische Wunschpunsch", 17.95, 2);
		Buch buch5 = new Buch("Walter Moers", "Die 13,5 Leben des Käptain Blaubär", 39.99, 1);
		// System.out.println(buch1.berechneMwSt(0.07));
		// buch1.gibInfos();
		// System.out.println("Bruttopreis: "+buch1.getBruttopreis());
		// System.out.println("MwSt: "+buch1.berechneMwSt());
		// buch2.gibInfos();
		// System.out.println("Bruttopreis: "+buch2.getBruttopreis());
		// System.out.println("MwSt: "+buch2.berechneMwSt());
		// buch3.gibInfos();
		// System.out.println("Bruttopreis: "+buch3.getBruttopreis());
		// System.out.println("MwSt: "+buch3.berechneMwSt());

		/*
		 * Zusatzaufgaben Array
		 */
		Buch[] bucharray = new Buch[2];
		bucharray[0] = buch1;
		bucharray[1] = buch2;

		System.out.println(bucharray[1].getTitel());

		Buchpaket paket2 = new Buchpaket();
		paket2.setUeberschrift("blöder Titel");
		paket2.setInhalt(bucharray);
		System.out.println(paket2.getInhalt()[0].getTitel()); // Nice ( getterMethode und dann den index)

		/*
		 * Ende Zusatzaufgaben
		 */

		Buchpaket paket1 = new Buchpaket("Fantasy Paket1", 5);
		paket1.addBuch(buch1);
		paket1.addBuch(buch2);
		paket1.addBuch(buch3);
		paket1.addBuch(buch4);
		paket1.addBuch(buch5);
		System.out.println(paket1.berechneGesamtpreis(5));
		// paket1.printListe();
		// System.out.println("Gesamtpreis: " +paket1.berechneGesamtpreis()+ "€");

		// buch1.bestimmeBestseller();
		// buch2.bestimmeBestseller();
		// buch3.bestimmeBestseller();
		// buch4.bestimmeBestseller();
		// buch5.bestimmeBestseller();
	}

}
