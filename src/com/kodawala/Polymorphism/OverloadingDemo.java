package com.kodawala.Polymorphism;


class Collage{
	public void student(String name, int id) {
		System.out.println(" Collage student name & id");
	}
	public void student(String collageName, String classRoom) {
		System.out.println(" Collage name & Class Room Number");
	}
	
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Collage a1 = new Collage();
		a1.student("Tanaji", 420);
		a1.student("KLS", "D12");
		
		
	}

}
