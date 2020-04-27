package gcdemos;

public class OtherMethods {
	
	public static boolean isJavaCool() {
		return true;
	}

	public static boolean isVowel(char letter) {
		return "AEIOUaeiou".indexOf(letter) != -1;
	}
	
	public static char getRandomLetter() {
		return (char) ((int) (Math.random() * 26) + 'A');
	}
}