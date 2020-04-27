package gcdemos;

import java.util.Arrays;

/*
 * @author jilliancenters
 */
public class StringsDemo {
				//for help, go on w3schools, oracle, 
	public static void main(String[] args) {
		String phrase = "Java is a good time!";
	//GRABS A CHAR FROM INDEX POINT
		char a = phrase.charAt(8);
		System.out.println(a);
		
	//LATTER HALF OF A STRING
		boolean end = phrase.endsWith("me!");
		System.out.println(end);
		
	//GRABS THE INDEX NUMBER OF A CHAR 
		int i = phrase.indexOf("a");
		System.out.println(i);
	//IF NOT FOUND, RETURNS -1 (can use the ASCII value to find index)
		i = phrase.indexOf("65");
		System.out.println(i);
		
	//GRABS LAST INDEX OF A STRING
		int lastA = phrase.lastIndexOf("a");
		System.out.println(lastA);
		
	//GRABS THE CHARACTER LENGTH OF A STRING
		System.out.println(phrase.length());
		
	//REPLACE ALL CHARS/SPLIT STRINGS IN STRING TO NEW CHAR
		System.out.println(phrase.replace("good", "fun"));
		
	//STRING ARRAYS
		String[] arr = {"apple", "bottom", "jeans"};
		System.out.println(arr[0]);
		
	//SPLITTING A STRING INTO AN ARRAY FOR EVERY TIME THE MENTIONED CHAR APPEARS
		String[] org = phrase.split(" ");
		
	//ENHANCED FOR LOOP, (kinda) BUILT FOR ARRAYS
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(org)); //toString available to all primitive types
		
	//SUBSTRINGS GATHER AND STORE A PORTION OF A STRING INTO A NEW STRING
		String game = "hopscotch";
		System.out.println(game.substring(3));
		System.out.println(game.substring(0,3));
		System.out.println(game.substring(3,9)); //extend passed the index to get the last char
		
	//CASE ALTERATIONS
		System.out.println(phrase.toLowerCase());
		System.out.println(phrase.toUpperCase());
		
	//TRIMS WHITESPACE ON OUTSIDE
	//	String extraWhite = "   Hello World!   ";
	//	System.out.println(extraWhite trim());
		
	}

}
