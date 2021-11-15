package com.ocaj.exam.chapter2;

public class SwitchStringCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String value = "TwoHundred";
		switch(value){
			case "OneHundred":
				System.out.println("OneHundred Choosen");
				break;
			case "TwoHundred":
				System.out.println("TwoHundred Choosen");
				break;
			case "ThreeHundred":
				System.out.println("ThreeHundred Choosen");
				break;
			default:
				System.out.println("Default");
		}
	}

}
