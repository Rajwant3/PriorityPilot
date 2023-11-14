package week2;

import java.util.Scanner;

public class Assignment_5 {
	public static void main(String[] args) {
		question_4();
	}

	/**
	 * Check if array contain value of not
	 */
	private static void question_1() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the element you want to check in array");

		int searchValue = scan.nextInt();

		int[] arrayStore = new int[] { 0, 15, 32, 12, 43, 11, 24, 8, 23, 54, 11 };
		boolean valueFound = false;

		for (int i = 0; i < arrayStore.length; i++) {

			if (arrayStore[i] == searchValue) {
				System.out.println("Value present in array at index :  " + i);
				valueFound = true;
			}
		}

		if (!valueFound) {
			System.out.println("Array doesn't contain value : " + searchValue);
		}
		scan.close();
	}

	private static void question_2() {
		int[] arrayStore = new int[] { 1, 15, 32, 12, 43, 11, 24, 8, 23, 54, 11 };
		/**
		 * Assume min and max number is at first place.
		 */
		int minNumber = arrayStore[0];
		int maxNumber = arrayStore[0];
		for (int arrayElement : arrayStore) {

			if (arrayElement < minNumber) {
				minNumber = arrayElement;
			}
			if (arrayElement > maxNumber) {
				maxNumber = arrayElement;
			}
		}

		System.out.println("Min value in array is : " + minNumber);
		System.out.println("Max value in array is: " + maxNumber);
	}

	/**
	 * Copy one array into another
	 */
	private static void question_3() {
		int[] firstArray = new int[] { 1, 15, 32, 12, 43, 11, 24, 8, 23, 54, 11 };
		/**
		 * Initialising second array with same size as first array.
		 */
		int[] secondArray = new int[firstArray.length];

		for (int i = 0; i < firstArray.length; i++) {
			secondArray[i] = firstArray[i];
		}
		/**
		 * Read array elements
		 */
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("First array index : " + i + " valaue: " + firstArray[i]);
			System.out.println("Second array index : " + i + " valaue: " + secondArray[i]);

		}

	}

	/**
	 * Find even and odd in array
	 */
	private static void question_4() {
		int[] arrayStore = new int[] { 1, 15, 32, 12, 43, 11, 24, 8, 23, 54, 11 };

		for (int i = 0; i < arrayStore.length; i++) {
			if (arrayStore[i] % 2 == 0) {
				System.out.println("Array value : " + arrayStore[i] + " at index : " + i + " is an even number");
			}else {
				System.out.println("Array value : " + arrayStore[i] + " at index : " + i + " is an odd number");

			}

		}
	}
}
