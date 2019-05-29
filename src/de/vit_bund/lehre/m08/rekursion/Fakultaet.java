package de.vit_bund.lehre.m08.rekursion;

public class Fakultaet {

	public static void main(String[] args) {
		System.out.println(iterativWhile(5));

	}
	
	public static long interativ(int n) {
		return 0;
	}
	
	
	public static long iterativWhile(int n) {
		long fakultaet = 1;
		while (n > 0) {
			fakultaet = fakultaet * n;
			n--;
		}
		return fakultaet;

	}
	
}



