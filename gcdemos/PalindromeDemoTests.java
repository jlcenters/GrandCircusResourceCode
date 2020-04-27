package gcdemos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeDemoTests {

	@Test
	void mumIsPalindrome() {
		boolean actual = PalindromeDemo.isPalindrome("mum");
		assertTrue(actual);
	}

	
	@Test
	void noIsNotPalindrome() {
		boolean actual = PalindromeDemo.isPalindrome("no");
		assertTrue(actual);
	}
	
	@Test
	void racecarIsPalindrome() {
		boolean actual = PalindromeDemo.isPalindrome("racecar");
		assertTrue(actual);
	}
	
	@Test
	void whitespaceIsPalindrome() {
		boolean actual = PalindromeDemo.isPalindrome("race car");
		assertTrue(actual);
	}
	
	@Test
	void titleCapsIsPalindrome() {		//shorter way of using test
		assertTrue(PalindromeDemo.isPalindrome("Mum"));
	}
}
