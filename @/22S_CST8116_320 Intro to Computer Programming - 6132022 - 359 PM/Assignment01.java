/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: The Due Date (2022)
 * Description: Sample Solution for Assignment 01 (22W)
 */
import java.util.Scanner;

/*
 * This class contains method main, and is used to run
 * the application.
 */
public class Assignment01 {

	/*
	 * Method main creates an instance of class CircularTableTop and
	 * WoodWorker, as well as class Scanner. A diameter is read in, 
	 * as well as the number of coats of varnish, and the number
	 * of tables that can be varnished is output before the program
	 * shuts down.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		CircularTableTop table = new CircularTableTop();
		WoodWorker worker = new WoodWorker();
		double diameter;
		int coats;
		double surfaceArea;
		double tablesPerCan;
		
		System.out.print("Enter diameter (inches): ");
		diameter = keyboard.nextDouble();
		
		System.out.print("Enter coats needed: ");
		coats = keyboard.nextInt();
		
		table.setDiameter(diameter);
		surfaceArea = table.calculateSurfaceArea();
		
		tablesPerCan = worker.calculateTablesPerCan(surfaceArea, coats);
		
		System.out.println("Tables per one can: " + tablesPerCan);
		System.out.println("Program by Stanley Pieda");

	}

}
