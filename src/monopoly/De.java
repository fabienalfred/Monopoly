package monopoly;

import java.util.Random;

public class De {
	
	/***** ATTRIBUTES *****/
	
	private int value;
	private Random random = new Random();

	
	/***** METHODS *****/
	
	public int lancer() {
		value = random.nextInt(6) + 1;
		return value;
	}
	
	
	/***** GETTERS SETTERS *****/
	
	public int getValue() {
		return value;
	}

	
}
