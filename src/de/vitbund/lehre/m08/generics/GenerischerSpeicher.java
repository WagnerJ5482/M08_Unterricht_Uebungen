package de.vitbund.lehre.m08.generics;

public class GenerischerSpeicher<T> {

	/*
	 * Private Klasse f�r verkettete Liste: Das Kettenelement
	 */
	private class KettenElement {
		// Referenz auf zu speicherndes Objekt
		T speicher;
		// Referenz auf das n�chste Element der Kette
		KettenElement naechstesElement;
	}

	// Anzahl der gespeicherten Objekte
	private int eintraege = 0;
	// Referenz auf den Anfang der Kette
	private KettenElement anfang = new KettenElement();
	
	/*
	 * Private Methode, um an eine bestimmte Stelle der Kette zu
	 * laufen. Erweitert die Kette wenn n�tig.
	 */
	private KettenElement laufeZuElement(int elementIndex) {
		// beginne am Anfang der Kette
		KettenElement aktuell = anfang;

		// laufe die passende Zahl an Schritten
		for(int i = 0; i < elementIndex; ++i) {
			// erzeuge n�chstes Element wenn es nicht existiert
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
		// erh�he Anzahl der Eintr�ge
		eintraege++;
	}
	
	/*
	 * Methode, um ein gespeichertes Objekt an einer bestimmten
	 * Position zu finden.
	 */
	public T gibObjekt(int objektindex) {
		// finde Kettenelement mit gegebener Position
		KettenElement element = laufeZuElement(objektindex);
		// gib das gespeicherte Objekt zur�ck
		return element.speicher;
	}
	
	/*
	 * Gibt die Anzahl der gespeicherten Objekte zur�ck
	 */
	public int gibLaenge() {
		return eintraege;
	}

}


