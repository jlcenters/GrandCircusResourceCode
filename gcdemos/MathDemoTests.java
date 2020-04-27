package gcdemos;

import static org.junit.jupiter.api.Assertions.*;	//from junit.org

import org.junit.jupiter.api.Test;

class MathDemoTests {

	@Test
	void testAdd1And2() {
		int actual = MathDemo.add(1, 2);
		int expected = 3;
		assertEquals(expected, actual);
	}

	
	
	@Test
	void testAddNegative1And10() {
		int actual = MathDemo.add(-1, 10);
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	
	
	@Test
	void testAdd0And0() {
		int actual = MathDemo.add(0, 0);
		int expected = 0;
		assertEquals(expected, actual);
	}
}
