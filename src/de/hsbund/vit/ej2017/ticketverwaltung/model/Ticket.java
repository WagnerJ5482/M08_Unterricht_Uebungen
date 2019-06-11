package de.hsbund.vit.ej2017.ticketverwaltung.model;

/**
 * Eine Klasse die ein Ticket repräsentiert.
 * @author Jens.Wagner
 *
 */
public class Ticket {

	private int nummer;
	private boolean verkauft;
	
	/**
	 * Konstruktor für die Klasse Ticket
	 * @param nummer - Ticketnummer
	 * @param verkauft - Ja oder nein
	 */
	public Ticket(int nummer, boolean verkauft) {
		this.nummer = nummer;
		this.verkauft = verkauft;
	}
	
	/**
	 * Methode um den Preis des Tickets zu berechen.
	 * @return Preis: double
	 */
	
	public double getPreis() {
		return 49.95;
	}
	
	/**
	 * Die forlaufende Nummer des Tickets als Integer.
	 * @return Nummer:int
	 */
	public int getNummer() {
		return nummer;
	}
	/**
	 * setzen der Nummer
	 * @param nummer : int
	 */
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	/**
	 * Ist das Ticket verkauft
	 * @return verkauft : boolean
	 */
	public boolean isVerkauft() {
		return verkauft;
	}
	/**
	 * Setze ob das Ticket verauft ist
	 * @param verkauft : boolean
	 */
	public void setVerkauft(boolean verkauft) {
		this.verkauft = verkauft;
	}
	

}
