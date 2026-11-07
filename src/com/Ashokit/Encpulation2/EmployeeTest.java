package com.Ashokit.Encpulation2;

class Employee {
	private String name;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {

		if(salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Invalid Salary");
		}
	}
	public void display() {
		System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee m1 = new Employee();
		m1.setName("Dileep");
		m1.setSalary(123456);
		m1.display();

	}

}
