package gcdemos;

import java.util.Scanner;

public class FeetConversionApp { //FeetConversionApp is an identifier
	//this is a single line comment; close not used
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter distance in feet."); //<-- that is 1 statement
		double feet = scnr.nextInt(); 
		/*These are block comments
		 * they cover multiple lines and can be placed between code bc of the closing punctuation
		 */
		double inches = feet * 12;
		
		System.out.println("Inches: " + inches);
	}

}
