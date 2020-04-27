package gcdemos;

import java.util.Scanner;
/*
 * @author jilliancenters
 */
public class StringPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean playAgain = true;
		
		System.out.println("Welcome to the Official Knighting Game! [PATENT PENDING]");
		
		while(playAgain) {
			System.out.print("Please Enter your first name: ");
			String first = scan.nextLine();
			System.out.print("Please enter your last name: ");
			String last = scan.nextLine();
			
			System.out.println("Knighting Ceremony ---- Sir " + first.toUpperCase() + " " + last);
			
			System.out.println("Would you like to play again?(y/n)");
			playAgain = scan.nextLine().startsWith("y");
		}
		System.out.println("Fair Thee Well!");
		scan.close();
	}

}
