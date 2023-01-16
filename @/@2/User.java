//importing scanner util

import java.util.Scanner;

//creating user class fot tahking input from main method.
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	//decalration of inputInteger method, which will be used for size of chip bag.
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	//decleraation of method to get sting output for size of bag.
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	//decalration of inputDouble method, which will be used for weight of chip bag.)
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	//decleraation of method to get sting output for weight of bag.
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
}