/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: The Due Date (2022)
 * Description: Sample Solution for Assignment 01 (22W)
 */

/*
 * This class represents a circular table top, with attribute
 * diameter, and one worker method that returns the surface area
 * of the table. The API class Math is used to perform the calculations.
 */
public class CircularTableTop {
	private double diameter; // in inches
	
	/*
	 * no-argument constructor, sets diameter to zero
	 */
	public CircularTableTop() {
		this(0);
	}
	
	/*
	 * overloaded constructor, accepts diameter, provided to
	 * make the class more convenient for re-use.
	 */
	public CircularTableTop(double diameter) {
		this.diameter = diameter;
	}

	/*
	 * accessor for diameter, in inches
	 */
	public double getDiameter() {
		return diameter;
	}

	/* 
	 * mutator for diameter, in inches
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	/*
	 * worker method that calculates surface area based on diameter
	 */
	public double calculateSurfaceArea() {
		double area = 0;
		double radius = 0;
		radius = diameter / 2;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
