package com.ocaj.exam.chapter4;

public class CarCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car fastCar = new Car(200,true);
		Car slowCar = new Car(100,true);

		Car bigCar = new Car(125,true);
		boolean running = bigCar.isRunning();
		
		Car smallCar;
		smallCar = bigCar;
		
		running = smallCar.isRunning();
		
		//Car oldCar;
		//running = oldCar.isRunning();
		
		Car yourCar = new Car(230,true);
		System.out.println(yourCar.isRunning());
		System.out.println(yourCar.getTopSpeed());
		
		
	}

}
