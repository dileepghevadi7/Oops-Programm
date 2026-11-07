package com.Ashokit;

public class Driver4 {

	public static void main(String[] args) {
		Driver4 q1 = new Driver4();
		Student s1 = q1.demo();
		System.out.println(s1.id + " " + s1.name);
		
		
	}
	Student demo() {
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "Tanaji";
		return s1;
	}
}
class Student{
	int id;
	String name;
	
}