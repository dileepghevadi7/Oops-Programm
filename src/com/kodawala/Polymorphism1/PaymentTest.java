package com.kodawala.Polymorphism1;

class Payment{
	public void pay() {
		System.out.println("Payment Sending");
	}
}
class UPIPayment{
	public void pay() {
		System.out.println("UPIPayment through  Sending");
	}
}
class CardPayment{
	public void pay() {
		System.out.println("CardPayment through  Sending");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment p1 = new Payment();
		p1.pay();
		
		UPIPayment p2 = new UPIPayment();
		p2.pay();
		
		CardPayment p3 = new CardPayment();
		p3.pay();
		
	}

}
