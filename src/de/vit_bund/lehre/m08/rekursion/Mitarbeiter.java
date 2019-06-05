package de.vit_bund.lehre.m08.rekursion;

public class Mitarbeiter {
	private String name;
	private int gehaltsklasse;
	private Mitarbeiter vorgesetzter;

	public Mitarbeiter(String name, int gehaltsklasse, Mitarbeiter vorgesetzter) {
		setName(name);
		setGehaltsklasse(gehaltsklasse);
		setVorgesetzter(vorgesetzter);
	}

	public static void main(String[] args) {
		Mitarbeiter vogel = new Mitarbeiter("Canary M. Burns", 15, null);
		Mitarbeiter burns = new Mitarbeiter("C Montogmery Burns", 14, vogel);
		Mitarbeiter smithers = new Mitarbeiter("Waylon Smithers", 10, burns);
		Mitarbeiter lenny = new Mitarbeiter("Lenny Leonard", 5, smithers);
		Mitarbeiter bolzen = new Mitarbeiter("Seelenloser Stahlbolzen", 2, lenny);
		Mitarbeiter homer = new Mitarbeiter("Homer J. Simpson", 1, bolzen);

		// anzahl Vorgesetzte von Homer in Gehaltsklasse 10
		System.out.println(homer.getAnzhalVorgesetzterMitGK(10));
	}

	public int getAnzhalVorgesetzterMitGK(int gehaltsklasse) {
		if (getVorgesetzter() == null)
			return 0;
		int anzahl = 0;
		//direkter Vorgestzter
		if(getVorgesetzter().getGehaltsklasse() >= gehaltsklasse)
			anzahl++;
		//höhere Vorgestzte
		 anzahl += getVorgesetzter().getAnzhalVorgesetzterMitGK(gehaltsklasse);
		return anzahl;
	}
	public int getAnzhalVorgesetzterMitGK2(int gehaltsklasse) {
		int anzahl = 0;
		Mitarbeiter ich = this;		
		while (ich.vorgesetzter != null) {
		//direkter Vorgestzter
		if(getVorgesetzter().getGehaltsklasse() >= gehaltsklasse)
			anzahl++;
			ich = ich.vorgesetzter;
		}
		return anzahl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGehaltsklasse() {
		return gehaltsklasse;
	}

	public void setGehaltsklasse(int gehaltsklasse) {
		this.gehaltsklasse = gehaltsklasse;
	}

	public Mitarbeiter getVorgesetzter() {
		return vorgesetzter;
	}

	public void setVorgesetzter(Mitarbeiter vorgesetzter) {
		this.vorgesetzter = vorgesetzter;
	}

}
