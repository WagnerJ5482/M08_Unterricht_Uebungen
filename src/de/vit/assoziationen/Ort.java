package de.vit.assoziationen;

public class Ort {
	private String name;
	private int plz;
	
	
	public Ort(String name, int plz) {
		this.name = name;
		this.plz = plz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
}
