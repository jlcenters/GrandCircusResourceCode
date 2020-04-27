package gcdemos;
import java.util.Scanner;
public class FarmDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How many acres?");
		double acres = scnr.nextDouble();
		double yield = acres * 10;
		
		System.out.println("How much rain (inches)?");
		double rain = scnr.nextDouble();
		
		if(rain > 20)
			yield -= .1 * yield;
		else if(rain < 10)
			yield -= .2 * yield;
		
		System.out.println("Did you fertilize? (y/n)");
		String didFertilizeText = scnr.next();
		
		if(didFertilizeText.toLowerCase().startsWith("y"))
			yield += .1 * yield;
		
		System.out.println("you obtained " + yield + "lbs of grain this season.");
		System.out.println("Goodbye.");
			
		scnr.close();
	}

}
