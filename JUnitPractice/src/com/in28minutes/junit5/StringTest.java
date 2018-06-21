package com.in28minutes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		int actuallength = "ABCD".length();
		int expectedlength = 4;
		//Always expected vs actual
		assertEquals(expectedlength, actuallength);
	}
	
	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD", result);
		assertNotNull(result);
	}
	
	@Test
	void contains() {
		String str = "abcdefgh";
		boolean result = str.contains("ijk");
		// assertEquals(false, result);
		assertFalse(result);
		//assertTrue
		assertFalse("abcdefg".contains("ijk"));
	}
	
	@Test
	void split() {
		String str = "abc def ghi";
		String actualResult[] = str.split(" ");
		String[] expectedResult = new String[] {"abc", "def", "ghi"};
		assertArrayEquals(actualResult, expectedResult);
	}
	
	

}
