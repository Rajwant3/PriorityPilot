package junit.samples;

/**
 * A Basic Calculator class for junit testing
 * 
 * @author Rajwant
 *
 */
public class Calculator {

	/**
	 * Integer results Examples
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int divide(int a, int b) {
		
		if(a==0||b==0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}

	/**
	 * String Results Examples
	 * 
	 * @param fName
	 * @param lName
	 * @return
	 */
	public String concatName(String fName, String lName) {
		return fName + " " + lName;
	}

	public int countCharacter(String string, char ch) {
		char[] chArray = string.toCharArray();
		int count = 0;
		for (char c : chArray) {

			if (c == ch) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Boolean Results Examples
	 */

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	public int[] incrementArray(int[] array) {

		int[] output = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			output[i] = array[i] + 1;
		}
		return output;
	}
}
