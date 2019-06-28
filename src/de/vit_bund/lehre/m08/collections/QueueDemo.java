package de.vit_bund.lehre.m08.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		//Hinzufügen
		q.offer("Erste");
		q.offer("Zweiter");
		q.offer("Dritter");
		
		//solange es einen ersten Eintrag in der Queue gibt (peek())
		while(q.peek() != null) {
			System.out.println(q.poll());//poll() gibt das Element aus und entfernt es.
		}
		if(q.isEmpty() == true)System.out.println("Queue leer");
	}

}
