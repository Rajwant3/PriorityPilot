package week2;

import java.util.Scanner;

/**
 * Submitted by: Rajwant Kaur Student ID: C0866224
 * 
 * @author Rajwant
 *
 */
public class Assignment1 {
	static int y;
	static int step ;
	static int size ;
	static int total ;
	static int change=4 ;
	static int hours=6 ;

	public static void main(String[] args) {
//		String employeeFullName;
//		int employeeId;
//		Double employeeSalary;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Employee's Name: ");
//		employeeFullName = scanner.nextLine();
//		System.out.println("Enter Employee's ID: ");
//		employeeId = scanner.nextInt();
//		System.out.println("Enter Employee's Salary: ");
//		employeeSalary = scanner.nextDouble();
//		System.out.println("Employees' Full Name is " + employeeFullName + " ,Employee's ID is: " + employeeId
//				+ " and Employee's monthly salary is:$" + employeeSalary);
//		scanner.close();

//		 step = 5 + step;
//		 size = 3 - size;
//		 total = 2 * total;
//		 change = 10 / change;
//		 hours = 24 % hours;
//		System.out.println(step);
//		System.out.println(size);
//
//		System.out.println(total);
//
//		System.out.println(change);
//
//		System.out.println(hours);
//	int	i = 0;
//		while (i < 3)
//		System.out.println("i = " + i);
//		 i = i 1;
//		String word="Rajwant";
//		int i=0;
//		while(i<=word.length()-1) { 
//			System.out.println(word.charAt(i));
//			i++;
//		}

		// pattern();
		// question5();
		
		for(int i=1;i<=20;i++) {
			long fact=1;
			for(int j=i;j>1;j--) {
				 fact=fact*j;
				 
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}

	private static void pattern() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void question3() {
		System.out.println("*****");
		System.out.println(" *** ");
		System.out.println("  *  ");
		System.out.println(" *** ");
		System.out.println("*****");

	}

	public static void question4() {
		double taxPercentage = 13.00;
		double salesAmount;
		double taxAmount;
		System.out.println("Enter sales amount: ");
		Scanner scanner = new Scanner(System.in);
		salesAmount = scanner.nextDouble();
		scanner.close();
		taxAmount = salesAmount * taxPercentage / 100;

		System.out.println("Sales tax amount is $" + taxAmount);

	}

	public static void question5() {
		double mbRate;
		int mbTraffic;
		double billAmount;

		System.out.println("Please enter Internet monthly  traffic in megabytes : ");
		Scanner scanner = new Scanner(System.in);
		mbTraffic = scanner.nextInt();
		scanner.close();

		if (mbTraffic >= 5000) {
			mbRate = 0.1;
		} else if (mbTraffic <= 4999 && mbTraffic >= 2000) {
			mbRate = 0.015;
		} else if (mbTraffic <= 1999 && mbTraffic >= 1000) {
			mbRate = 0.02;
		} else {
			mbRate = 0.025;
		}
		billAmount = mbTraffic * mbRate;
		System.out.println("Monthly Bill for  " + mbTraffic + "MB traffic  is $" + billAmount);
	}

	/**
	 * Submitted by: Rajwant Kaur Student ID: C0866224
	 * 
	 * @author Rajwant
	 *
	 */
	public static void question2() {
		String firstName = "Rajwant";
		String lastName = "Kaur";
		char fInitial = firstName.charAt(0);
		char lastLetter = lastName.charAt(lastName.length() - 1);

		System.out.println("My First Name Is " + firstName + ", my last name is " + lastName
				+ ", First character in my First Name is '" + fInitial + "' ,Last character in my Last name is '"
				+ lastLetter + "'");
	}

}
