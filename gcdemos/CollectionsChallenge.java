package gcdemos;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsChallenge {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int index;
		ArrayList<String> arr = new ArrayList<>();
		arr.add("If you're");
		arr.add("happy");
		arr.add("and you know it");
		arr.add("clap your");
		arr.add("hands");
		
		System.out.println(arr);
		
		System.out.print("\nPlease tell me where you'd like to insert the name \"Grant Chirpus\" (1-5): ");
		index = (scnr.nextInt() - 1);
		
		nameList(arr, index);
		
		System.out.println(arr);
		System.out.println("\nGoodbye");
		
		scnr.close();
	}
	
	
	
	public static ArrayList<String> nameList(ArrayList<String> arr, int index){
		arr.set(index, "Grant Chirpus");
		
		return arr;
	}

}
