package sample;

import java.util.Scanner;

/**
 * Assignment 8
 * 
 * @author Rajwant
 *
 */
public class Holiday {
	private String name;
	private int day;
	private String month;

	/**
	 * Constructor to initialize objects
	 * 
	 * @param name
	 * @param day
	 * @param month
	 */
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}

	/**
	 * Check if holiday month is same or not
	 * 
	 * @param otherHoliday
	 * @return
	 */
	public boolean inSameMonth(Holiday otherHoliday) {
		return this.month.equals(otherHoliday.month);
	}

	/**
	 * Get average date
	 * 
	 * @param holidays
	 * @return
	 */
	public double avgDate(Holiday[] holidays) {
		int sum = 0;
		for (Holiday holiday : holidays) {
			sum += holiday.day;
		}
		return (double) sum / holidays.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create Holiday instance with name "Independence Day" with day 4 and month
		// "July"
		Holiday independenceDay = new Holiday("Independence Day", 4, "July");
		// create array of Holiday instances
		Holiday[] holidays = new Holiday[3];
		// take input from user for each holiday and add it to the array
		for (int i = 0; i < holidays.length; i++) {
			System.out.println("Enter holiday name:");
			String name = sc.nextLine();
			System.out.println("Enter holiday day:");
			int day = sc.nextInt();
			sc.nextLine(); // consume the newline character
			System.out.println("Enter holiday month:");
			String month = sc.nextLine();
			holidays[i] = new Holiday(name, day, month);
		}
		// print whether Independence Day is in the same month as each holiday in the
		// array
		for (Holiday holiday : holidays) {
			System.out.println(holiday.name + " is in the same month as Independence Day: "
					+ independenceDay.inSameMonth(holiday));
		}
		// print the average day of all holidays in the array
		System.out.println("Average day of all holidays: " + independenceDay.avgDate(holidays));
		// close scanner
		sc.close();
	}
}