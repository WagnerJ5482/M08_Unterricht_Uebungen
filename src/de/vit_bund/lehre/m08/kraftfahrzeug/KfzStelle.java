package de.vit_bund.lehre.m08.kraftfahrzeug;
	
public class KfzStelle {

	public static void main(String[] args) {
		Kennzeichen meinKennzeichen = new Kennzeichen("SU","JW");
		Kennzeichen kennzeichen = new Kennzeichen("MS", "AM", 323);
		
		Kfz meinAuto = new Kfz("rot",1961,"Ford Kuga",meinKennzeichen,4);
		Kfz auto = new Kfz("gelb",1233,"Audi",kennzeichen,4);
		
		meinAuto.gibInfos();
		System.out.println();
		System.out.println(meinAuto.gibAchslastDurchschnittRaeder()+"kg durchsschnittAchlast");
		System.out.println("Neues Auto:");
		auto.gibInfos();
		System.out.println(auto.gibAchslastDurchschnittRaeder()+"kg durchsschnittAchlast");
	}

}

