/**
 * 
 */
package org.cuatrovientos.simplemaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author julen
 *
 */
public class CalculatorTest {

	private Calculator calculator;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		int expected = 42;
		int target = calculator.add(40, 2);
		assertEquals("Testing add", target, expected);
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#sub(int, int)}.
	 */
	@Test
	public void testSub() {
		int expected = 38;
		int target = calculator.sub(40, 2);
		assertEquals("Testing sub", target, expected);
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#mul(int, int)}.
	 */
	@Test
	public void testMul() {
		int expected = 80;
		int target = calculator.mul(40, 2);
		assertEquals("Testing mul", target, expected);
	}

	/**
	 * Test method for {@link org.cuatrovientos.simplemaven.Calculator#div(int, int)}.
	 */
	@Test
	public void testDiv() {
		int expected = 20;
		int target = calculator.div(40, 2);
		assertEquals("Testing div", target, expected);
	}

}
