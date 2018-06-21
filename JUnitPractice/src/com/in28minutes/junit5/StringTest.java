package com.in28minutes.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {

	//Good method for establishing connection to a database
	@BeforeAll 
	static void beforeAll() {
		System.out.println("initialize connection to database");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Close connection to databse");
	}
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}
	
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Clean up Test Data for " + info.getDisplayName());
	}
	
	@Test
	void test() {
		int actuallength = "ABCD".length();
		int expectedlength = 4;
		//Always expected vs actual
		assertEquals(expectedlength, actuallength);
	}
	
	@Test
	@DisplayName("When length is null, throw an exception")
	void string_exception() {
		String str = null;
		//We want to expect a null pointer exception
		assertThrows(NullPointerException.class,
				// lambda exception
				() -> {
					str.length();
				}
				
				);
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
