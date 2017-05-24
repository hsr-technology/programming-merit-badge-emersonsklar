package libs;

import java.util.*;

/**
 *	This class contains several math related methods for common use.
 *	@author Liam Williams
 */

public class math {
	
	/**
	 * Rounds a given number to the second decimal place
	 * @param input
	 * 			The number to be rounded
	 * @return The rounded number
	 */
	public static double roundDec (double input) { 
		input = (double)Math.round(input * Math.pow(10, 2)) / Math.pow(10, 2);
		return input;
	}
	
	/**
	 * Generates a random Integer between min and max.
	 * @param min
	 * 			Minimum value in the range
	 * @param max
	 * 			Maximum value in the range
	 * @return	Randomly generated value
	 */
	public static int randomInt (int min, int max) {
		Random rand = new Random();
		int output = min + rand.nextInt((max + 1) - min);
		return output;
	}
	
	/**
	 * Generates a random Double between min and max.
	 * @param min
	 * 			Minimum value in the range
	 * @param max
	 * 			Maximum value in the range
	 * @return 	Randomly generated value
	 */
	public static double randomDbl (double min, double max) { 
		Random rand = new Random();
		double output = min + rand.nextDouble() * (max - min);
		return output;
	}
}

