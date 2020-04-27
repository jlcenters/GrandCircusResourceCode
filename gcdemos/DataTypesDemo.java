package gcdemos;
import java.util.Scanner;
public class DataTypesDemo {
	public static void main(String[] args) {
	//PRIMITIVE TYPES
		//Whole numbers
			byte a = 13;
			short b = 782;
			int c = 2100000000;
			long d = 2200000000L;
		
		//Decimal numbers
			float x = 3.14F;
			double y = 3.14;
		
		//Misc
			boolean haha = true; //true and false only
			char letter = 'D'; 
	//REFERENCE TYPES
		String name = "David";
		String phrase = "I am \"David.\"";
		Scanner scnr = new Scanner(System.in);
		
	//TYPE CONVERSION
		double myDecimal = 1.2;
		int myInt = (int)myDecimal; //narrowing conversion/explicit cast; loses some accuracy (larger data into smaller data)
		
		int myOtherInt = 2;
		double myOtherDecimal = myOtherInt; //widening conversion; accuracy is not lost (smaller data stored into larger data)
		
	}

}
