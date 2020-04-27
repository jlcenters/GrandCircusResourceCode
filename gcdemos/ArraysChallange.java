package gcdemos;

import java.util.Arrays;

public class ArraysChallange {

	public static void main(String[] args) {
		// #1 Sum the values in this array. Answer: 54
		int[] numbers = { 1, 1, 2, 3, 5, 8, 13, 21 };
		
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		System.out.println(sum);
		
		// #2 Sum all the values of this 2D array. Answer: 136
		// HINT: nested loops. loop the rows, loop the columns
		int[][] matrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		
		sum = 0;
		for(int[] row : matrix) {			 
			for(int cell : row) {
				sum += cell;
			}
		}
		System.out.println(sum);
	}

}