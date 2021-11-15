package com.ocaj.exam.chapter4;

public class ThermostatExecuter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thermostat houseHeater = new Thermostat();
		houseHeater.setTemperatureTrigger(68);
		System.out.println("houseHeater.getTemperatureTrigger():" + houseHeater.getTemperatureTrigger());

		float x = 0.0f;
		int y = 5;
		long z=0;
		x=y + 3.3f;
		x =x + z;
		System.out.println("x:" + x);
		
	}

}
