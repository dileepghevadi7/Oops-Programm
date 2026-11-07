package com.kodawala.Inheritance1;

class Bank{
	public void displya() {
		String name = "Dileep";
		int balance = 19350;
		
		System.out.println( "  Customer NAme : " + name + "  Coustemer Balance : " + balance);
	}
}
class BankMmg extends Bank{
	public void toDisplya() {
		String bankName = "SBI";
		int IfscCode = 1234;
		
		System.out.println("  BankMmg BAnk NAme  :" +bankName+  "  Bank IFSC Code  :"+ IfscCode );
	}
}


public class BankDetails {

	public static void main(String[] args) {
		
		BankMmg s1 = new BankMmg();
		s1.displya();
		s1.toDisplya();

	}

}
