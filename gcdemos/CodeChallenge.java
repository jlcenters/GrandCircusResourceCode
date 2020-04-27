package gcdemos;
import java.util.Scanner;
public class CodeChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please have a look at our menu: \nCoffee\nLatte\nMocha\n");
        System.out.println("Would you like clarification on any of the drinks?");

        boolean moreQuestions = true;
        
        while(moreQuestions) {
            String userDrink = scan.nextLine().toLowerCase();

        	switch(userDrink){
        	case "coffee":
        		System.out.print("That has ");
        		serveCoffee();
        		System.out.println(" in it.");
        		break;
        	case "latte":
        		System.out.print("That has ");
        		serveLatte();
        		System.out.println(" in it.");
        		break;
        	case "mocha":
        		System.out.print("That has ");
        		serveMocha();
        		System.out.println(" in it.");
        		break;
        	}
        	System.out.println("Do you have any more questions? (y/n)");
        	moreQuestions = scan.nextLine().toLowerCase().startsWith("y");
        }
        System.out.println("Let me know if you need any more help!");
        
        scan.close();
    }
    private static void serveCoffee() {
        System.out.print(getCoffee());
    }
    private static void serveLatte() {
        System.out.print(getEspresso() + " with " + getMilk());
    }
    private static void serveMocha() {
        System.out.print(getEspresso() + " with " + getMilk() + " and " + getChocolate());
    }
    private static String getCoffee() {
        return "Coffee";
    }
    private static String getEspresso() {
        return "Espresso";
    }
    private static String getMilk() {
        return "steamed milk";
    }
    private static String getChocolate() {
        return "chocolate sauce";
    }
}