package junit.samples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class ConcatTest {
	Calculator calculator = new Calculator();

	@BeforeClass
	public static void beforeCalculator() {
		System.out.println("Before Class");
	}

	@Before
	public void beforeTest() {
		System.out.println("Before  Each test");
	}

	@Test
	public void testAddNumber() {
		System.out.println("Executing Addition Test.");
		assertEquals(9, calculator.add(5, 4));
	}

	@Test
	public void testSubtractNumber() {
		System.out.println("Executing Subtract Test.");

		assertEquals(2, calculator.subtract(5, 3));
	}

	@Test
	public void testDivideNumber() {
		System.out.println("Executing Divide Test.");

		assertEquals(2, calculator.divide(10, 5));
	}

	@Test
	public void testMultiplyNumber() {
		System.out.println("Executing Multiply Test.");

		assertEquals(20, calculator.multiply(5, 4));
	}

	@Test
	public void testConcatName() {

		System.out.println("Executing concat  name.");

		assertEquals("RK Dhillon", calculator.concatName("RK", "Dhillon"));
	}

	@Test
	public void testCountChar() {
		System.out.println("Executing count char.");

		assertEquals(2, calculator.countCharacter("Rajwant", 'a'));
		assertEquals(3, calculator.countCharacter("Java Beans", 'a'));

	}

	/**
	 * Boolean Asserts
	 */
	@Test
	public void testIsEven() {

		System.out.println("Executing Even Test.");

		assertEquals(true, calculator.isEven(10));
		/**
		 * Second way
		 */

		assertTrue(calculator.isEven(10));

	}

	@Test
	public void testIsOdd() {
		System.out.println("Executing Odd Test.");

		assertEquals(true, calculator.isEven(10));
		/**
		 * Second way
		 */

		assertFalse(calculator.isEven(11));

	}

	/**
	 * 
	 * Array Asserts
	 */

	@Test
	public void testIncrementalArray() {
		System.out.println("Executing Arrays Test.");

		int expected[] = { 2, 3, 4 };
		int array[] = { 1, 2, 3 };
		int actual[] = calculator.incrementArray(array);
		assertArrayEquals(expected, actual);
	}

	/**
	 * Exception Asserts
	 */
	@Test
	@Ignore
	public void testExceptions() {
		System.out.println("Executing Exceptions Test.");

		assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
			public void run() throws Throwable {
				calculator.divide(10, 0);
			}
		});
	}

	@AfterClass
	public static void afterCalculator() {
		System.out.println("After Calculator");
	}

	@After
	public  void afterTests() {
		System.out.println("After Each Test.");
	}

	
//	public void  ignoreTest
}
