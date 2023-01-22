package com.cogent.Assignment3;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine md[] = new Medicine[10];
		md[0] = new Tablet();
		md[1] = new Syrup();
		md[2] = new Ointment();
		md[3] = new Tablet();
		md[4] = new Syrup();
		md[5] = new Ointment();
		md[6] = new Tablet();
		md[7] = new Syrup();
		md[8] = new Ointment();
		md[9] = new Tablet();
		for(int i = 0; i<md.length; i++) {
			if(md[i]instanceof Tablet) {
				System.out.println("It is a Tablet!");
				md[i].displayLabel();
				
			}
			if(md[i]instanceof Syrup) {
				System.out.println("It is a Syrup!");
				md[i].displayLabel();
				
			}
			if(md[i]instanceof Ointment) {
				System.out.println("It is an Oitment!");
				md[i].displayLabel();
				
			}
		}
		
	}
		

}
