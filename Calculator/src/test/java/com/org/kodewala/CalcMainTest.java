package com.org.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcMainTest {
	static CalcMain calcMain;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("CalcMainTest.before()");
		calcMain = new CalcMain();
	}

	@BeforeEach
	public void setupBeforeEachTest() {
		System.out.println("setupBeforeEachTest....");
	}

	@Test
	public void testAddNumber() // +ve test case
	{

		int expected = 17; // You are expecting
		int actual = calcMain.addNumber(5, 12); // Method return

		assertEquals(expected, actual);
	}

	@Test
	public void testAddNumberFirstZero() {

		int expected = 33; // You are expecting
		int actual = calcMain.addNumber(0, 33); // Method return

		assertEquals(expected, actual);
	}

	@Test
	public void testAddNumberSEcZero() {
		CalcMain calcMain = new CalcMain();
		int expected = 40; // You are expecting
		int actual = calcMain.addNumber(40, 0); // Method return

		assertEquals(expected, actual);
	}

	@Test
	public void testAddNumberBothZero() {

		int expected = 0; // You are expecting
		int actual = calcMain.addNumber(0, 0); // Method return

		assertEquals(expected, actual);
	}

	@Test
	public void testAddNumberNegNumbers() {

		int expected = 2; // You are expecting
		int actual = calcMain.addNumber(-10, 12); // Method return

		assertEquals(expected, actual);
	}
}
