package de.vitbund.lehre.m08.generics;

public class Paar<U, V> {
	
	private U wert1;
	private V wert2;
	
	
	
	public Paar(U wert1, V wert2) {
		this.wert1 = wert1;
		this.wert2 = wert2;
	}
	public U getWert1() {
		return wert1;
	}
	public void setWert1(U wert1) {
		this.wert1 = wert1;
	}
	public V getWert2() {
		return wert2;
	}
	public void setWert2(V wert2) {
		this.wert2 = wert2;
	}

}
