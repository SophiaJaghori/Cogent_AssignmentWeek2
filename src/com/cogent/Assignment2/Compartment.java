package com.cogent.Assignment2;

public abstract class Compartment {
	abstract void notice();
	void FirstClass() {
		
	}
}
class FirstClass extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stu
		System.out.println("First Class");

		
	}
	
}
class Ladies extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("Ladies Class");
		
	}
	
}
		
	
class General extends Compartment {

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("General Class");
		
	}
		
}
class Luggage extends Compartment{

	@Override
	void notice() {
		// TODO Auto-generated method stub
		System.out.println("Luggage Class");
		
	}
		
}
	


