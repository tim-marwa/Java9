package com.ocaj.exam.chapter8;

public class PhoneTesterExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new PhoneTesterExecutor();
	}

	public PhoneTesterExecutor(){
		Phone landLinePhone = new Phone();
		SmartPhone smartPhone = new SmartPhone();
		System.out.println("About to test a land line phone as a phone...");
		testPhone(landLinePhone);
		System.out.println("\nAbout to test a smart phone as a phone...");
		testPhone(smartPhone);
		System.out.println("\nAbout to test a smartphone as a smart phone...");
		testSmartPhone(smartPhone);
	}
	
	private void testPhone(Phone phone){
		phone.callNumber(5559869447L);
		phone.isRinging();
	}
	
	private void testSmartPhone(SmartPhone phone){
		phone.sendEmail("Hi", "edward@ocajexam.com");
		phone.retrieveEmail();
	}
	
}
