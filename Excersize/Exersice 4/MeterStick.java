
public class MeterStick {


	public static final double EXPECTED_LENGTH = 1.0; // meters
	public static final double EPSILON = 0.0001;
	private double length;
	double Tolerance; 
	/*
	 * Constructor comments here
	 */
	public MeterStick() {
		this(EXPECTED_LENGTH);
	}
	
	/*
	 * Constructor comments here
	 */
	public MeterStick(double length) {
		this.length = length;
	}
	
	/*
	 * method comment goes here
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 * method comment goes here
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * method comment goes here
	 */
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		System.out.print("The length of meter stick in centimetre is"+"  ");
		return centimeters;
	} 
	
	/*
	 * method comment goes here
	 */
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		return millimeters;
	}
	
	/*
	 * method comment goes here
	 */
	public String toString() {
		String report;
		report = "The length of meter stick is %.5f ";
		return report;
	}
	
	/*
	 * method comment goes here
	 */
	public String verify() {
		String report="0";
		double Tolerance = Math.abs(length - EXPECTED_LENGTH);
		
		if(Tolerance <= 0.0001) { System.out.print("The length of stick is within the tolerance 0.0001"); }
		else System.out.print("The length of stick is not within the Tolerance 0.0001");
		
		return report;}


}
