package com.cogent.Assignment3;

public class Medicine {
	String name;
	String address;
	
	

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	void displayLabel() {
		System.out.println("The name of the "+ this.name);
		System.out.println("the addre is "+ this.address);
		
		
	}
	

}
class Tablet extends Medicine{
	

	public Tablet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tablet(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void displayLabel() {
		System.out.println("The Tablet should be kept in dry areas");
		
	}
	
}
class Syrup extends Medicine{
	
	public Syrup() {
		
	}
	public Syrup(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void displayLabel() {
		System.out.println("The Tablet should be kept cooler areas");
		
	}
	
}
class Ointment extends Medicine{
	public Ointment() {
		
	}

	public Ointment(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void displayLabel() {
		System.out.println("For External use only ");
		
	}
	
}