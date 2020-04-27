package gcdemos;
import java.util.Scanner;

public class TraceEx {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int number = 1;
		while (true) {
			System.out.print("Do you love the number " + number + "? (y/n)");
			boolean love = scnr.next().equalsIgnoreCase("y");
			
			if (love) {
				System.out.println(number + " is awesome!!!");
				break;
			} else {
				number *= 2;
			}
		}

		scnr.close();
	}

}