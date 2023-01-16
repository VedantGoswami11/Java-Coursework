/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: The Due Date (2022)
 * Description: Sample Solution for Assignment 01 (22W)
 */

/*
 * this class represents a wood worker and contains only
 * one worker method that calculates the number of tables that can
 * be varnished given the surface area of one table and the number
 * of coats of varnish to be applied to each table.
 */
public class WoodWorker {
	
	/*
	 * This method calculates the number of tables that can be varnished
	 * using one can of varnish. It needs the surfaceArea of the table
	 * top, and the number of coats of varnish to be applied.
	 */
	public double calculateTablesPerCan(double surfaceArea, int coats) {
		double tablesPerCan;
		tablesPerCan = 46800 / (surfaceArea * coats);
		return tablesPerCan;
	}

}
