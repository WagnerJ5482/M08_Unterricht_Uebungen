package de.vit.bund.lehre.m08.aktenverwaltung;

import java.util.LinkedList;
import java.util.Queue;

public class Drucker {
	private Queue<IDruckbar> druckauftraege = new LinkedList<IDruckbar>();
	
	public void addDruckauftrag(IDruckbar druckbar) {
		druckauftraege.offer(druckbar);
	}
	
	public void naechstenAuftragDrucken() {
		drucken(druckauftraege.poll().getDruckausgabe());
	}
	
	private void drucken(String ausgabe) {
		System.out.println(ausgabe);
	}
}
