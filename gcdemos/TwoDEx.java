package gcdemos;
import java.util.Arrays;

public class TwoDEx {

	public static void main(String[] args) {
		// [rows][columns]  a.k.a. [y][x];
		char[][] board = new char[3][3];
		
		board[0][0] = 
		board[0][1] = 
		board[1][2] = 
		board[1][0] = 
		board[2][1] = 
		board[2][2] = 
		
		
		
		
		
		
//		board[0][0] = 'X'; // [y][x]
//		board[1][1] = 'O';
//		board[2][0] = 'X';
		
		print2D(board);
	}
	
	private static void print2D(char[][] array) {
		// loop through the rows. print each row.
		for (int y = 0; y < array.length; y++) {
			System.out.println(Arrays.toString(array[y]));
		}
	}

}