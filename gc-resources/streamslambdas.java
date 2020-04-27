import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
//		## Create an array of ten words. For each of the following, use Stream.of() to create a stream from the array.
		String[] words = { "Hi", "Apple", "Cat", "Sand", "Anger", "Dig", "Chill", "Chili", "Zen", "Arm" };
//		* use count() to print the number of words.
		System.out.println(Stream.of(words).count());
//		* use filter and collect() + Collectors.toList to print a list of only the words that start with "A".
		System.out.println(Stream.of(words).filter(word -> word.startsWith("A")).collect(Collectors.toList()));
//		for(String word:words) {
//			
//		}
//		* use filter and count() to print the number of words that start with "A".
		System.out.println(Stream.of(words).filter(word -> word.startsWith("A")).count());
//		* use filter and findFirst to print the first word that starts with "A". If none, print "None Found".
		System.out.println(Stream.of(words).filter(item -> item.startsWith("A")).findFirst().orElse("None Found"));
//		use filter and findFirst to print the first word that starts with "B". If none, print "None Found".
		System.out.println();
//		use filter and collect() + Collectors.toList to print a list of only the words that have length 5.
		System.out.println(Stream.of(words).filter(item -> item.length() == 5).collect(Collectors.toList()));
//		use filter and findFirst to print the first word of length 5. If none, print "None Found".
		System.out.println(Stream.of(words).filter(item -> item.length() == 5).findFirst().orElse("None Found"));
//		* use map and collect() + Collectors.toList to print a list of the lengths of the words.
		System.out.println(Stream.of(words).map(word -> word.length()).sorted().collect(Collectors.toSet()));
//		use map and collect() + Collectors.toSet to print a set of the first letter of each word. (Note: sets automatically remove duplicates.)
		System.out.println(Stream.of(words).map(word -> word.charAt(0)).collect(Collectors.toList()));
		//use map and collect() + Collectors.toList to print a list of all the words in all caps.
		System.out.println(Stream.of(words).map(word -> word.toUpperCase()).collect(Collectors.toList()));
		//		## Create a List of several numbers. For each of the following, use .stream() to create a stream from the list.
		List<Integer> nums = Arrays.asList(4, -2, 8, 4, -5, -7, 2, 3, 9, 0, -4);
//		* use count() to print the number of numbers.
		System.out.println(nums.stream().count());
//		use map and collect() + Collectors.toList to print a list of the squares of all the numbers.
		System.out.println(nums.stream().map(num -> num * num).collect(Collectors.toList()));
//		use filter and collect() + Collectors.toList to print a list of only the positive numbers.
		System.out.println(nums.stream().map(num -> num > 0).collect(Collectors.toList()));
//		use filter and map and collect() + Collectors.toList to print a list of squares of all the numbers, but only include positive numbers.
		//System.out.println(nums.stream().map(num -> (num > 0) * num).collect(Collectors.toList()));
	}

}
