package de.vitbund.lehre.m08.generics;

public class GenerischerSpeicherDemo {

	public static void main(String[] args) {
		
		// erzeuge einen Speicher für Strings
		GenerischerSpeicher<String> stringSpeicher
				= new GenerischerSpeicher<>();
		
		stringSpeicher.speichere("Guten Tag");
		stringSpeicher.speichere("Auf Wiedersehen");
		String zeichenkette = stringSpeicher.gibObjekt(0);
		System.out.println(zeichenkette);
		
		// erzeuge einen Speicher für Integer
		GenerischerSpeicher<Integer> integerSpeicher
				= new GenerischerSpeicher<>();
		
		integerSpeicher.speichere(1);
		integerSpeicher.speichere(42);
		Integer integerZahl = integerSpeicher.gibObjekt(1);
		System.out.println(integerZahl);
		
		// die beiden Speicher speichern unterschiedliche
		// Typen - basieren sie auf gleiche Klassen?
		Class c1 = stringSpeicher.getClass();
		Class c2 = integerSpeicher.getClass();
		boolean gleicheKlasse = c1.equals(c2);
		if(gleicheKlasse) {
			System.out.println("gleiche Klasse!");
		} else {
			System.out.println("unterschiedliche Klassen!");
		}
		
		NummernSpeicher<Double> doubleSpeicher
				= new NummernSpeicher<>();
		doubleSpeicher.speichere(42.0);
		doubleSpeicher.speichere(128.1);
		
		System.out.println(doubleSpeicher.gibSumme());
	
	}
}

