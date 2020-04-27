package gcdemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Jillian
 *
 */
public class ExceptionDemo { //required to use try catch finally's in some situations (file in/out manipulation)

	public static void main(String[] args) {
		String dateString = "01/282021"; //~FUTURE~
		
		try {
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
		}catch(ParseException pe) {
			System.out.println("Invalid date...");
			pe.printStackTrace();
		}finally {
			System.out.println("good job!");
		}
		System.out.println("Goodbye.");
		//e.printStackTrace(); //PRINTS COMPILER MSG
		
		try {
			
			String numInString = "0";
			int num = Integer.parseInt(numInString); //wrapper class; can turn found integers into int
			int answer = 10 / num;
					
		}catch(NumberFormatException nfe /*|ArithmeticException numEx [TO ADD TWO EXCEPTIONS IN ONE CATCH STMNT]*/) {
			System.out.println("That's not a number");
		}catch(ArithmeticException ae){
			System.out.println("Cannot Divide by 0");
		}catch(Exception e){
			System.out.println("Something's wrong");
			e.printStackTrace();
		}finally {
			System.out.println("Good job!");
		}
	} 

}
