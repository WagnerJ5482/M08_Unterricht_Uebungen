package de.vit.bund.lehre.m08.aktenverwaltung;

import java.util.ArrayList;
import java.util.List;

public abstract class Akte {
	private boolean archiviert;
	private List<Vermerk> vermerke = new ArrayList<Vermerk>();
	
	public Akte(boolean archiviert) {
		this.archiviert = archiviert;
	}
	
	public void archivieren() {
		
	}
	
	public abstract String getAktenzeichen();
	

	public boolean isArchiviert() {
		return archiviert;
	}

	public void setArchiviert(boolean archiviert) {
		this.archiviert = archiviert;
	}

	public List<Vermerk> getVermerke() {
		return vermerke;
	}

	public void setVermerke(List<Vermerk> vermerke) {
		this.vermerke = vermerke;
	}

}
