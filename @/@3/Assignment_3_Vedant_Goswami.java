
public class Assignment_3_Vedant_Goswami {
	/*
	* Assessment: Assignment 03.
	* Student Name: Vedant Goswami.
	* Due Date:12/08/2022(Friday).
	* Professor Name: Gustavo Adami.
	* section :320
	*/

	public static void main(String[] args) {
		// decleration of variables.
		int roll = 0;
		int[] diceRolls = new int[16];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 16) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {  // crashes
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		// decleration for total even and total odd rolls.
		int odd_Rolls = 0;
		int even_Rolls = 0;
		//creeating for loop to get odd and even index seprated.
		for (int index = 0; index < diceRolls.length; index ++ ) {
			if((index+1)% 2 ==0 ) {even_Rolls += diceRolls[index]; } 
			
			else {odd_Rolls += diceRolls[index];} 
		
	}
		// printing the report of total of odd and even number inaddtion to the total rolls report.
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Number of even_Rolls rolls"+" " + even_Rolls);
		System.out.println("Number of odd_Rolls rolls"+" " + odd_Rolls);
		System.out.println("Program by Vedant Goswami");
		

	}}
