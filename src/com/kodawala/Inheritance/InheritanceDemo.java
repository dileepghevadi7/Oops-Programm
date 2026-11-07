package com.kodawala.Inheritance;

class Perent{
	
	void m1() {
		System.out.println("perent class be running");
	}
}

class Child extends Perent {
	void m2() {
		System.out.println("Child.m2()... class running");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Child s1 = new Child();
		s1.m1();
		s1.m2();
		int hashCode = s1.hashCode();
		System.out.println("InheritanceDemo.main()" +hashCode );
		
	}

}
