package de.vit_bund.lehre.m08.array;

public class Array_Aufgaben03 {
	
	public static void main(String[] args) {
	/*
	 * Wochentage
	 */
	String[] wochentage = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
//	System.out.println(wochentage[3]);
//	System.out.println("Gesamte Liste:");
//	for (int i = 0; i<wochentage.length;i++) {
//		System.out.println(wochentage[i]);
//	}
//	System.out.println("Element 1 bis 5:");
//	for (int i = 0; i<5;i++) {
//		System.out.println(wochentage[i]);
//	}
//	System.out.println("Jeder 2te Tag:");
//	for (int i = 0; i<=wochentage.length;i+=2) {
//		System.out.println(wochentage[i]);
//	}
//	System.out.println("umgekehrte Reihenfolge:");
//	for (int i=wochentage.length-1;i>=0;i--) {
//		System.out.println(wochentage[i]);
//	}
	
	/*
	 * Zweidimensionales Array:
	 * 
	 */

//	String[][] stundenplan = new String[5][4];
//	
//	for (int i = 0; i<stundenplan.length;i++) {
//		for (int j=0;j<stundenplan[i].length;j++) {
//			stundenplan[i][j]="vorlesungsfrei";	
//			}
//		}
//	stundenplan[1][0] = "M12";
//	stundenplan[0][2] = "M12";
//	stundenplan[1][2] = "M08";
//	stundenplan[1][1] = "M12";
//	stundenplan[3][1] = "Uebung M08";
//	
//	stundenplan[1][0] = stundenplan[3][0];
//	
//	for (int i = 0; i<stundenplan.length;i++) {
//		for (int j=0;j<stundenplan[i].length;j++) {
//			System.out.println("Tag: " + wochentage[i] +"; Zeiteinheit: " + (j+1) + "; Modul: "+ stundenplan[i][j]);	
//			}
//		}
//	int zaehler = 0;
//	for (int i = 0; i<stundenplan.length;i++) {
//		for (int j=0;j<stundenplan[i].length;j++) {
//			if(stundenplan[i][j]=="vorlesungsfrei") zaehler++;
//				
//			}
//		}
//	System.out.println(zaehler);

	
	/*
	 * Schachbrett
	 * 
	 */
//	int[][] matrix = new int[8][8];
//	for (int i = 0; i<matrix.length;i++) {
//		for (int j = 0; j<matrix[i].length;j++){
//			matrix[i][j]=(j+i+1);
//			if ((j+i+1)<10)				
//				System.out.print("  "+matrix[i][j]);
//			else
//				System.out.print(" "+matrix[i][j]);
//				
//		}
//		System.out.println();
//	}
	/*
	 * do-While / for / while
	 * 
	 */
	//for-Schleife
//	int n=10;
//	
//	if (n <=0) {
//		System.out.println("Bad...");
//	}else {
//	for (double i=3;i<2*n;i+=2) {
//		System.out.println(i/((2*i)+1));
//	}
//	}
	// while-Schleife
//	int n =10;
//	int i=3;
//	if (n <=0) {
//		System.out.println("Bader...");
//	}else {
//	while (i<2*n) {
//		System.out.println(i/((2*i)+1));
//		i+=2;
//	}
//	}
	//do-while
	int n =10;
	double i=3;
	if (n <=0) {
		System.out.println("Bader...");
	}else {
		do {
			System.out.println(i/((2*i)+1));
			i+=2;
		} while (i<=2*n);
	}
	
	
	
	}
}
