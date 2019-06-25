package de.vitbund.lehre.m08.generics;

public class UebungGnerics {

	public static void main(String[] args) {
		GenerischerSpeicher<String> generic = new GenerischerSpeicher<String>();
		StringSpeicher s = new StringSpeicher();
		String[] array = { "Hallo", "Welt", "Es ist", "zu", "warm" };

		for (String a : array) {
			generic.speichere(a);
			s.speichere(a);
		}

		for (int i = 0; i < generic.gibLaenge(); i++) {
			System.out.println(generic.gibObjekt(i));
		}
		
		System.out.println(s.konkat());
		
		Paar<String, Integer> paar1 = new Paar<>("a", 42);
		Paar<Double, Double> paar2 = new Paar<>(1.5, 3.2);
		
		PaarSpeicher<String, Integer> paar3 = new PaarSpeicher<String, Integer>();
		}

	}

