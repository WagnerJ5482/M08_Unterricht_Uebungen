package de.vit.bund.lehre.m08.exceptions;
public class ExceptionsUebungen {

	public static void main(String[] args) throws UngeradeException {
		String name;
		name = null;
		try {
			name.length();
		} catch (Exception ex) {
//			System.out.println("leerer Name: " + ex);
		}
		try {
//			division(3, 0);
		} catch (ArithmeticException aex) {
//			System.out.println("eine mathematische exception: " + aex);
		} catch (Exception ex) {
//			System.out.println("eine andere exception: " + ex);

		}
//		GeraderWert gerade = new GeraderWert();
//		for (int x=0; x <= 25; x++) {
//			try {
//				gerade.setWert(x);
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		GeraderWert[] array = new GeraderWert[10];
		for (int i = 0; i<array.length;i++) {
			GeraderWert gerade2 = new GeraderWert();
			try {
				gerade2.setWert(i);
				array[i]=gerade2;
			}catch (UngeradeException uge) {
				System.out.println(uge.getMessage());
//				gerade2.setWert(66);
//				array[i]=gerade2;
			}
			
		}
//		for(GeraderWert gw : array) {
//			try {
//				System.out.print(gw.toString());
//			} catch (NullPointerException e) {
//				System.out.print("\t Null \t");
//			}
//			;
//		}
		
	}

//	static double division(int zaehler, int nenner) throws Exception {
//		return zaehler / nenner;
//	}
}
