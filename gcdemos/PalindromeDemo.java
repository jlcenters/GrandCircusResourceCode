package gcdemos;

public class PalindromeDemo {

	public static void main(String[] args) {

	}

	
	public static boolean isPalindrome(String s) {
		s = s.replaceAll("\\s", "");	//ignores all whitespace; underscore is a char goofball;
		String s1 = "";
		for(int i = s.length()-1; i >= 0; --i) {
			s1 += s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(s1)) {
		return true;
		}else {
			return false;
		}
	}
}
