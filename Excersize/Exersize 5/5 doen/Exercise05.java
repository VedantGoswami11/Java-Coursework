/*
 * 
 * Date: 5-8-2022
 * Modified by: Vedant Goswami
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: Use the pseudocode and complete the main method
 */

/*
 * 
 * This class only contains method main, to drive the application.
 */
import java.util.Scanner;
public class Exercise05 {
	
	/*in this code I will be using the psudocode provided and the logic of pudocode is explained as 
	 * program continue, take a look at ensuing coments for further explaining.
	 *
	 */
	public static void main(String[] args) {
		
		
		//decliration of variables and calling out methods from other classes.
	        User user = new User();
	        HighLowGame game = new HighLowGame();
	        String CONTINUE_GAME = "Y";
	        final String EXIT_GAME = "N";
	        String shouldContinue = "Y";//the value of this variable is set to "Y",to initially start do-while loop.
	        Scanner input = new Scanner(System.in);
	    
	       do {//creating if condition to see if the user what to continue the game or not.
	        if (shouldContinue.equalsIgnoreCase(CONTINUE_GAME)) { // case-insensitive comparison
	            game.reset();
	        };
	        game.run();
	        System.out.println("Would you like to play again? (Y/N)");
	        //setting up the value of shouldContinue in accordance of user input. 
	        shouldContinue =input.next();
	      
	    }
	    while (shouldContinue.equalsIgnoreCase(CONTINUE_GAME)); // case-insensitive comparison
	    System.out.println("Program by Vedant Goswami "); 


	}
}
