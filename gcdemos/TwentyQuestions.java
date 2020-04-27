package gcdemos;

import java.util.Scanner;

public class TwentyQuestions {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Is it hot?");
		boolean isHot = scnr.next().startsWith("y");
		
		if(isHot) {
			System.out.println("Is it in the sky?");
			boolean inSky = scnr.next().startsWith("y");
			
			if(inSky)
				System.out.println("It's the Sun.");
			else
				System.out.println("It's Coffee.");
		}else {
			
		}
		
	}

}
