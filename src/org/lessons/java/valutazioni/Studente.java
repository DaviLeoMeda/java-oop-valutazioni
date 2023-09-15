package org.lessons.java.valutazioni;

public class Studente {
	
	public int id;
	public int percentualeAssenze;
	public float mediaVoti;
	
	public Studente(int id, int percentualeAssenze, float mediaVoti) {
		this.id = id;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
		
		
	}
	
	public String getStudent() {
			
		return "L' ID dello sudente è" +  id + "con una percentuale d'assenza di " + percentualeAssenze + " e una media voto di " + String.format("%.02f", mediaVoti);
	}

}
