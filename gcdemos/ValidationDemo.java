package gcdemos;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//checkforInt(scnr);
		//getInt(scnr, "Enter a whole number: ");
		//System.out.print("Do you love this number? ");
		//String response = scnr.nextLine();
		//System.out.println(response +  " is also what I would say about that number.\nGoodbye!");
		
		
		
		int num = Validator.getInt(scnr, "Enter a number: ", 0, 5);
		System.out.println("You entered " + num);	
		System.out.println("Goodbye");
	}
	
	
	
	
	public static void checkforInt(Scanner scnr) {
		System.out.print("Please enter a number: ");
		
		
		if(scnr.hasNextInt()){
		int num = scnr.nextInt();
		System.out.println(num);
		
		}else {
			System.out.println("Please enter a whole number.");
		}
		
		scnr.close();
	}
	
	
	
	public static void getInt(Scanner scnr, String prompt) {
		System.out.print(prompt);
		
		
		
		while(!scnr.hasNextInt()) { //staying in loop until correct input received
			scnr.nextLine(); //GARBAGE LINE to clear out the scanner
			
			System.out.print("Sorry, I can't read that. ");
			System.out.println(prompt);
		}
		
		
		
		int num = scnr.nextInt();
		scnr.nextLine();
		System.out.println("You entered: " + num);
		
	}
}
