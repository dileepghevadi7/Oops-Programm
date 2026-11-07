package com.Ashokit;

class Product {
	int id;
	int price;
	String name;
}

public class Driver2 {

	void print(Product p) {
		
		System.out.println(p.id + " " + p.price + " " + p.name);

	}
	public static void main(String[] args) {
		Driver2 s1 = new Driver2();
		
		Product p = new Product();
		p.id =100;
		p.name="Iphone";
		p.price =54000;
		
		 s1.print(p);
		
		
	}

}
