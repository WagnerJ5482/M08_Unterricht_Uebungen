package de.vitbund.lehre.m08.generics;

public class GenerischerSpeicher<T> {

	/*
	 * Private Klasse für verkettete Liste: Das Kettenelement
	 */
	private class KettenElement {
		// Referenz auf zu speicherndes Objekt
		T speicher;
		// Referenz auf das nächste Element der Kette
		KettenElement naechstesElement;
	}

	// Anzahl der gespeicherten Objekte
	private int eintraege = 0;
	// Referenz auf den Anfang der Kette
	private KettenElement anfang = new KettenElement();
	
	/*
	 * Private Methode, um an eine bestimmte Stelle der Kette zu
	 * laufen. Erweitert die Kette wenn nötig.
	 */
	private KettenElement laufeZuElement(int elementIndex) {
		// beginne am Anfang der Kette
		KettenElement aktuell = anfang;

		// laufe die passende Zahl an Schritten
		for(int i = 0; i < elementIndex; ++i) {
			// erzeuge nächstes Element wenn es nicht existiert
			if(aktuell.naechstesElement == null) {
				aktuell.naechstesElement = new KettenElement();
			}
			aktuell = aktuell.naechstesElement;
		}
		
		return aktuell;
	}
	
	/*
	 * Speichere ein Objekt des generischen Typs "T"
	 */
	public void speichere(T objekt) {
		// finde letztes Kettenelement
		KettenElement element = laufeZuElement(eintraege);
		// speichere dort das Objekt
		element.speicher = objekt;
		// erhöhe Anzahl der Einträge
		eintraege++;
	}
	
	/*
	 * Methode, um ein gespeichertes Objekt an einer bestimmten
	 * Position zu finden.
	 */
	public T gibObjekt(int objektindex) {
		// finde Kettenelement mit gegebener Position
		KettenElement element = laufeZuElement(objektindex);
		// gib das gespeicherte Objekt zurück
		return element.speicher;
	}
	
	/*
	 * Gibt die Anzahl der gespeicherten Objekte zurück
	 */
	public int gibLaenge() {
		return eintraege;
	}

}


