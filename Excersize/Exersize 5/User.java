//ToDo: Supervisor wants programmer comments (use /* */ comment)

import java.util.Scanner;

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
}