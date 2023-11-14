package week2;

import java.util.Scanner;

public class Week5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//
//		int sum = 0;
//		int evenCount = 0;
//		int greaterEven = 1;
//		int shorterEven = 1;
//		for (int i = 0; i < 8; i++) {
//			System.out.println("Enter any number ");
//			int userInput = sc.nextInt();
//
//			if (userInput % 2 == 0) {
//				System.out.println("Even number found : " + userInput);
//				sum = sum + userInput;
//				evenCount++;
//				if (userInput > greaterEven) {
//					greaterEven = userInput;
//				}
//				if (userInput < shorterEven) {
//					shorterEven = userInput;
//				}
//			}
//			// user[i] = userInput;
//		}
//		System.out.println("Total Even sum is : " + sum);
//		System.out.println("Total Even count is : " + evenCount);
//		System.out.println("Greatest even is  : " + greaterEven);
//		System.out.println("Shortest even is  : " + shorterEven);
//
//		int oddSum = 0;
//		int oddCount = 0;
//		int greaterOdd = 1;
//		int shorterOdd = 1;
//		for (int i = 0; i < 8; i++) {
//			System.out.println("Enter any number ");
//			int userInput = sc.nextInt();
//
//			if (userInput % 2 != 0) {
//				System.out.println("Odd number found : " + userInput);
//				oddSum = oddSum + userInput;
//				oddCount++;
//				if (userInput > greaterOdd) {
//					greaterOdd = userInput;
//				}
//				if (userInput < shorterOdd) {
//					shorterOdd = userInput;
//				}
//			}
//			// user[i] = userInput;
//		}
//		System.out.println("Total Odd sum is : " + oddSum);
//		System.out.println("Total Odd count is : " + oddCount);
//		System.out.println("Greater odd is  : " + greaterOdd);
//		System.out.println("Shortest odd is  : " + shorterOdd);
//		sc.close();
//
//		if (sum > oddSum) {
//			System.out.println("Even sum is greater");
//		} else if (sum == oddSum) {
//			System.out.println("Both eqqual");
//		} else {
//			System.out.println("Odd sum is greater");
//		}

		for (int i = 2; i <= 100; i++) {
			boolean prime = false;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					prime = false;
					break;
				} else {
					prime = true;
				}
			}
			if (prime)
				System.out.println("Prime number found: " + i);
		}

		System.out.println("Enter any number for factorial ");
		int fact = sc.nextInt();
		System.out.println("Number factorial is : " + factorial(fact));

		System.out.println("Enter any number for table ");
		int number = sc.nextInt();
		System.out.println("Printing a table of " + number);
		printTable(number);
		fibonacciseries();
//		for (int i = 0; i < user.length; i++) {
//			if (user[i] % 2 == 0) {
//				System.out.println("Even number found : " + user[i]);
//				sum = sum + user[i];
//			}
//		}
	}

	private static int factorial(int number) {
		if (number == 1)
			return 1;
		return number * factorial(number - 1);
	}

	private static void printTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println( number + " * " + i + " = " + number * i);
		}
	}

	private static void fibonacciseries() {
		int fibnumber = 1;
		int secondFib = 1;
		for (int i = 1; i < 5; i++) {
			System.out.println(fibnumber);
			secondFib=fibnumber;
			fibnumber = fibnumber + secondFib;
		}
	}
}
