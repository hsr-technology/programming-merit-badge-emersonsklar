package main;

import java.util.Random;

public class CodeExecutor {

	char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	public static void main(String[] args) {
		
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

}
