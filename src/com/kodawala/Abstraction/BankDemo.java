package com.kodawala.Abstraction;

public class BankDemo {

	public static void main(String[] args) {
		
		Bank b; // reference variable  // obj creating is wrong
		
		
	 b = new AxisBank(); // storing impl obj into reference variable 
	 b.chechBalance();
	 b.moneyTranfer();  // Axis bank Method will be	 called
	 
	 b= new HDFCBank();
	 b.chechBalance();
	 b.moneyTranfer();
	 

	}

}
