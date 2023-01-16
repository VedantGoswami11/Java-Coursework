/*
 * File level comment goes here
 */

/*
 * Class level overview goes here
 */
public class MeterStick {
	public static final double EXPECTED_LENGTH = 1.0; // meters
	public static final double EPSILON = 0.0001;
	private double length;
	
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
		// write the working method, replace the 'method not implemented yet' 
		// with the real report.
		// all numbers need to be formatted to 5 decimal places.
		report = "method not implemented yet";
		return report;
	}
	
	/*
	 * method comment goes here
	 */
	public String verify() {
		String report;
		
		// write the working method, replace the 'method not implemented yet' 
		// with the real report.
		// all numbers need to be formatted to 5 decimal places.
		report = "method not implemented yet";
		return report;
	}































	

}
