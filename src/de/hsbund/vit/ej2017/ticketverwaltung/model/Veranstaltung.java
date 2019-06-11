package de.hsbund.vit.ej2017.ticketverwaltung.model;

public class Veranstaltung {
	String kuerzel;
	String name;
	String beschreibung;
	Ticket[] tickets;
	
	

	public Veranstaltung(String kuerzel, String name, String beschreibung, int ticketAnzahl) {
		super();
		this.kuerzel = kuerzel;
		this.name = name;
		this.beschreibung = beschreibung;
		for (int i = 0; i < ticketAnzahl; i++) {
			this.tickets[i] = new Ticket(i + 1, false);};// Erstellen des unverkauften Tickets mit der Nummer (i+1) an der Stelle i
	}
	

	public String getKuerzel() {
		return kuerzel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public Ticket[] getTickets() {
		return tickets;
	}

	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;
	}

}
