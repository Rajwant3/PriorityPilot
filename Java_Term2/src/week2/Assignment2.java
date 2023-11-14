package week2;

import java.util.Random;

public class Assignment2 {
	public static void main(String[] args) {

//		question_1();
		question_2();
	}

	public static void question_1() {
		int[] perfectSQuares = new int[10];

		int perfectSquareSum = 0;

		for (int i = 0; i < 10; i++) {
			perfectSQuares[i] = (i + 1) * (i + 1);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(perfectSQuares[i] + " ");
			perfectSquareSum += perfectSQuares[i];
		}

		System.out.println("\nPerfect Square Sum is : " + perfectSquareSum);
	}

	public static void question_2() {
		int[] randomNumbers = new int[8];

		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			randomNumbers[i] = random.nextInt(1, 51);
		}

		int shortestValue = randomNumbers[0];
		int highestValue = randomNumbers[0];

		for (int i = 0; i < 8; i++) {
			System.out.print(randomNumbers[i] + " ");
			if (randomNumbers[i] < shortestValue) {
				shortestValue = randomNumbers[i];
			}
			if (randomNumbers[i] > highestValue) {
				highestValue = randomNumbers[i];
			}
		}

		System.out.println("\nShortest value is : " + shortestValue);
		System.out.println("Highest value is : " + highestValue);

	}

	public static void question_3() {
		int list[] = { 11, 20, 33, 74, 25, 16, 67, 18, 29, 10 };
		int evenArray[] = new int[(list.length / 2)];
		int oddArray[] = new int[(list.length / 2)];


	}
}
