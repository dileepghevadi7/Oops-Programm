package com.kodawala.Polymorphism;
//Overloading
class Login {

    public void login(String username, String password) {
        System.out.println("Login using Username and Password");
    }

    public void login(long mobile, int otp) {
        System.out.println("Login using Mobile and OTP");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Login s1 = new Login();

        s1.login("Dileep", "Dileep@123");
        s1.login(9876543210L, 123456);
        
    }
}