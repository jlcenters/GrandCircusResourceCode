package gcdemos;
import java.util.Scanner;
public class Paycheck {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double wage = 10.00;
		System.out.println("Welcome to your Company's Paycheck Calculator!");
		System.out.println("How many hours did you work this week?");
		double hours = scnr.nextDouble();
		double pay = wage * hours;
		if(hours <= 40.00) {
			pay += (hours - 40) * .5;
		}
		System.out.println("Your earnings for the week are: " + pay);
		System.out.println("Goodbye.");
			
	
		scnr.close();
	}

}
