package gcdemos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FixMeAppTests {

	@Test
	void findsSum() {
		int[] arr = {2,2,2};
		assertEquals(6,FixMeApp.findSum(arr));
	}
	
	@Test
	void findsSumOfOdds() {
		int[] arr = {3,3,3};
		assertEquals(9,FixMeApp.findSum(arr));
	}
	
	@Test
	void findsSumDifferentNum() {
		int[] arr = {1,5,6};
		assertEquals(12,FixMeApp.findSum(arr));
	}
	
	@Test
	void matchingString() {		//can run single test
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("hi");
		ls.add("goodbye");
		assertEquals(1,FixMeApp.countMatches(ls, "hello"));
	}
	
	@Test
	void checkCase() {
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("hi");
		ls.add("goodbye");
		assertEquals(0,FixMeApp.countMatches(ls,"Hello"));
	}
	
	
	@Test
	void returns0() {
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("hi");
		ls.add("goodbye");
		assertEquals(0,FixMeApp.countMatches(ls,"how are you"));
	}
	
	
	@Test
	void addsTwice() {
		
		assertEquals("hellohello",FixMeApp.repeat("hello",2));
	}
	
	@Test
	void includesCaps() {
		
		assertEquals("HelloHello",FixMeApp.repeat("Hello",2));
	}
	
	@Test
	void addsFour() {
		
		assertEquals("hellohellohellohello",FixMeApp.repeat("hello",4));
	}
	
	
	@Test
	void reverses() {
		
		assertEquals("olleh",FixMeApp.reverse("hello"));
	}
}
