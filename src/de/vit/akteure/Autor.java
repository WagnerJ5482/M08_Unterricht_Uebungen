package de.vit.akteure;

import de.vit.literatur.model.IHerausgegeben;
import de.vit.literatur.model.IVerfasst;

public class Autor {
	private int id;
	private String vorname;
	private String nachname;
	
	private IHerausgegeben[] herausgaben;
	private IVerfasst[] publikationen;
	
	public Autor() {
		
	}
	
	public Autor(String vorname, String nachname) {
		this();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null || !(arg0 instanceof Autor))
			return false;
		if (arg0 == this)
			return true;
		Autor autor = (Autor) arg0;
		return this.nachname.equals(autor.nachname) && this.vorname.equals(autor.vorname);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public IHerausgegeben[] getHerausgaben() {
		return herausgaben;
	}

	public void setHerausgaben(IHerausgegeben[] herausgaben) {
		this.herausgaben = herausgaben;
	}

	public IVerfasst[] getPublikationen() {
		return publikationen;
	}

	public void setPublikationen(IVerfasst[] publikationen) {
		this.publikationen = publikationen;
	}


}
