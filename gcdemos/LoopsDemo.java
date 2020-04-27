package gcdemos;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	//FOR LOOP
		for(int i = 1; i <= 6; i++) {
			System.out.println("Set plate");
			System.out.println("Set fork");
			System.out.println("Set knife");
			System.out.println("Set spoon");
			System.out.println("Seated");
		}
		
	//FOR LOOP STARTING AT 0
		for(int i = 0; i < 6; i++) {//<--- < 6 is the standard as opposed to <= 5; because you know how many times it will loop
			System.out.println(i);
		}
	//FOR LOOP DECREMENTING WOULD BE i--
		
	//MULTIPLES OF A NUMBER
		for(int i = 30; i <= 40; i += 2) {
			System.out.print(i);
			System.out.println(" and");
		}
		System.out.println("Done.");
	//WHILE LOOP
		System.out.println("Would you like to play?");
		boolean wantToPlay = scnr.next().startsWith("y");
		
		while(wantToPlay) {
			System.out.println("PLAYING");
			System.out.println("...");
			System.out.println("PLAY SESSION COMPLETE");
			System.out.println("Would you like to play again?");
			wantToPlay = scnr.next().startsWith("y");
		}
		
		
		
		
	//DO WHILE LOOP
		System.out.println("Google Search");
		
		boolean foundIt;
		do {
			System.out.println("open page.");
			System.out.print("Did you find your quote? (y/n)");
			foundIt = scnr.next().startsWith("y");
		}while(!foundIt);
		
		System.out.println("Send it to your buddy!");
		System.out.println("Goodbye.");
		scnr.close();
	}

}
