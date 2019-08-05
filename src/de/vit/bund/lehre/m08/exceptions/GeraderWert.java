package de.vit.bund.lehre.m08.exceptions;

public class GeraderWert {
	private int wert;
	
	public void setWert(int i) throws UngeradeException {
		if(i % 2 == 0) this.wert = i;
		else throw new UngeradeException(i);
	}
	
	public String toString() {
		return Integer.toString(wert);
	}
}
