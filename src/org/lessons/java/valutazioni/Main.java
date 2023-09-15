package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Studente [] Stud = new Studente[20];
		
		
//		int [] studenti = new int [20];
		int qtyStud = Stud.length;
		int studPromoted = 0;
	
		for(int x= 0; x < qtyStud; x++) {
			Stud[x]= new Studente( x+1, rnd.nextInt(0,101), rnd.nextFloat(0, 5));
			//Stud[x].id = x+1;
			//Stud[x].percentualeAssenze = rnd.nextInt(0,100);
			//Stud[x].mediaVoti = rnd.nextFloat(0, 10);
			
			System.out.println(Stud[x].getStudent());
			
			if(Stud[x].mediaVoti >= 2 && Stud[x].percentualeAssenze > 75 ) {
				studPromoted++;
			} else if(Stud[x].mediaVoti > 2 && Stud[x].percentualeAssenze >= 50 ) {
				
				studPromoted++;
			}
			
		}
		
		System.out.println("Il numero di studenti promossi è di : " + studPromoted);
		
		
	}
	
	
}
