package com.Ashokit.Encpulation;

public class Test {

	public static void main(String[] args) {
		Account s1 = new Account();
		 s1.setAccNum(12345678);
		 s1.setName("Dileep");
		 
		 long accNum = s1.getAccNum();
		 String name = s1.getName();		 
		 System.out.println(accNum + "----"+ name);

	}

}
