package com.cogent.Assignment5;

public class SportCar extends Car {
	private String airBallontype;

	public SportCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportCar(double speed, int noOfGear, String airBallonType) {
		super(speed, noOfGear);
		this.airBallontype  = airBallontype;
		// TODO Auto-generated constructor stub
	}

	public String getArBallontype() {
		return airBallontype;
	}

	public void setArBallontype(String arBallontype) {
		this.airBallontype = arBallontype;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" speed = "+this.getSpeed() + "\n NumberOfGears = "+ this.getArBallontype()
		+"\nair Ballon type = "+ this.airBallontype);
	}
	

}
