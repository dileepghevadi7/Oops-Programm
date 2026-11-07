package com.kodawala.Polymorphism;


//  Overloading
class OrderService{
	
	void placeOrder(int productId){
		System.out.println("Order placed using Product ID");
		
	}
	
	void placeOrder(int productId, int ProductQty){
		System.out.println("Order placed with quantity");
		
	}
	void placeOrder(int productId, int ProductQty, String Coupon){
		System.out.println("Order placed with coupan code");
		
	}
	
}


public class OrderDemo {

	public static void main(String[] args) {
		OrderService s1 =new OrderService();
		s1.placeOrder(101);
		s1.placeOrder(101, 3);
		s1.placeOrder(101, 3, "SAVE132");

	}

}
