package de.vit_bund.lehre.m08.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> wortliste = new ArrayList<String>();
		wortliste.add("Hallo");
		wortliste.add("sch�ne");
		wortliste.add("Welt");
	
		
		// Eintrag hinzuf�gen an bestimmter Stelle:
		wortliste.add(2, "neue");
		
		//Ausgabe �ber die ForEach
		for(String wort : wortliste) {
			System.out.println(wort);
		}
		
		//Wieviele Elemente sind hier vorhanden:
		System.out.println("Anzahl Eintr�ge: "+wortliste.size());

		
		// Entfernen: (immer nur der erste gefundene Eintrag)
		wortliste.remove("neue");
		
		//Wievile Elemente sind hier vorhanden:
		System.out.println("Anzahl Eintr�ge: "+wortliste.size());
		
		//isEmpty guckt nach ob es ein Element Nr.1 gibt und gibt dann true/false zur�ck
		//.size()==0 schaut wie lang die Liste ist und vergleicht dann mit 0.. kann bei 1Mio Eintr�gen l�nger dauern.
		wortliste.isEmpty();
		
	}

}
