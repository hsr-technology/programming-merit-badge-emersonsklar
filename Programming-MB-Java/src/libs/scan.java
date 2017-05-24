package libs;

import java.util.Scanner;

/**
 * 	This class contains several common methods utilizing the Scanner class.
 * 	@author Liam Williams
 */

public class scan {

	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Outputs the given string and waits for an Integer response
	 * @param output
	 * 			String to be outputted to the user
	 * @return	Integer recieved from the user
	 */
	public static int recieveInt (String output) { 
		int in;
		System.out.print(output);
		in = scan.nextInt();
		return in;
	}
	
	/**
	 * Outputs the given string and waits for a Double response
	 * @param output
	 * 			String to be outputted to the user
	 * @return	Double recieved from the user
	 */
	public static double recieveDouble (String output) {
		double in;
		System.out.print(output);
		in = scan.nextDouble();
		return in;
	}
	
	/**
	 * Outputs the given string and waits for a Long response
	 * @param output
	 * 			String to be outputted to the user
	 * @return	Long recieved from the user
	 */
	public static long recieveLong (String output) { 
		long in;
		System.out.print(output);
		in = scan.nextLong();
		return in;
	}
	
	/**
	 * Outputs the given string and waits for a String response
	 * @param output
	 * 			String to be outputted to the user
	 * @return	String recieved from the user
	 */
	public static String recieveString (String output) {
		String in;
		System.out.print(output);
		in = scan.nextLine();
		return in;
	}
	
}

