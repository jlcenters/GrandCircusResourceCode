package gcdemos;
import java.util.Scanner;
public class methodsGame {

	public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
				StringMethods methods = new StringMethods();
				boolean waldoNotFound = true;
				boolean mathUnderstood = true;
				boolean playAgain = true;
				
				while(playAgain) {
					
					System.out.println("THE YOUNG HERO'S JOURNEY");
					System.out.println("\n");
					System.out.println("Welcome! You are a Scholar, and with your village's elder, you will tell the young generation the story of the Young Hero and his Trusty Friend. ");
					System.out.println("Long ago, there was a beautiful and prosperous kingdom that went by the name of Valourwells. The people were happily ruled under the old and wise Queen Justinia, who gave them the blessing of eternal peace.\n"
							+ "But one day, their peace was threatened by a beautiful but cruel beast that was the size of of ten: ");
					String beastSize = firstThingsFirst();
					
					System.out.println("prompt for name.");
					String heroName = scn.nextLine();
					
					System.out.println("We must figure out where Master Waldo could be, and that's how many miles you must trek");
					while(waldoNotFound) {
						int hesHere = methods.wheresWaldo(scn.nextLine());
						if(hesHere < 0) {
							System.out.println("you must ask around some more.");
						}else {
							System.out.println("you must travel " + hesHere + " miles southeast by foot, in order to reach Master Waldo.");
							waldoNotFound = false;
						}
					}
					
					System.out.println("In order for you to win your battle against the " + beastSize + "d beast, we must understand its soul. Everyone knows that NAMES are in fact doors into ones mind. go out and report back to me once you've heard something.");
					capitalize;
					System.out.println("hmm, " + properCaps + "... Ah! Yes, that's it's name!");
					
					System.out.println("Your fighting style is very unique. what do you call it?");
					pascal;
					System.out.println("That's quite boring. Oh! I've got it! you should call your fighting style, " + pascalTime + ". What, questioning your mentor? Foolish!");
					
					System.out.println("After a long 10 weeks, you've finally finished your training. your mentor offers the sword, which has some magical ability. you find that it reflects your greatest passion!");
					letterized;
					System.out.println("Looks great!");
					
					System.out.println("child, do you have a true understanding of yourself? only if you can admit your greatest fear to the sword, can you dispell your fear's powers onto yourself and expell it into the saber's cache!");
					reversed;
					System.out.println("The sword echoes out as you swing it at a dummy: " + reversePhrase + "!");
					
					System.out.println("You are ready to fight the Ten-" + beastSize + " Beast," + properCaps + ". On your way over to his lair, your childhood friend greets you! They want to join in on the battle! \nUh, what was their name?");
					soLong;
					System.out.println("Ah yes, you remember their name to be " + properOrder + ", not the other way around. Everyone always got their first and last name mixed up but not " + heroName + ", for you had always known their first name the longest.");
					System.out.println("together you fight");
				}
				System.out.println("Farewell.");
				
				scn.close();
	}

}
