/*
 * File level comment goes here
 */
import java.util.Scanner;

/*
 * Class level overview goes here
 */
public class Exercise04 {

	/*
	 * method comment goes here
	 */
	public static void main(String[] args) {
        // create constants for the menu
		
		Scanner keyboard = new Scanner(System.in);
		MeterStick stick = new MeterStick();
		double userLength;
		int option;
		String output;

		System.out.println("Meter stick checker program.");
		System.out.print("Enter measured length in meters: ");
		userLength = keyboard.nextDouble();
		keyboard.nextLine();
		stick.setLength(userLength);

		// output the menu here, using constants
		
		// input user option

		// based on the user option entered perform the requested task
		// if outputting numbers directly from method main format to 5 decimal
		// places

		System.out.println("Program by Vedant Goswami"); // replace with your name
	}
}
