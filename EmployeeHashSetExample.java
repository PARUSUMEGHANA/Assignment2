package overidepract;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;

	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void displayDetails() {
		System.out.println("Employee ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
		System.out.println("------------------------");
	}
}

public class EmployeeHashSetExample {
	public static void main(String[] args) {
		Set<Employee> employeeSet = new HashSet<>();

		// Adding employees to the HashSet
		employeeSet.add(new Employee(1, "John", 50000, "HR"));
		employeeSet.add(new Employee(2, "Jane", 60000, "IT"));
		employeeSet.add(new Employee(3, "Bob", 55000, "Finance"));

		// Displaying details of employees
		for (Employee employee : employeeSet) {
			employee.displayDetails();
		}
	}
}
