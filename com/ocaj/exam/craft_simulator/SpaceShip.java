package com.ocaj.exam.craft_simulator;

public class SpaceShip extends Ship implements Dockable {

	// Data Members
	public enum ShipType {
		FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
	}
	
	ShipType shipType = ShipType.ESCORT;
	
	// Constructors
	public SpaceShip(){
		System.out.println("\nSpaceShip created with default ship type.");
	}
	
	public SpaceShip(ShipType shipType){
		System.out.println("\nSpaceShip created with specified shiptype.");
		this.shipType = shipType;
	}
	
	@Override
	public void dockShip() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString(){
		String shipTypeRefined = this.shipType.name().toLowerCase();
		return "The pirate ship is a " + shipTypeRefined + " ship.";
	}
	
}