package com.ocaj.exam.chapter4;

import java.text.NumberFormat;

public class Primitives {
	public static void main(String[] args) {

		int gallons = 13;
		int totalGallons = 0;
		totalGallons += gallons;
		boolean hasTurboCharger = true;
		hasTurboCharger = false;
		System.out.println("gallons:" + gallons);
		System.out.println("totalGallons:" + totalGallons);
		System.out.println("hasTurboCharger:" + hasTurboCharger);
		
		System.out.printf("a:%d\n", (Integer.valueOf('a').intValue()));
	
		char c1 = 'S';
		char c2 = '\u0068';
		char c3 = 0x0065;
		char c4 = 0154;
		char c5 = (char) 131170;
		char c6 = (char) 131193;
		char c7 = '\'';
		char c8 = 's';
		char [] autoDesignerArray = {c1,c2,c3,c4,c5,c6,c7,c8};
		
		System.out.print(autoDesignerArray);
		System.out.println(" Mustang");
		
		byte passengers = 4;
		byte doors = (byte) 2;
		
		System.out.println("passengers:" + passengers + " doors:" + doors);
		
		short unladenWeightInLbs = 2350;
		short capacityInCu = (short)427;
		
		System.out.println("unladenWeightInLbs:" + unladenWeightInLbs + " " + " capacityInCu:" + capacityInCu);
		
		int auctionPrice = 7800000;
		
		char cylinders = '\u0008';
		int cyl = cylinders;
		
		byte wheelbase = 90;
		int wbase = wheelbase;
		
		short horsepower = 250;
		int hPower = horsepower;
		
		int length = (int) 151.5F;
		int powerWeightRatio = (int) 405.1D;
		
		System.out.println("auctionPrice:" + auctionPrice);
		System.out.println("cyl:" + cyl);
		System.out.println("wbase:" + wbase);
		System.out.println("hPower:" + hPower);
		System.out.println("length:" + length);
		System.out.println("powerWeightRatio:" + powerWeightRatio);
		
		long mustangBingResults = 146000000L;
		long mustangGoogleResults = 405000001;
		
		long mustangAmazonBookResults = (long) 5774;
		long mustangAmazonManualResults = 2380;
		
		System.out.println("mustangBingResults:" + mustangBingResults);
		System.out.println("mustangGoogleResults:" + mustangGoogleResults);
		System.out.println("mustangAmazonBookResults:" + mustangAmazonBookResults);
		System.out.println("mustangAmazonManualResults:" + mustangAmazonManualResults);
		
		float currentBid = 80100.99F;
		float openBid = 20000.00f;
		float myBid = 3600;
		
		System.out.println("currentBid:" + currentBid);
		System.out.println("openBid:" + openBid);
		System.out.println("myBid:" + myBid);
				
		double leafSpringCobraEngine = 4.7D;
		double chrysler331Engine = 5.4d;
		double ford427Engine = (double)7;
		double ford428Engine = 7.01;
		double fordV8Engine = 5;
		
		System.out.println("leafSpringCobraEngine:" + leafSpringCobraEngine);
		System.out.println("chrysler331Engine:" + chrysler331Engine);
		System.out.println("ford427Engine:" + ford427Engine);
		System.out.println("ford428Engine:" + ford428Engine);
		System.out.println("fordV8Engine:" + fordV8Engine);
		
		float a = 19801216.0f;
		float b = 20120307.12f;
		float c = a + b;
		
		String d = NumberFormat.getCurrencyInstance().format(c);
		
		System.out.println("d:" + d);
		System.out.println("c:" + c);
		
		double x  = 19801216.0;
		double y = 20120307.12;
		double z = x + y;
		
		String s = NumberFormat.getCurrencyInstance().format(z);
		System.out.println("s:" + s);
		System.out.println("z:" + z);
		
		Integer valueA = new Integer(5);
		int num = valueA.intValue();
		Integer valueB = num;
		
		System.out.printf( "%d %d\n", valueB, num);
		
		
	}

}
