package com.cogent.Assignment5;

public class CarClassMain {
	public static void main(String[] args) {
		Car car = new Car(90.0, 6);
		SportCar sCar = new SportCar(10.5, 90, "6");
		sCar.drive();
		sCar.display();
	}
	
	

}
