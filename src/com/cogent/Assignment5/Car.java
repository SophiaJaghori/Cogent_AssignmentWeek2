package com.cogent.Assignment5;

public class Car {
	private double speed;
	private int noOfGear;
	Car(){
		
	}
	Car(double speed, int noOfGear){
		this.speed = speed;
		this.noOfGear = noOfGear;
	}
	public void SetSpeed(double speed) {
		this.speed = speed;
	}
	public void setNoOfGear(int noOfGear) {
		this.noOfGear = noOfGear;
	}
	public double getSpeed() {
		return speed;
	}
	public int getNoOfGear() {
		return noOfGear;
	}
	public void drive() {
		System.out.println("Speed = "+ this.speed + " NoOfGears = "+this.noOfGear);
	}
	public void display() {
		drive();
		
	}

}
