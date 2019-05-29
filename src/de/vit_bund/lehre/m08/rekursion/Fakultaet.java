package de.vit_bund.lehre.m08.rekursion;

import java.math.BigInteger;

public class Fakultaet {

	public static void main(String[] args) {
		System.out.println(iterativWhile(5));
		System.out.println(iterativLong(20));
		System.out.println(iterativBigInteger(40));
	}
	
	public static long iterativLong(long n) {
		if (n == 0) return 1;
		else return n*iterativLong(n-1);
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
		long fakultaet = 1;
		while (n > 0) {
			fakultaet = fakultaet * n;
			n--;
		}
		return fakultaet;

	}
	
}



