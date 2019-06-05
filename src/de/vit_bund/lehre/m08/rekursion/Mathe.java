package de.vit_bund.lehre.m08.rekursion;

import java.util.Arrays;

public class Mathe {

	public static void main(String[] args) {
//		System.out.println(add(5, 0));
//		System.out.println(multiply(-3, 8));
//		primzahl(10);
		System.out.println(Arrays.toString(potenzen2(10)));

	}

	public static int add(int a, int b) {
		if (a == 0)
			return b;
		if (a < 0) {
			return add(++a, --b);
		} else
			return add(--a, ++b);

	}

	public static int multiply(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		return a + multiply(a, b - 1);
	}

	public static void primzahl(int n) {
			// n : Grenze bis zu der Primzahlen gesucht werden
			// beginne bei der Zahl 2 da 1 keine Primzahl ist
			for (int i = 2; i <= n; i++) {
				// isPrimzahl ist ein Wahrheitswert, um zu überprüfen ob wir eine
				// Primzahl gefunden haben. falls nicht wird sie später auf false
				// gesetzt.
				boolean isPrimzahl = true;
				// i durch jede Zahl kleiner als i zu teilen und zu überprüfen, ob
				// ein Rest übrig bleibt. BSP. im wiki 25=i und j wäre die Variable
				// die hochgezählt wird
				for (int j = 2; j < i && isPrimzahl; j++) {
					// Wenn eine division als rest 0 hat dann ist die Zahl keine
					// Primzahl und somit ist isPrimzahl auf false zu setzten
					if ((i % j) == 0) {
						isPrimzahl = false;
					}
				}
				// gib eine Meldung aus falls es sich um eine Primzahl handelt.
				if (isPrimzahl) {
					System.out.println(i + " ist eine Primzahl!");
				}
		}
	}
	/*
	 * methode um 2er Potenzen in ein Array zu schreiben. Die Methode gibt das Array zurück
	 */
	public static int[] potenzen2 (int exponent) {
		int[] array = new int[exponent+1];
			for(int i=0;i <=exponent;i++) {
				array[i]=(int)Math.pow(2, i);
			}
		return array;
	}
}
