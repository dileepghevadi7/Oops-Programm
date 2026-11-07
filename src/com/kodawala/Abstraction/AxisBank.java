package com.kodawala.Abstraction;

public class AxisBank implements Bank {

	@Override
	public void moneyTranfer() {
		System.out.println("AxisBank.moneyTranfer()");
	}

	@Override
	public void chechBalance() {
		System.out.println("AxisBank.chechBalance()");
	}

}
