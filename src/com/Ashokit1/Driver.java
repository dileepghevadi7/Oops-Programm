package com.Ashokit1;

class Driver {
	public static void main(String[] args) {

		Driver d = new Driver();
		Player p = d.m1(18);
		System.out.println(p.id + " " + p.name + " " + p.age);

	}

	Player m1(int id) {
		Player p = new Player();

		if (id == 7) {
			p.id = 7;
			p.age = 40;
			p.name = "Dhoni";

		} else if (id == 18) {
			p.id = 18;
			p.age = 30;
			p.name = "kholi";
		} else if (id == 45) {
			p.id = 45;
			p.age = 35;
			p.name = "Rohit";

		}
		return p;
	}
}

class Player {

	int id;
	String name;
	int age;
}