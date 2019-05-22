package de.vit_bund.lehre.m08.bruch;

public class Rechenkuenstler {
	
	public static void main(String[] args) {
		Bruch bruch1 = new Bruch(2,3);
		Bruch bruch2 = new Bruch(1,2);
		Bruch bruch3 = new Bruch(3,4);
		
		bruch1.addiere(bruch2).ausgabe();
	}

}
