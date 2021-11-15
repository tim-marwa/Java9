package com.ocaj.exam.chapter8;

public class GoatBreed implements Describable{
	private String description;
	private String breed;
	
	public GoatBreed(String breed) {
		super();
		this.breed = breed;
		this.description = "A(n) " + breed + "'s Goat.";
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	
	
	

	
}
