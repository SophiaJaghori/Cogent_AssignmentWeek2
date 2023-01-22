package com.cogent.Assignment4;

import java.util.Scanner;

public class OperationsClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(num !=0 ) {
			System.out.println("Enter 0 to end the Program! ");
			System.out.println("Please enter what opperation you want to perform!");
			System.out.println("1- enter 1 for addition. ");
			System.out.println("2- enter 2 for subtraction. ");
			System.out.println("3- enter 3 for multiplication. ");
			System.out.println("4- enter 4 for division. ");
		
		int choice =sc.nextInt();
		
			switch(choice) {
			case 1:
				Addition();
				break;
			case 2:
				Subtraction();
				break;
			case 3:
				Multiplication();
				break;
			case 4:
				Division();
				break;
				default:
					System.out.println("Not a valid option! ");
				
			}
		}
		
			
	}
		
	public static void Addition() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please ent number1 and number2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println("the sum of "+ num1 +"+" + num2 + "=" +sum);
			
	}
	public static void Subtraction() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please ent number1 and number2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sub = num1 - num2;
		System.out.println("the subtraction of "+ num1 +"-" + num2 + "=" +sub);
			
	}
	public static void Multiplication() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please ent number1 and number2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int mul = num1 * num2;
		System.out.println("the multiplication of "+ num1 +"*" + num2 + "=" +mul);
			
	}
	public static void Division() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please ent number1 and number2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if(num2 > 0) {
			int div = num1 / num2;
			System.out.println("the division of "+ num1 +"/" + num2 + "=" +div);
				
		}
		else {
			System.out.println("can not divide by zoer!");
		}
		
	}
	

}
