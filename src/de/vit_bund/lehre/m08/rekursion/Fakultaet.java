package de.vit_bund.lehre.m08.rekursion;

import java.math.BigInteger;

public class Fakultaet {

	public static void main(String[] args) {
		System.out.println(iterativWhile(20));
		System.out.println(rekursivLong(20));
		System.out.println(iterativBigInteger(20));
	}
	
	public static long rekursivLong(long n) {
		if (n == 0) return 1L;
		else return n*rekursivLong(n-1);
	}
	
		
	
	public static BigInteger iterativBigInteger(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
	}
	
	
	public static long iterativWhile(int n) {
		long ergebnis = 1L;
		while (n > 0) {
			ergebnis *= n;
			n--;
		}
		return ergebnis;

	}
	
}



