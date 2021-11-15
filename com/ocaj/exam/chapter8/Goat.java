package com.ocaj.exam.chapter8;


public class Goat implements Describable{

	private String description;
	
	public Goat(String name){
		description = "A goat named " + name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
}
