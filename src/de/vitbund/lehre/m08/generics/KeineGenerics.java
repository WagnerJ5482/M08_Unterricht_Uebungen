package de.vitbund.lehre.m08.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author merten
 */
public class KeineGenerics {
	
	public static void main(String[] args) {
		
		
		Integer zahl = 42;
		String text = "Keine Panik!";
		
		// Typinformation geht verloren
		Object objekt1 = zahl;
		Object objekt2 = text;
		
		// Typinformation durch Cast wieder herstellen
		Integer zahl2 = (Integer) objekt1;
		String text2 = (String) objekt2;
		
		
		// Listen vor Java 5
		List liste = new ArrayList();
		
		// Liste nimmt alle Objekte auf
		liste.add(1337);
		liste.add(true);
		liste.add("Guten Tag!");
		
		// ... und liefert auch nur Object zurück...
		Integer integer = (Integer) liste.get(0);
		Boolean bool = (Boolean) liste.get(1);
		String string = (String) liste.get(2);
	
	}
	
	
	
}
