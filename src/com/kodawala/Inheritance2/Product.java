package com.kodawala.Inheritance2;

class Product {

    public void showProduct() {
        System.out.println("Product Available");
    }
}

class Mobile extends Product {

    public void warranty() {
        System.out.println("1 Year Warranty");
    }
}
