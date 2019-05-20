package de.vit_bund.lehre.m08.autohafen;

public class Autoverladung {

	public static void main(String[] args) {
		Auto auto1 = new Auto("A2", "Audi", "champagner", true,36999.99);
		Auto auto2 = new Auto("Golf","VW","schwarz",true,28800.00);
		Auto auto3 = new Auto("Espace","Renault","crimson",false,38800.00);
		Auto auto4 = new Auto("A8","Audi","nachtblau",false, 84160.00);
		
//		auto1.gibInfos();
//		System.out.println();
//		auto2.gibInfos();
//		System.out.println();
//		auto3.gibInfos();
//		System.out.println();
//		auto4.gibInfos();
//		System.out.println();
//		
//		System.out.println(auto1.berechnePreisNeu(14));
//		System.out.println(auto2.berechnePreisNeu(14));
//		System.out.println(auto3.berechnePreisNeu(14));
//		System.out.println(auto4.berechnePreisNeu(14));
		
		Autocontainer autocontainer1 = new Autocontainer("Sydney", 3);
		autocontainer1.addAuto(auto1);
		autocontainer1.addAuto(auto2);
		autocontainer1.addAuto(auto3);
		autocontainer1.addAuto(auto4);
		autocontainer1.printAutoliste();
		
		
	}
}
