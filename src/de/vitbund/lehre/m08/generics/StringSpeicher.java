package de.vitbund.lehre.m08.generics;

public class StringSpeicher extends GenerischerSpeicher<String> {

	public String konkat() {
		String ergebnis = "";
		for (int i = 0;i<this.gibLaenge();i++) {
			ergebnis +=this.gibObjekt(i) + " ";
		}
		return ergebnis;
				
	}
}
