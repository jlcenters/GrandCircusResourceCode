package gcdemos;

public class RecursionDemos {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fibonacci(8));
	}
	private static int factorial(int n) { //most common usage of recursion
		System.out.println("Start factorial " + n); //n is one 
		if(n == 1) { //if statements are best used with recursion statements
			return 1;
		}else {
		return n * factorial(n - 1); //infinite loop on its own
		}
	}
	private static int fibonacci(int n) {
		if(n == 1|| n == 2) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n-2);
		}
	}
}
