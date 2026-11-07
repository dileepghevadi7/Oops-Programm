package com.kodawala.Abstraction;

public class HDFCBank implements Bank {

	@Override
	public void moneyTranfer() {
		System.out.println("HDFCBank.moneyTranfer()");
		
	}

	@Override
	public void chechBalance() {
		System.out.println("HDFCBank.chechBalance()");
		
	}

}
