import java.util.Scanner;

/*public class main {
    
	
    
    public static void main(String[] args) {
    	
    	// FIRST
    	double lengthOfStick, ExpactedLength = 1.00000;
    	Scanner input = new Scanner(System.in); 
    	System.out.print("What is a lenght of meter stick");
    	lengthOfStick = input.nextDouble();
    	
    	double Tolerance = Math.abs(lengthOfStick - ExpactedLength);
    		
    	if(Tolerance <= 0.0001) { System.out.print("The length of stick is within the Tolerance" + " "+Tolerance +"\n"); }
    			else System.out.print("The length of stick is not within the Tolerance" + " "+Tolerance +"\n");

    	// SECOND
    	
    	int CheckTolerance = 1,Convertintomillimeter = 3,Printreport = 4   ;
		
    	int Convertintocentimeter =2;
    	Scanner input2 = new Scanner(System.in);   	
        System.out.print("1. Cheak Tolerance\n"
    			+ "2. Convert into centimeter\n"
    			+ "3. Convert into millimeter\n"
    			+ "4. Print report");
       System.out.print("\n Enter the number of process you want.");
       int NumberOfOpration;
       NumberOfOpration = input.nextInt();
       
       if(NumberOfOpration == Convertintocentimeter	){
    	   System.out.print("The length of meter stick in centimeter is"+"  "+ lengthOfStick*100 +"\n"); }
    	   
    	   else if(NumberOfOpration == Convertintomillimeter){
        	   System.out.print("The length of meter stick in millimeter is"+"  "+ lengthOfStick*1000); }
    	   	
    	   		else if(NumberOfOpration == Printreport){
    	   			System.out.print("The length of meter stick is"+"  "+ lengthOfStick); }
    	   			
    	   			//else if(NumberOfOpration == CheckTolerance){
        	   		//	System.out.print("The length of meter stick is"+"  "+ lengthOfStick); };;
    	   		else System.out.print("The value is invalid") ;
			
	}*/
/*
 * File level comment goes here
 */
import java.util.Scanner;

/*
 * Class level overview goes here
 */
public class main {

	/*
	 * main method
	 */
	public static void main(String[] args) {
        
		//declaration and import of scanner + MeterStick
		
		Scanner keyboard = new Scanner(System.in);
		MeterStick stick = new MeterStick();
		double userLength;
		
		
		//asking user to give the length of meter stick in meters
		 
		

		System.out.println("Meter stick checker program.");
		System.out.print("Enter measured length in meters: \n");
		userLength = keyboard.nextDouble();
		keyboard.nextLine();
		stick.setLength(userLength);
		
	

		
	//print command for showing Menu  
		System.out.print("1. Check Tolerance\n"
    			+ "2. Convert into centimetre\n"
    			+ "3. Convert into millimetre\n"
    			+ "4. Print report\n");
       System.out.print("\n Enter the number of process you want.");
       
    //taking input from the user
       int NumberOfOpration;
       NumberOfOpration = keyboard.nextInt();
       
       
    // create constants for the menu
       final int  CheckTolerance = 1,Convertintomillimeter = 3,Printreport = 4   ;
		final int Convertintocentimeter =2;
		
    // creating if / else statements for the selected menu items
		if(NumberOfOpration == Convertintocentimeter	){
	    	   System.out.printf( "%.5f",stick.toCentimeters()); }
	    	   
	    	   else if(NumberOfOpration == Convertintomillimeter){
	        	   System.out.printf("The length of meter stick in millimetre is %.5f  ",stick.toMillimeters()); }
	    	   	
	    	   		else if(NumberOfOpration == Printreport){
	    	   			System.out.printf(stick.toString(),stick.getLength()); }
	    	   			
	    	   			else if(NumberOfOpration == CheckTolerance){
	    	   				System.out.printf("%.5s",stick.verify());
	    	   				
	    	   			}
	    	   			
	    	   		//exemption statement if the given integer is out of menu select options.       
	        	   			else System.out.printf("The value is invalid") ;
		
       
		System.out.println("\n  Program by Vedant Goswami"); // replace with your name
	}
}



