package sample;

/**
 * Assignment 7 Java C0866224
 * 
 * @author Rajwant
 *
 */
public class Employee {
	/**
	 * Instance variables of class
	 */
	private String myName;
	private double mySalary;

	/**
	 * Default constructor for part a
	 */
	public Employee() {
		myName = "";
		mySalary = 45000;
	}

	/**
	 * Parameterized constructor for initializing object with given values
	 */
	public Employee(String myName, double mySalary) {
		this.myName = myName;
		this.mySalary = mySalary;
	}

	public double getSalary() {
		return mySalary;
	}

	public String getName() {
		return myName;
	}

	/**
	 * Pay Cut method for part b
	 * 
	 * @param byPercent
	 */
	public double paycut(double byPercent) {
		double percent = byPercent / 100.0;
		double amountToCut = percent * mySalary;
		return mySalary -= amountToCut;
	}

	public static void main(String[] args) {
		/**
		 * Example with default constructor call.
		 */
		Employee employee = new Employee();
		System.out.println(
				"I am a default construcot with name: " + employee.getName() + " and expected Salary: " + employee.getSalary());

		System.out.println("Employee salary after paycut of 20%: " + employee.paycut(20));
		/**
		 * Example with parameterized constructor call.
		 */
		Employee employee224 = new Employee("Rajwant",100000);
		System.out.println(
				"I am a parameterized construcot with name: " + employee224.getName() + " and expected Salary: " + employee224.getSalary());

		System.out.println("Employee salary after paycut of 20%: " + employee224.paycut(20));
		
	}
}
