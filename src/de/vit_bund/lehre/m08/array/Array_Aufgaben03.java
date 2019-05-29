package de.vit_bund.lehre.m08.array;

public class Array_Aufgaben03 {
	
	public static void main(String[] args) throws InterruptedException {
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

	String[][] stundenplan = new String[5][4];
	
	for (int tagId = 0; tagId<stundenplan.length;tagId++) {
		for (int zeID=0;zeID<stundenplan[tagId].length;zeID++) {
			stundenplan[tagId][zeID]="vorlesungsfrei";
			}
		}
	stundenplan[0][2] = "M12"; // Montag 2.Einheit
	stundenplan[1][0] = "M12"; // Dienstag 1. Einheit
	stundenplan[2][1] = "M08"; // Mittwoch 2. Einheit
	stundenplan[1][1] = "M12"; // Dienstag 2. Einheit
	stundenplan[1][3] = "Uebung M08"; // Dienstag 4. Einheit
	
	stundenplan[0][3] = stundenplan[0][1];
	
	for (int tagId = 0; tagId<stundenplan.length;tagId++) {
		for (int zeId=0;zeId<stundenplan[tagId].length;zeId++) {
			System.out.print(stundenplan[tagId][zeId] + "\t");	
			}
		System.out.println();
		}

	System.out.println(findeErsteZE(stundenplan, wochentage));
	/*
	 * mit for-Each Schleife
	 */
	
//	int zaehler =0;
//	for (String[] tag: stundenplan) {
//		for ( String stunde: tag) {
////			if (stunde == "vorlesungsfrei") zaehler++; // CompilerOptimierung
////			if( !stunde.equals(null) && stunde.equals("vorlesungsfrei")) zaehler++;  // gut:
//			if ("vorlesungsfrei".equals(stunde)) zaehler++;
//		}
//	}
//	System.out.println(zaehler);
	
	
//	// mit standard for-schleifen
//	int zaehler2 = 0;
//	for (int i = 0; i<stundenplan.length;i++) {
//		for (int j=0;j<stundenplan[i].length;j++) {
//			if(stundenplan[i][j]=="vorlesungsfrei") zaehler2++;
//				
//			}
//		}
//	System.out.println(zaehler2);

	
	/*
	 * Schachbrett
	 * 
	 */
//	int[][] matrix = new int[8][8];
//	for (int i = 0; i<matrix.length;i++) {
//		for (int j = 0; j<matrix[i].length;j++){
//			matrix[i][j]=(j+i+1);
////				System.out.printf("%3d",matrix[i][j]);  // kürzer aber noch nicht bekannt ersetzt die if-Anweisung
//			if ((j+i+1)<10)				
//				System.out.printf("  "+matrix[i][j]);
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
////		System.out.println(i/((2*i)+1));
//		System.out.println(i);
//	}
//	}
	/**
// 	while-Schleife
	int n1 =10;
	double i1=3;
	if (n1 >0) {
		while (i1<2*n1) {
//			System.out.println(i1/((2*i1)+1));
			System.out.println(i1);
			i1+=2;
		}
	}else {
		System.out.println("Bad...");
	}
//	do-while
	int n2 =10;
	double i2=3;
	if (n2 > 0) {
		do {
//			System.out.println(i2/((2*i2)+1));
			System.out.println(i2);
			i2+=2;
		} while (i2<=2*n2);
	}else {
		System.out.println("Bad...");
	}
*/
	
	// Aufgabe while Schleife
//	int i1 =-5;
//	while (i1>0) {
//		Thread.sleep(127);  // Verzögerung: Methode muss dann Exceptions schmeißen (throws ..)
//		System.out.println(i1);
//		i1 -= 2;
//	}
//	// do-while
//	int n =-5;
//	if (n >0) {
//	do {
//		n -=2;
//		Thread.sleep(127);  // Verzögerung: Methode muss dann Exceptions schmeißen (throws ..)
//		System.out.println(n);
////		i1 -= 2;
//	} while (n>0);}
	
//	// For schleife:
//	for (int i = 10; i >0; i-=2) {
//		System.out.println(i);
//	}
	
	}
	public static String findeErsteZE (String[][] stundenplan, String[] wochentage) {
		for (int tagId = 0; tagId<stundenplan.length;tagId++) {
			for (int zeId=0;zeId<stundenplan[tagId].length;zeId++) {
				String stunde = stundenplan[tagId][zeId];
				if ("vorlesungsfrei".equals(stunde)) {
					continue;
				}
				return "Erste Stunde: Tag "+ wochentage[tagId] + " ZE "+ zeId;
			}
		}
		return "Keine Vorlseungen";
	}
}
