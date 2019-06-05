package de.vit_bund.lehre.m08.rekursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.NumberFormat;

public class Fibonacci {
	
	public static void main(String[] args) {
//		System.out.println(rekursiv(40));
		System.out.println(iterativ(164));
//		System.out.println(rekursivOptimiert(164));
	}
	
	
	
	
/*
 * Main-Methode die ein bischen mehr kann: Datei-Ausgabe, Laufzeit-Berechnen
 */
//	public static void main(String[] args) throws FileNotFoundException {
//		PrintStream printer = new PrintStream(new File("laufzeit.txt"));
//		int stelle = 92;
//		Long fibonacciErgebnis = 0L;
//		String ausgabe = "";
//		double laufzeit = 0.0;
//		for (int i = 0; i <= stelle; i++) {
//			double start = (System.currentTimeMillis());
////			fibonacciErgebnis = rekursiv(i);
//			fibonacciErgebnis = iterativ(i);
//			double stop = (System.currentTimeMillis());
//			laufzeit = (stop - start);
//			ausgabe = "Stelle: " + i + " Summe: " + NumberFormat.getInstance().format(fibonacciErgebnis) + " Laufzeit: " + laufzeit;
//			System.out.println(ausgabe);
//			printer.println(ausgabe);
//		}
//		;
//		printer.println("-----------------");
//		stelle++;
//	}

	public static Long rekursiv(int stelle) {
		if (stelle <= 0)
			return 0L;
		if (stelle == 1)
			return 1L;
		return rekursiv(stelle - 1) + rekursiv(stelle - 2);
	}
	
	public static Long rekursivOptimiert(int laufzeit) {
		return optimiertesArr(laufzeit)[1];
		
	}
	
	private static Long[] optimiertesArr(int n) {
		if (n <= 0) return new Long[] {0L,0L};
		if (n == 1) return new Long[] {0L,1L};
		Long[] vorher = optimiertesArr(n-1);
		return new Long[] {
				vorher[1],vorher[0]+vorher[1]
		};
	}

	public static Long iterativ(int laufzeit) {
		if (laufzeit <= 0)
			return 0L;
		if (laufzeit == 1)
			return 1L;
		Long a = 0L;
		Long b = 1L;
		for (int i = 2; i <= laufzeit; i++) {
			Long bVorher = b;
			b += a;
			a = bVorher;
		}
		return b;
	}
}
