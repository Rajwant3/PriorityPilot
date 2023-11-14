package week2;

public class Testarray {

	public static void main(String args[]) {

//		int a[] = new int[5];
//
//		a[0] = 10;
//
//		a[1] = 20;
//
//		a[2] = 70;
//
//		a[3] = 40;
//
//		a[4] = 50;
//
//		for (int i = 0; i < a.length; i++)
//
//			System.out.println(a[i]);
		question_2();

	}

	public static void question_1() {
		int list[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 0;
		int sum = 0;
		while (i < list.length) {
			System.out.println("While is : " + list[i]);
			sum += list[i];
			i++;
		}
		System.out.println("While Sum is : " + sum);

		sum = 0;
		i = 0;
		do {
			System.out.println("Do while is : " + list[i]);
			sum += list[i];
			i++;
		} while (i < list.length);

		System.out.println("Do while Sum is : " + sum);
		sum = 0;
		for (i = 0; i < list.length; i++) {
			System.out.println("For Loop is : " + list[i]);
			sum += list[i];
		}
		System.out.println("For  loop Sum is : " + sum);

	}

	public static void question_2() {
		int list[] = { 11, 20, 33, 74, 25, 16, 67, 18, 29, 10 };

		int shortestNumber = list[0];
		int highestNumber = list[0];

		for (int i : list) {

			if (i < shortestNumber) {
				shortestNumber = i;
			}
			if (i > highestNumber) {
				highestNumber = i;
			}
		}
		System.out.println("Shortest Number is : " + shortestNumber);
		System.out.println("Highest Number is : " + highestNumber);
	}

}