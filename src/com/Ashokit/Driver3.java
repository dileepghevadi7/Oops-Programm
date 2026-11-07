package com.Ashokit;

public class Driver3 {

	public static void main(String[] args) {
		Driver3 d = new Driver3();
		Collage p = d.s1(); 
		System.out.println(p.id + " " + p.name);
		
	}
	
	Collage s1(){
		Collage p = new Collage();
		p.id = 416;
		p.name = "Dileep";
		return p;
	}
}

class Collage{
	int id;
	String name;
}