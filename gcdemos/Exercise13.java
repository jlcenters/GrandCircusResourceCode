package gcdemos;

import java.util.Scanner;

/*
 * @authors kyle jeannie jillian
 */
public class Exercise13 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		boolean goAgain = true; //boolean primed
		while(goAgain) {
			System.out.println("Enter a number: ");
			int userNum = scnr.nextInt();
			for(int i = userNum; i >= 0; i--) { //a FOR LOOP within a WHILE LOOP
				System.out.print(i + " ");
				
			}
		System.out.println("Would you like to go again? (y/n)");
		goAgain = scnr.next().startsWith("y");
		}
		System.out.println("Goodbye!");
	}

}
