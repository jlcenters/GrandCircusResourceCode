package gcdemos;
/*
 * @author jilliancenters
 */
import java.util.Scanner;
public class IfElseApp {

	public static void main(String[] args) {
		//Shallow Grandmother Test
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scnr.nextInt();
		
		System.out.println("Enter your salary: ");
		int salary = scnr.nextInt();
		
		System.out.println("How cute are you from 0.0 to 10.0?");
		double cuteness = scnr.nextDouble();
		
		/*boolean acceptable;
		if((age >= 25 && age <= 40) && (salary >= 50000 || cuteness > 8.5)) {
			acceptable = true;
		} else {
			acceptable = false;
		}*/
		String acceptable = "";
		if((age >= 20 && age <= 40) && (salary >= 50000 || cuteness >= 8.5)) {
			acceptable = "are ";
		} else {
			acceptable = "are not ";
		}
		
		System.out.println("You " + acceptable + "eligible to date my grandchild.");
		
		/*String userAnswer = "";
		while (userAnswer != "y")
		System.out.println("Enter your grade percentage:");
		int grade = scnr.nextInt();
		if(grade >= 90)
			System.out.println("A");
		else if(grade >= 80)
			System.out.println("B");
		else if(grade >= 70)
			System.out.println("C");
		else if(grade >= 60)
			System.out.println("D");
		else if(grade >= 50)
			System.out.println("E");
		else
			System.out.println("Error");
		System.out.println("Would you like to enter ANOTHER number? (y/n)");*/
		
		
		scnr.close();
	}

}
