
/*creating PotatoChipBag() class to get the size and weight and it will be used to check if the bag is good or bad in main method.*/
public class PotatoChipBag {
	//decleration of constants and variables.
	private int size; // Regular or Large (use constants below)
	private double weight;// oz
	
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz
	private static final double EPSILON = 0.01;
	
	
	//creating method for regular size bag and its weight
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}
	
	//creating mutator for potatochipbag and setting values of size and weight.
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}
	
	//getters for size
	public int getSize() {
		return size;
	}
	
	//mutators for size
	public void setSize(int size) {
		this.size = size;
	}
	
	//getters for weight
	public double getWeight() {
		return weight;
	}
	
	//mutators for size
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// creating isBagCOrrectWeight() method to check if the weight input belongs to good or bad bag 
	public boolean isBagCorrectWeight() {
		boolean result = false; 
		//checking if user have input regular or large size. 
		if(this.size == REGULAR) {
			//checking good or bad bag for regular size chips. 
			if(Math.abs(weight-REGULAR_WEIGHT)>=EPSILON) {
			   return result;
		 }
			else {
			 result = true;
			     return result;
		 }
			
		}
			if(this.size == LARGE) {
				//checking good or bad bag for large size chips.
					if(Math.abs(weight-LARGE_WEIGHT)>=EPSILON) {
				    return result;
			 }
						else {
								result = true;
									return result;
			 }
			
		}
		
			return result;
	}
	
}