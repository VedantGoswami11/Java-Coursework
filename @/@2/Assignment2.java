/*Assessment: Assignment 02
Student Name: Vedant Goswami
Section Number: 321
Due Date: 29/7/2022
			description: A program that takes size and weight as input and tess user if it is good bag or bad bag and also sum up the total
             bag count; it runs till user asks to run again. 
 * 
 */

//importing scanner util
import java.util.Scanner;

public class Assignment2{

	
	public static void main(String[] args) {
		//deceleration of variables and calling out methods
		
		PotatoChipBag Bag = new PotatoChipBag();
		Scanner input = new Scanner(System.in);
		User user = new User();
		
	    int Good_Bag = 0;
	    int Bad_Bag = 0;
	    int Sum = 0;
	    
	    String ToContinue = "yes";
		
	 // creating a loop so program does not stop till perticular input.
		
		while(ToContinue.equalsIgnoreCase("yes")) {
			//calling out beg size method from PotatoChipBag() and calling out inputinteger method from user class
			
			Bag.setSize(user.inputInteger("Enter Bag size \n" + "1 for Regular size \n"+ "2 for Large size"));
			//creating nested if to evaluate the user input and decide the size of bag.
			if(Bag.getSize()==1 || Bag.getSize()==2) {
				
					Bag.setWeight(user.inputDouble("Enter Weight: "));
					
					// creating if statement in side if to evaluate the user input and decide whether the bag is good, bad or invalid
					
					if(Bag.isBagCorrectWeight()==true) {
						//increasing the count of good bag.
					Good_Bag++;
					}
					else {
						//increasing the count of bad bag.
					Bad_Bag++;
					}
				
					Sum = Good_Bag + Bad_Bag;
					System.out.println("Good Bag: "+Good_Bag);
					System.out.println("Bad Bag: "+Bad_Bag);
					System.out.println("Total: "+Sum);
					System.out.println(" Continue Program? (yes/no)");
					ToContinue = input.nextLine();
					}
		
			else {
				
				System.out.println("The input is Invalid \n" +" Do you want to Continue program?(yes/no)");
				//caling out ToContinue tocheak the user’s Boolean (yes/no) input in next line.
				
				ToContinue = input.nextLine();
				
					}
		
			
			
		};
		
		
		

	}
}