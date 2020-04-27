package lab9;

import java.util.*;

/**
 * @author JeannieMcCarthy
 *
 */
public class Lab9 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice; 
		String goAgain = "yes";
		boolean inStock = true;
		Map<Integer, String> menuIndex = Methods9.getMenuIndex();
		Map<String, Double> menu = Methods9.getMenu();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<Double> prices = new ArrayList<>();

		// Welcome user
		System.out.println("Welcome to Literally The Greatest!");
		System.out.println("What's your story?\n");
		
		do {
			if (inStock) {
				// call a method to display menu
				Methods9.printMenu();
			}
			// ask for user input
			System.out.println("\nWhich book would you like to purchase? Enter the number on the menu:");
			userChoice = scnr.nextInt();
			scnr.nextLine();//clear the scanner
			
			//check if requested item exists
			if (Methods9.isOnMenu(userChoice)) {
				inStock = true;
				// add chosen option to parallel ArrayLists
				//add value of menuIndex (title) at key (userChoice) to titles ArrayList
				titles.add(menuIndex.get(userChoice));
				//add value of menu (price) at key (title) to price ArrayList
				prices.add(menu.get(menuIndex.get(userChoice)));
				
				System.out.println("Added " + menuIndex.get(userChoice) + 
						" at $" + menu.get(menuIndex.get(userChoice)) + " to your cart.\n");
			}
			else {//if item does not exist
				System.out.println("That item does not appear to be in stock.");
				inStock = false;
				continue;
			}
			// ask user if want another
			System.out.println("Would you like to continue shopping? y to continue, n to checkout:");
			goAgain = Validator.yesOrNo(scnr);
			
		}while (goAgain.equals("yes"));
		
		//End shopping, display cart
		System.out.println("Thanks for shopping with us! Here's your cart:\n");
		for (int i = 0; i < titles.size(); i++) {
			System.out.printf("%-27s| $%-5.2f  |\n", titles.get(i), prices.get(i));
			System.out.println(".....................................|");
		}
		//Display Average, Highest and Lowest
		System.out.print("Average price per item in order was: $");
		System.out.printf("%.2f \n", Methods9.getAvg(prices));
		System.out.print("The most expensive item in order was: $");
		System.out.printf("%.2f \n", prices.get(Methods9.getHighIndex(prices)));
		System.out.print("The least expensive item in order was: $");
		System.out.printf("%.2f \n", prices.get(Methods9.getLowIndex(prices)));

	}
}