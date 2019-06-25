package de.vitbund.lehre.m08.generics;


public class NummernSpeicher<T extends Number>
				extends GenerischerSpeicher<T> {

	public double gibSumme() {
		double summe = 0;
		
		// iteriere �ber alle Elemente, bilde Summe
		for(int i = 0; i < gibLaenge(); ++i) {
			// wir wissen, dass T-Objekte auch Number sind!
			Number n = gibObjekt(i);
			
			// summiere Flie�kommawert auf
			summe += n.doubleValue();
		}
		
		return summe;
	}

}
