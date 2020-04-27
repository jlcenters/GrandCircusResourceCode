package gcdemos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("abc");
		boolean b = m.matches();
		
		boolean card = Pattern.matches("[abc]+", "abbd");
		//boolean foo = Pattern.matches("[abc]{3}", "abc"); //[abc] <--- REGEX a *OR* b *OR* c,{3} CHECKS 3 TIMES; INPUT IS b; FOO == TRUE		
		String visaRegex = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
		String cardNum = "1111-2222-3333-4444";
		
		//System.out.println(matchesCard(cardNum, visaRegex));
			
		
		
		
		String var1 = "goodVar123";
		String var2 = "$goodVar123";
		String var3 = "1badVar123";
		String var4 = "badVar123!";
		
		
		String varRegex = "[a-zA-Z$_]+[0-9]*";
		if (isValidId(var1, varRegex) == true) {
			System.out.println("True.");
		}else {
			System.out.println("False.");
		}
				
}
	
	
	
	public static boolean matchesCard(String card, String regex) {
		return Pattern.matches(regex, card);
	}
	
	
	
	public static boolean isValidId(String name, String regex){
		return Pattern.matches(regex, name);
	}
	
}
