package de.hsbund.vit.ej2017.ticketverwaltung;

import de.hsbund.vit.ej2017.io.Eingabe;
import de.hsbund.vit.ej2017.ticketverwaltung.model.Ticket;
import de.hsbund.vit.ej2017.ticketverwaltung.model.Veranstaltung;

/**
 * Dies ist eine Klasse zur Ticketverwaltung.
 * @author Jens.Wagner
 *
 */
public class Ticketverwaltung {
	static Veranstaltung[] veranstaltungen;
	public static void main(String[] args) {

		// Vorbereiten aller Tickets
		veranstaltungen =  new Veranstaltung[100];
//		veranstaltungErstellen();
		zeigeMenue();

//		// Bisher keine Tickets verkauft
//		boolean isAusverkauft = false;
//
//		// Wiederholte Abfrage des Ticketverkaufs
//		do {
//			// Zählen der verfügbaren Tickets seit dem letzten Verkauf
//			int anzahlFrei = 0;
//			for (Ticket ticket : tickets) {
//				if (ticket != null && ticket.isVerkauft() == false)
//					anzahlFrei++;
//			}
//			System.out.println("Es sind " + anzahlFrei + " Tickets verf�gbar!");
//
//			// Abfrage der Anzahl der Tickets für den Verkauf
//			System.out.println("Wieviele Tickets möchten Sie kaufen?");
//			int anzahl = Eingabe.leseZahl();
//
//			// Prüfung, ob noch genügend Tickets für gewählte Anzahl
//			if (anzahl <= anzahlFrei) {
//				// Verkauf der nächsten (anzahl) Tickets durch Herunterzählen
//				for (int i = anzahlFrei - 1; i >= anzahlFrei - anzahl; i--) {
//					tickets[i].setVerkauft(true);
//				}
//				// Ausverkauft, wenn die letzten Tickets verkauft wurden
//				if (anzahl == anzahlFrei) {
//					isAusverkauft = true;
//				}
//			} else {
//				System.out.println("Nicht genügend Tickets verf�gbar!");
//			}
//		} while (!isAusverkauft);

		// Abschluss nach Ausverkauf der Tickets
//		System.out.println("Die Tickets sind ausverkauft!!");

	}

	public static void veranstaltungErstellen() {
		System.out.println("Bitte geben Sie den das Kürzel ein: ");
		String kuerzel = Eingabe.leseZeile();
		System.out.println("Bitte geben Sie den Name der Veranstaltung ein: ");
		String name = Eingabe.leseZeile();
		System.out.println("Bitte geben Sie den die Beschreibung ein: ");
		String beschreibung = Eingabe.leseZeile();
		System.out.println("Bitte geben Sie die Anzahl der Tickets ein: ");
		int ticketAnzahl = Eingabe.leseZahl();
		Veranstaltung veranstaltung =  new Veranstaltung(kuerzel, name, beschreibung, ticketAnzahl);
		for (int i = 0; i <veranstaltungen.length;i++) {
			if(veranstaltungen[i] == null) {
				veranstaltungen[i]= veranstaltung;
				break;
			}
			
		}
		
	}
	
	public static void zeigeMenue() {
		System.out.println("*****************************");
		System.out.println("Wählen Sie einen der folgenden Menüpunkte: ");
		System.out.println("liste - Anzeigen der Veranstaltungsliste");
		System.out.println("neu- Anlegen einer neuer Veranstaltung");
		System.out.println("kaufen - Kaufen Sie ein neues Veranstaltungstickt");
		System.out.println("exit - Beenden Sie die Anwendung");
		String eingabe = Eingabe.leseZeile();
		switch(eingabe) {
		case "liste":
			System.out.println("liste");
		case "neu":
			System.out.println("neu");
		case "kaufen":
			System.out.println("kaufen");
		case "exit":
			break;
		
		}
		
	}
	
	
}
