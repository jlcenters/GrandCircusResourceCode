package gcdemos;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] countries = new String[4]; //starts as NULL,NULL,NULL
		countries[0] = "China";
		countries[1] = "United States";
		countries[2] = "India";
		countries[3] = "Indonesia";
		System.out.println(countries + "\n"); // prints out array in hexadec and numeric
		
		
		
		for(int i = 0; i < countries.length; ++i) { //stops to just before the last element of the array
			System.out.print((1 + i) + ": ");
			System.out.println(countries[i]);
		}
		
		System.out.println("\n");
		
		for(int i = countries.length - 1; i >= 0; --i) { //
			System.out.print((1 + i) + ": ");
			System.out.println(countries[i]);
		}
		
		
		
		System.out.println("\n");
		
		System.out.println(Arrays.toString(countries)); //prints out array with brackets
		
		System.out.println("Most Populous: " + countries[0]); //prints out individual element
		
		countries[1] = "USA"; //changes element 1 to "USA" from "United States"
		
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Pick an index: ");
		int userIndexChoice = scnr.nextInt();
		
		System.out.println(countries[userIndexChoice - 1]); //can insert variables to array nums - 1, so that we are able to ask for a num 1-4 rather than 0-3
		
		System.out.println("\n");
		
		int[] nums = {1, 5, 7, 0}; //alternate method of assigning array; convenient
		
		
		
		for(int i = 0; i < nums.length; ++i) {
			System.out.print((i + 1) + ": ");
			System.out.println(nums[i]); 
		}
		
		
		System.out.println("\n");
	//ENHANCED FOR LOOP
		for(String country : countries) {		//init var for loop; type is equal to array
			System.out.println(country);		//will print each country
		}
		
		System.out.println("\n");
		
		for(int num : nums) {					//CANNOT LOOP BACKWARDS WITH ENHANCED LOOP
			System.out.println(num);
		}
		
		
		System.out.println("\n");
		
		//PARALLEL ARRAYS
		String[] players = {"Beth","Jim","Sean","Kim"};		
		int[] jerseyNums = {10,22,42,7};
		
		for(int i = 0; i < players.length; ++i) {			//can use either loop; set to i
			System.out.println(players[i] + " wears " + jerseyNums[i]);
		}
		
		
		
		//2D ARRAYS
		int[][] someArray = new int[3][4];
		someArray [2][3] = 42;
		int[][] matrix = {{1,2},{3,4},{5,6}};
		
		for(int[] row : matrix) {			//IN ORDER TO PRINT OUT AN ARRAY
			System.out.println(Arrays.toString(row));
		}
		
		for(int[] row : matrix) {			// MULTIPLE ARRAYS
			for(int cell : row) {
				System.out.println(cell + " ");
			}
			System.out.println();
		}
	}

}
