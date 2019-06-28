package de.vit_bund.lehre.m08.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> wortliste = new ArrayList<String>();
		wortliste.add("Hallo");
		wortliste.add("schöne");
		wortliste.add("Welt");
	
		
		// Eintrag hinzufügen an bestimmter Stelle:
		wortliste.add(2, "neue");
		
		//Ausgabe über die ForEach
		for(String wort : wortliste) {
			System.out.println(wort);
		}
		
		//Wieviele Elemente sind hier vorhanden:
		System.out.println("Anzahl Einträge: "+wortliste.size());

		
		// Entfernen: (immer nur der erste gefundene Eintrag)
		wortliste.remove("neue");
		
		//Wievile Elemente sind hier vorhanden:
		System.out.println("Anzahl Einträge: "+wortliste.size());
		
		//isEmpty guckt nach ob es ein Element Nr.1 gibt und gibt dann true/false zurück
		//.size()==0 schaut wie lang die Liste ist und vergleicht dann mit 0.. kann bei 1Mio Einträgen länger dauern.
		wortliste.isEmpty();
		
	}

}
