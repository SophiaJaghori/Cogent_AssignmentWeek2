package com.cogent.Assignment2;

public class TestCompartment {
	public static void main(String[] args) {
		Compartment[]comp = new Compartment[10];
		double i = Math.random()*5;
		int x = (int)i;
		
				switch(x) {
				case 1:
					comp[0] = new FirstClass();
					comp[0].notice();
					break;
				case 2:
					comp[1] = new Ladies();
					comp[1].notice();
					break;
				case 3:
					comp[2] = new General();
					comp[2].notice();
					break;
				case 4:
					comp[4] = new Luggage();
					comp[4].notice();
					break;
					
				}//switch
//				System.out.println("Object # "+ (i+1));
//				comp[i].notice();
			
		//for
		
		
		
	}//main

}
