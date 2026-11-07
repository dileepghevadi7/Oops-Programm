package com.kodawala.Polymorphism1;

class Notification{
	public void send() {
		System.out.println("Notification Sending");
	}
}

class EmailNotification extends Notification{
	public void send() {
		System.out.println("EmailNotification Sending");
	}
	
}
class SMSlNotification extends Notification{
	public void send() {
		System.out.println("SMSNotification Sending");
	}
	
}


public class NotificationTest {

	public static void main(String[] args) {
		
		EmailNotification s1 = new EmailNotification();
		s1.send();
		
		SMSlNotification s2 = new SMSlNotification();
		s2.send();
		
		Notification s3 = new Notification();
		s3.send();

	}

}
