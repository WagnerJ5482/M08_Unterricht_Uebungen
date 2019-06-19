package de.vit.literatur.model;

import java.util.Date;

import de.vit.akteure.Autor;

public class Sammelband extends Literatur implements IHerausgegeben, IVerleihbar{
	private Autor[] herausgeber;
	private int erscheinungsjahr;
	private Beitrag[] beitraege;
	
	
	public Sammelband(String titel,int erscheinungsjahr) {
		super(titel);
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	public Sammelband(String titel) {
		super(titel);
	}
	
	public Autor[] getHerausgeber() {
		return getHerausgeber();
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
	
	@Override
	public String getBeschreibung() {
		String beschreibung = super.getBeschreibung();
		beschreibung += " mit " + this.beitraege.length + " Beiträgen:";
		for(Beitrag beitrag : this.beitraege) {
			if(beitrag != null)
				beschreibung += "\n\t" + beitrag.getInfo();
		}
		return beschreibung;
	}
	@Override
	public String getInfo() {
		String autorenNamen = "";
		if (this.herausgeber != null) {
			for (Autor autor : this.herausgeber) {
				if (autor != null) {
					// Trennzeichen hinzufügen, wenn nicht erster Herausgeber
					if (!autorenNamen.equals(""))
						autorenNamen += ", ";
					// Name des Autors hinzufügen
					autorenNamen += autor.getVorname() + " " + autor.getNachname();
				}
			}
			autorenNamen += " (Hrsg.): ";
		}
		return autorenNamen + super.getInfo() + " (" + this.getErscheinungsjahr() + ", " + this.beitraege.length + " Beiträge)";
	}

	public boolean istAutorInvolviert(Autor autor) {
		if (this.herausgeber != null) {
			for (Autor hrsg : this.herausgeber) {
				if (hrsg != null && hrsg.equals(autor))
					return true;
			}
		}
		if (this.beitraege != null) {
			for (Beitrag beitrag : this.beitraege) {
				if (beitrag != null && beitrag.istAutorInvolviert(autor))
					return true;
			}
		}
		return false;
	}

	@Override
	public void ausgeben(String kunde) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public String getAusgegebenAn() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}

	@Override
	public void verleihen(Date bis) {
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public Date getVerliehenBis() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}



}