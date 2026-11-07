package com.Ashokit;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println(" this is the main method");
		
		Driver s1 = new Driver();
		s1.Student();

		Driver.Collage();

	}
	void Student(){
		System.out.println(" this is the instance method");
	}
	static void Collage() {
		System.out.println("This is the static method");
	}

} 
