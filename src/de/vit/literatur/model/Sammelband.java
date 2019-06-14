package de.vit.literatur.model;

import de.vit.akteure.Autor;

public class Sammelband extends Literatur {
	private Autor[] herausgeber;
	private int erscheinungsjahr;
	private Beitrag[] beitraege;
	
	public Autor[] getHerausgeber() {
		return herausgeber;
	}
	public void setHerausgeber(Autor[] herausgeber) {
		this.herausgeber = herausgeber;
	}
	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	public Beitrag[] getBeitraege() {
		return beitraege;
	}
	public void setBeitraege(Beitrag[] beitraege) {
		this.beitraege = beitraege;
	}

}
