package com.cogent.Assignment1;

public abstract class Instrument {
	public abstract void play();
	
	

}
class Piano extends Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.err.println("Piano is playing tan tan tan tan");
	}
	
	
}
class Flute extends Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot");
		
	}
	
}
class Guitar extends Instrument{

	@Override
	public void play() {
		System.out.println("Guitar is playing tin tin tin ");
		
	}
	
}
