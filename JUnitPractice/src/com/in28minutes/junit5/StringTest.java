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

}
