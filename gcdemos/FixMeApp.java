package gcdemos;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO Write tests to find errors in the following methods, then fix them.
 * You MUST write the tests before you fix the errors.
 */
public class FixMeApp {

	/**
	 * Returns the sum of the given array.
	 * @param numbers an array of numbers to add together
	 * @return the sum of the array
	 */
	public static int findSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/**
	 * Counts the number of matching strings in the list.
	 * @param items list of strings
	 * @param match an exact string to look for in the list, including matching case
	 * @return the number of times the string was found in the list
	 */
	public static int countMatches(List<String> items, String match) {
		int count = 0;
		for (String item : items) {
			if (item.equals(match)) {
				++count;
			} else {
			}
		}
		return count;
	}
	
	/**
	 * Concatenates a message a specified number of times.
	 * For example, given "Hello", 3, it returns "HelloHelloHello".
	 * 
	 * @param message the message to repeat
	 * @param count how many times to repeat the string.
	 * @return one string that combines all the repeated messages.
	 */
	public static String repeat(String message, int count) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++) {
			result.insert(0,message);
		}
		return result.toString();
	}
	
	/**
	 * Use a for loop to reverse a string
	 * @param original the original string
	 * @return the reversed string
	 */
	public static String reverse(String original) {
		char[] chars = original.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			int reverseI = chars.length - i - 1;
			char c = chars[i];
			chars[i] = c;
			//chars[i] = chars[reverseI];
		}
		return new String(chars);
	}

}