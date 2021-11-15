package com.ocaj.exam.chapter8;

public class GoatTesterInterfaceExecutor {

	public GoatTesterInterfaceExecutor(){
		Goat goat = new Goat("Bob");
		GoatShelter goatShelter = new GoatShelter(4, 4, 6);
		GoatBreed goatBreed = new GoatBreed("Alpine");
		System.out.println(description(goat));
		System.out.println(description(goatShelter));
		System.out.println(description(goatBreed));
	}
	
	private String description(Describable d){
		return d.getDescription();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new GoatTesterInterfaceExecutor();
	}

}
