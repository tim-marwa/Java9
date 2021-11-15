package com.ocaj.exam.craft_simulator;

import com.ocaj.exam.craft_simulator.SpaceShip.ShipType;

public class SpaceShipSimulator {
	
	public static void main(String[] args){
		// Create SpaceShip object with default ship type
		SpaceShip ship1 = new SpaceShip();
		//Prints the pirate ship is a caravel ship."
		System.out.println(ship1);
		
		// Create SpaceShip object with specified ship type
		SpaceShip ship2 = new SpaceShip (ShipType.FRIGATE);
		//Prints "The pirate ship is a gallon ship."
		System.out.println(ship2);
	}
}