package de.vit.literatur;

import de.vit.akteure.Autor;
import de.vit.literatur.model.Abschlussarbeit;
import de.vit.literatur.model.Beitrag;
import de.vit.literatur.model.Buch;
import de.vit.literatur.model.IVerfasst;
import de.vit.literatur.model.Literatur;
import de.vit.literatur.model.Sammelband;

public class Literaturverwaltung {
	public static void main(String[] args) {
		
		Literatur[] literatur = new Literatur[10];
		

		// Autoren
		Autor jkr = new Autor("Joan K.", "Rowling");
		Autor tht = new Autor("Thadeus", "Theorie");
		Autor sch = new Autor("Simone", "Schnauzer");
		Autor tta = new Autor("Timon", "Tatze");
		Autor vvl = new Autor("Volker", "Verleger");
		Autor lll = new Autor("Luisa", "Lektorin");

		// Abschlussarbeit mit Titel erstellen
		Abschlussarbeit a = new Abschlussarbeit("Formale Methoden in der altägyptischen Algebra", "Masterarbeit");
		a.setAutoren(new Autor[] { tht });
		literatur[0] = a;

		// Sammelband mit Titel erstellen
		Sammelband band = new Sammelband("Lustige Kurzgeschichten", 2011);
		Autor[] herausgeber = new Autor[] { vvl, lll };
		band.setHerausgeber(herausgeber);
		// Beträge mit Titel für Sammelband erstellen
		Beitrag b1 = new Beitrag("Hot Dog: Wenn Hunde grillen", band);
		b1.setAutoren(new Autor[] { sch });
		Beitrag b2 = new Beitrag("Meowgeddon: Wie Katzen das Internet �bernahmen", band);
		b2.setAutoren(new Autor[] { tta });
		// Beiträge in Array ablegen
		Beitrag[] beitraege = { b1, b2 };
		// Beiträge dem Sammelband hinzufügen
		band.setBeitraege(beitraege);
		// Titel des Sammelbands ausgeben
		literatur[1] = band;

		// Buch mit Autorin
		Buch buch = new Buch("Harry Potter und der Halbblutprinz", 3, 1);
		buch.getAutoren()[0] = jkr;
		buch.setBeschreibung("Das sechste Abenteuer für den Zauberschüler mit der Blitznarbe ...");
		literatur[2] = buch;
		
//		System.out.println(l.getInfo());
//		System.out.println(a.getInfo());
//		System.out.println(band.getInfo());
		
		for(Literatur lit : literatur) {
			if(lit != null) {
				System.out.println(lit.getInfo());
				System.out.println("\t" + lit.getBeschreibung());
			}
		}
		
		IVerfasst[] publikationen = new IVerfasst[5];
		publikationen[0]=a;
		publikationen[1]=buch;
		publikationen[2]=b1;
		
		
	}

}
