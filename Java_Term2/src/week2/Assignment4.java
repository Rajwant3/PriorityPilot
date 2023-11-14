package week2;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		question_2();
	}

	private static void question_1() {
		int arraySize, temp_224;

		// User inputs the array size
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of elements you want in the array: ");

		arraySize = scan.nextInt();

		int[] num = new int[arraySize];

		System.out.println("Now Enter Array Elements:");

		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter Array Element for  index:" + i);
			num[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (num[i] > num[j]) {
					temp_224 = num[i];
					num[i] = num[j];
					num[j] = temp_224;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");

		for (int i = 0; i < arraySize - 1; i++) {
			System.out.print(num[i] + ", ");
		}

		System.out.print(num[arraySize - 1]);
	}

	private static void question_2() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of your fibonacci series.. ");

		int fibSize = scan.nextInt();
		scan.close();
		int fibnumber = 0;
		int secondFib = 1;
		int tempHolder;
		/**
		 * Temp variable to hold the sum.
		 */
		int sumSeries=0;
		for (int i = 0; i < fibSize; i++) {
			System.out.print(fibnumber+" ");
			/**
			 * Add sum
			 */
			sumSeries+=fibnumber;
			
			tempHolder = fibnumber + secondFib;
			fibnumber=secondFib;
			secondFib=tempHolder;
			
		}
		System.out.println("\nSeries sum is  : "+sumSeries);
	}
}
