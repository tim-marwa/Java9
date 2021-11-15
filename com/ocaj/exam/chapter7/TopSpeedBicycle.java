package com.ocaj.exam.chapter7;

public class TopSpeedBicycle extends Bicycle{
	private float gearRatio = 2f;
	private float wheelRPM;
	
	public void setGearRatio(float gearRatio){
		this.gearRatio = gearRatio;
	}
	
	public void pedalRPM(float pedalRPM){
		this.wheelRPM = pedalRPM * gearRatio;
	}
	
	public float getWheelRPM(){
		return this.wheelRPM;
	}
}
