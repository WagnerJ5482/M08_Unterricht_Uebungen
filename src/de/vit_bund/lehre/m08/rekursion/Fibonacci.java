package de.vit_bund.lehre.m08.rekursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.NumberFormat;

public class Fibonacci {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream printer = new PrintStream(new File("laufzeit.txt"));
		int stelle = 92;
		Long fibonacciErgebnis = 0L;
		String ausgabe = "";
		double laufzeit = 0.0;
		for (int i = 0; i <= stelle; i++) {
			double start = (System.currentTimeMillis());
//			fibonacciErgebnis = rekursiv(i);
			fibonacciErgebnis = iterativ(i);
			double stop = (System.currentTimeMillis());
			laufzeit = (stop - start);
			ausgabe = "Stelle: " + i + " Summe: " + NumberFormat.getInstance().format(fibonacciErgebnis) + " Laufzeit: " + laufzeit;
			System.out.println(ausgabe);
			printer.println(ausgabe);
		}
		;
		printer.println("-----------------");
		stelle++;
	}

	public static Long rekursiv(int laufzeit) {
		if (laufzeit <= 0)
			return 0L;
		if (laufzeit == 1)
			return 1L;
		return rekursiv(laufzeit - 1) + rekursiv(laufzeit - 2);
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
