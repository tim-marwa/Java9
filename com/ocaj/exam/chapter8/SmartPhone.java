package com.ocaj.exam.chapter8;

public class SmartPhone extends Phone{
	public void sendEmail(String message, String address){
		System.out.println("SmartPhone: Sending Email");
		/*Logic to send email message*/
	}
	
	public String retrieveEmail(){
		System.out.println("Smartphone: Retrieving email");
		String messages = new String();
		/*Return a String containing all of the messages*/
		return messages;
	}
	
	public boolean isRinging(){
		System.out.println("SmartPhone: Checking if the phone is ringing");
		boolean ringing = false;
		/*Check for email activity and only continue when there is a none.*/
		/*Check if the phone is ringing and set the ringing variable*/
		return ringing;
	}
}
