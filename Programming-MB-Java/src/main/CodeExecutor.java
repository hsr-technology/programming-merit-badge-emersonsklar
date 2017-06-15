package main;

/*
 *	The purpose of this class is to run three test cases for the DateCalculator class (to be made).
 *	The only needs for the class is to have four (4) total methods for setting the date, and retrieving
 *	it in three different formats. The date needs to be stored and changeable internally, in any format.
 *
 *	@author Liam Williams
 *	@version 1
 */
public class CodeExecutor {

	public static void main(String[] args) {
		DateCalculator dc = new DateCalculator(); //Creates a DateCalculator object dc
		
		//Test case 1.
		dc.setDate("01/01/1998");
		System.out.println("Date is:\n" +
							dc.getDateExtended() + "\n" +
							dc.getDateShortened() + "\n" +
							dc.getDateNormal() + "\n");
		
		//Test case 2.
		dc.setDate("12/30/2013");
		System.out.println("Date is:\n" +
							dc.getDateExtended() + "\n" +
							dc.getDateShortened() + "\n" +
							dc.getDateNormal() + "\n");
		
		//Test case 3.
		dc.setDate("07/31/1809");
		System.out.println("Date is:\n" +
							dc.getDateExtended() + "\n" +
							dc.getDateShortened() + "\n" +
							dc.getDateNormal() + "\n");
	}

}
