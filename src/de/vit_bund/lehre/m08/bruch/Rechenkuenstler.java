package de.vit_bund.lehre.m08.bruch;

public class Rechenkuenstler {
	
	public static void main(String[] args) {
		Bruch bruch2_3 = new Bruch(2,3);
		Bruch bruch1_2 = new Bruch(1,2);
		Bruch bruch3_4 = new Bruch(3,4);
		Bruch bruch1_4 = new Bruch(1,4);
		
		
		bruch2_3.addiere(bruch3_4).ausgabe();
		bruch1_2.addiere(bruch1_2).ausgabe();
		bruch2_3.subtrahiere(bruch1_4).ausgabe();
		bruch1_2.subtrahiere(bruch1_2).ausgabe();
	}

}
