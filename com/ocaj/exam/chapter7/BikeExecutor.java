package com.ocaj.exam.chapter7;

public class BikeExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.bark();
		dog.eat();
		
		System.out.println("Starting...");
		System.out.println("Creating a bicycle...");
		Bicycle b = new Bicycle();
		b.setDegreeOfTurn(0);
		b.pedalRPM(50);
		System.out.println("Turning: " + b.getDegreeOfTurn());
		System.out.println("Wheel RPM: " + b.getWheelRPM());
		System.out.println("Creating a 10 speed bicycle...");
		TopSpeedBicycle tb = new TopSpeedBicycle();
		tb.setGearRatio(3f);
		tb.setDegreeOfTurn(10);
		tb.pedalRPM(40);
		System.out.println("Turning: " + tb.getDegreeOfTurn());
		System.out.println("Wheel RPM:" + tb.getWheelRPM());
		
	}

}
