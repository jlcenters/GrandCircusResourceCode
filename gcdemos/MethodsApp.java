package gcdemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsApp {

	public static void main(String[] args) {
		// 1. Call sayHello
		sayHello();
		// 2. Call introduceYourself
		introduceYourself("Jill", 21);
		// 3. Call getDay, print the result
		System.out.println(getDay());
		// 4. Call getAverage, print the result
		System.out.println(getAverage(5, 10));
		// 5. Call square, pass it x, store the result in a variable called x2, print x2
		int x = 3;
		int x2 = square(x);
		System.out.println(x2);
		// 6. Call square twice... with a and b. Add the results together and print it.
		int a = 4, b = 3;
		a = square(a);
		b = square(b);
		System.out.println(a + b);
		System.out.println(square(a) + square(b));
	// 7. Find the hypoteneus: square root of (a squared + b squared).
	// Store the result in a variable and then print it.
		int hypo = squareRoot(square(a) + square(b));
		System.out.println(hypo);
	// 8. Call isJavaCool from OtherMethods and print the result
		//OtherMethods method = new OtherMethods(); <--- non static, if static you can do below
		System.out.println(OtherMethods.isJavaCool());		
		// 9. In the loop, call isVowel from OtherMethods. Pass it letter.
		// Store the result in a variable.
		// Then print out letter and the variable in one line.
		String word = "Java";
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			boolean isVowel = OtherMethods.isVowel(letter);
			System.out.println(letter + " " + isVowel); //must add a string between, otherwise java will try to actually 'add'
		}												// ASCII to get the int value of a char
		
		// 10. Call getRandomLetter from OtherMethods. Store it in a variable and print it.
		// Call isVowel using the random letter. print the result.
		char letter = OtherMethods.getRandomLetter();
		System.out.println(letter);
		System.out.println(OtherMethods.isVowel(letter));
	// 11. Call square, passing it z. Add the result to z. Print z.
		int z = 7;
		z += square(z);
		System.out.println(z);
	}
	
	private static void sayHello() {
		System.out.println("Hello");
	}
	
	private static void introduceYourself(String name, int age) {
		System.out.println("I'm " + name + ". I'm " + age + " years old.");
	}
	
	private static String getDay() {
		return new SimpleDateFormat("EEEE").format(new Date());
	}
	
	private static double getAverage(int a, int b) {
		return (a + b) / 2.0;
	}
	
	private static int square(int n) {
		return n * n;
	}
	
	private static int squareRoot(int n) {
		return (int) Math.round(Math.sqrt(n));
	}
}