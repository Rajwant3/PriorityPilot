package junit.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {

	int salary;
	String empName;
	int empId;

	public Employee(int empId, String empName, int salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", empName=" + empName + ", empId=" + empId + "]";
	}
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Sonia", 2000));
		employees.add(new Employee(5, "Somya", 3000));
		employees.add(new Employee(2, "Rohan", 1500));
		employees.add(new Employee(4, "Nikita", 20000));
		System.out.println("Collection before sorting..");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		Collections.sort(employees, new EmployeeComparator());
		System.out.println("After  sorting with EmployeeComparator..");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		Collections.sort(employees);
		System.out.println("After  sorting Comparable with empID..");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}

class EmployeeComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if (o1.salary < o2.salary) {
			return -1;
		} else {
			return 1;
		}
	}

}