package com.cogent.Assignment1;

public class Main {
	public static void main(String[] args) {
		Instrument piano = new Piano();
//		Instrument flute = new Flute();
//		Instrument guitar = new Guitar();
		Instrument[]inst = new Instrument[10];
		
		for(int i = 0; i<inst.length; i++) {
			switch(i %3) {
			case 1:
				inst[i] = new Piano();
				break;
			case 2:
				inst[i] = new Flute();
				break;
			case 3:
				inst[i] = new Guitar();
				break;
			}
		}
		for(int i = 0; i<12; i++) {
			System.out.println("Object# "+ (i+1));
			inst[i].play();
			if(inst[i]instanceof Piano) {
				System.out.println("Piano");
			}
			if(inst[i]instanceof Flute) {
				System.out.println("Flute");
			}
			if(inst[i]instanceof Guitar) {
				System.out.println("Guitar");
			}
		}
		
	}

}
