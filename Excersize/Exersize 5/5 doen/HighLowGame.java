/*
 * Author: Stanley Pieda
 * Date: March 16, 2022
 * Modified by: **** Your name here ***
 * Modified Date: **** Due Date Here ****
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: Use the pseudocode and complete the reset and run methods
 */

import java.util.Random;

/*
 * Supervisor wants a comment here overviewing the class
 */
public class HighLowGame {
	private User user = new User(); // internal only, no get/set
	private Random random = new Random(); // internal only, no get/set
	private int fuelAvailable;
	private int numberToGuess;
	private static final int MIN = 1; // internal only, no get/set
	private static final int MAX = 10; // internal only, no get/set

	/*
	 * No argument constructor, calls method reset to initialize the game
	 */
	public HighLowGame() {
		reset();
	}

	/*
	 * Accessor for fuelAvailable
	 */
	public int getFuelAvailable() {
		return fuelAvailable;
	}

	/*
	 * Mutator for fuelAvailable
	 */
	public void setFuelAvailable(int fuelAvailable) {
		this.fuelAvailable = fuelAvailable;
	}

	/*
	 * Access for numberToGuess
	 */
	public int getNumberToGuess() {
		return numberToGuess;
	}

	/*
	 * Mutator for numberToGuess
	 */
	public void setNumberToGuess(int numberToGuess) {
		this.numberToGuess = numberToGuess;
	}

	/*
	 * Supervisor wants comments overviewing the method
	 */
	public void reset() {
		// ToDo: See Pseudocode and / or flowchart
		//initialising the value of sum to 0.
		int sum = 0;	
		//using "radom" method to get a rendom number.
		numberToGuess = random.nextInt(MAX)+1;
		//using for condition to set the value of sum
		for(int i=MIN ;i<=MAX;i++) {
			sum = sum + i;
		}
		//taking sum avrage as fuleavrage 
		fuelAvailable = sum/2;
	}


	public void run() {
		// ToDo: See Pseudocode and / or flowchart
		
		CheckGuessResult checkGuessResult = null;
	            String message ;
	            boolean isWon = false;
	            int guessCount = 0; 
	            int userNumber; // int
	            	//printing the maximum and minimum value of possible input to user.
	            	System.out.println( "Guess the number from " + MIN + " to " + MAX);
	            	//showing the fule left 
	            	System.out.println( "You have " + fuelAvailable + " guess-fuel remaining.");   
	            //creating while loop too take guesses until either fule runs out or the user guesed the value right.
	            	while(fuelAvailable > 0 && isWon == false) {
	                    guessCount = guessCount + 1;
	                    userNumber = user.inputInteger("guess: ");
	                    
	                    //removing the fule left from the total remaing fuel.
	                    fuelAvailable = fuelAvailable - userNumber; 

	                    
	                    	// creating if loop to set the value of fuleAvailable to 0 if it is negative.
	                    		if (fuelAvailable < 0) {
	                    		fuelAvailable = 0;
	                    }
	                    		//creating massage for checkgame result.
	                    		checkGuessResult = checkGuess(userNumber);
	                    		isWon = checkGuessResult.isWin() ;
	                    		message = checkGuessResult.getMessage();
                         
	                    					System.out.println(message);
	            }
//creating massage for report of game result.
	            		message = reportGameResult(isWon,guessCount);
	            		System.out.println(message);

		
	}

	/*
	 * This method examines the guess to see if it matches the numberToGuess
	 * value. To report win or no-win, with a message as well a CheckGuessResult
	 * instance is created with these results, and the reference to the
	 * CheckGuessResult object is returned.
	 */
	private CheckGuessResult checkGuess(int guess) {
		boolean isWin = false;
		String message;

		if (guess == numberToGuess) {
			message = "You guessed the number";
			isWin = true;
		}
		else {
			if(guess < numberToGuess) {
				message = "too low, ";
			}
			else {
				message = "too high, ";
			}
			message = message + String.format(
					"%d guess-fuel remaining", fuelAvailable);
		}
		CheckGuessResult checkGuessResult = new CheckGuessResult(message, isWin);
		return checkGuessResult;
	}
	
	/*
	 * This method writes out a final result of the game (win or lose) as well
	 * as the number of guesses used by the player (i.e. the user).
	 */
	private String reportGameResult(boolean isWon, int guessCount) {
		String message;
		if(isWon) {
			message = "You win! It took you ";
		}		
		else {
			message = "You did not win, you used ";
		}
		message = String.format(message + "%d guesses", guessCount);
		return message;
	}
}
