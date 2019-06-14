package de.vit.literatur;

import de.vit.akteure.Autor;
import de.vit.literatur.model.Abschlussarbeit;
import de.vit.literatur.model.Beitrag;
import de.vit.literatur.model.Sammelband;

public class Literaturverwaltung {
	public static void main(String[] args) {
		Autor autor = new Autor(id, vorname, nachname, werke, abschlussarbeiten, beitraege);
		autor.setId(01);
		autor.setNachname("Rowling");
		autor.setVorname("Joanne K.");
		Autor[] autoren = new Autor;
		Abschlussarbeit abschlussarbeit = new Abschlussarbeit("bla blub", autoren );
		Beitrag[] beitraege = new Beitrag(sammelband)
		Sammelband sammelband = new Sammelband(herausgeber, erscheinungsjahr, beitraege);
		
		
	}

}
