package de.vit.literatur.model;

import java.util.Date;

import de.vit.akteure.Autor;

public class Sammelband extends Literatur{
	private Autor[] herausgeber;
	private Date erscheinungsjahr;
	private Beitrag[] beitraege;
	
	
	public Sammelband(Autor[] herausgeber, Date erscheinungsjahr, String titel) {
		super(titel);
		this.herausgeber = herausgeber;
		this.erscheinungsjahr = erscheinungsjahr;
	}
	public Autor[] getHerausgeber() {
		return herausgeber;
	}
	public void setHerausgeber(Autor[] herausgeber) {
		this.herausgeber = herausgeber;
	}
	public Date getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	public void setErscheinungsjahr(Date erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	public Beitrag[] getBeitraege() {
		return beitraege;
	}
	public void setBeitraege(Beitrag[] beitraege) {
		this.beitraege = beitraege;
	}
	
	

}