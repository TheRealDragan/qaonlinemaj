package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import basics.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdditionOfPositiveNumbers() {
		int a = 2;
		int b = 3;
		
		int expectedResult = 5;
		
		int actualResult = Calculator.addNumbers(a, b);
		
		assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void testAdditionOfNegativeNumbers() {
		int a = -2;
		int b = -3;
		
		int expectedResult = -5;
		
		int actualResult = Calculator.addNumbers(a, b);
		
		assertEquals(actualResult, expectedResult);
		
	}

}
