package de.vit_bund.lehre.m08.rekursion;

public class Mathe {

	public static void main(String[] args) {
		System.out.println(add(5,7));

	}
	
	public static int add(int a, int b) {
		if (a == 0) return b;
		if (a <0) {
			return add(++a,--b);
		}
		else return add(--a,++b); 
			
	}

}
