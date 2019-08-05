package de.vit.bund.lehre.m08.exceptions;

public class UngeradeException extends Exception{
	private int wert;
	public UngeradeException(int wert) {
		super("Ungerader Wert: "+wert);
		setWert(wert);
	}
	public int getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}

}
