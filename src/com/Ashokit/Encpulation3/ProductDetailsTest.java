package com.Ashokit.Encpulation3;

public class ProductDetailsTest {

	private static int id;
	private static String productName;
	private static String productStutus;

	public static void main(String[] args) {
		
		ProductDetails s1 = new ProductDetails();
		
		s1.setId(1213);
		s1.setProductName("Iphone12");
		s1.setProductStutus("Comfrom");
		
		id = s1.getId();
		productName = s1.getProductName();
		productStutus = s1.getProductStutus();
		
		System.out.println(id + " "+productName+ "  "+productStutus);
		
	}

}
