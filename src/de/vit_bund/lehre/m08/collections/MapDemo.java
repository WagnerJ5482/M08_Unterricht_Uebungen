package de.vit_bund.lehre.m08.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> abbildung = new HashMap<Integer,String>();
		abbildung.put(15, "sehr gut");
		abbildung.put(14, "sehr gut");
		abbildung.put(13,"gut");
		
		System.out.println(abbildung.values().toString());
		
	}

}
