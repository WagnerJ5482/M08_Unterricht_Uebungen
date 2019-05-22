package de.vit_bund.lehre.m08.array_zusatz;

public class zusatz_Klasse {

	public static void main(String[] args) {

		int [][] dreieck = new int[3][3];
		dreieck[0] = new int[] {1,2,3};
		dreieck[1] = new int[] {4,5};
		dreieck[2] = new int[1];
		dreieck[2][0] = 6;
		System.out.println(dreieck[0][0]+" "+dreieck[0][1]+" "+dreieck[0][2]);
		System.out.println(dreieck[1][0]+" "+dreieck[1][1]);
		System.out.println(dreieck[2][0]);
	}

}
