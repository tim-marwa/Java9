package com.ocaj.exam.chapter4;

public class Car {
	private boolean running;
	private int topSpeed;
	
	Car(int topSpeed, boolean running){
		this.running = running;
		this.topSpeed = topSpeed;
	}
	
	boolean isRunning(){
		return running;
	}

	public int getTopSpeed(){
		return topSpeed;
	}
}

