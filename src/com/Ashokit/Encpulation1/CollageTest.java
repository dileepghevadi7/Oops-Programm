package com.Ashokit.Encpulation1;

public class CollageTest {

	public static void main(String[] args) {
		
		Collage s1 = new Collage();
			
		s1.setName("Dileep");
		s1.setId(123);
		s1.setAge(25);
		
		String name = s1.getName();
		int id = s1.getId();
		int age = s1.getAge();
		
		System.out.println(" Name:"+name+" Collage id:"+id+" age: "+age);
		
		}

}
