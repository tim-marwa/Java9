package com.ocaj.exam.chapter8;

public class GoatShelter implements Describable{

	private String description;
	private int height;
	private int width;
	private int length;
	
	public GoatShelter(int height, int width, int length){
		this.height = height;
		this.width = width;
		this.length = length;
		this.description = "A goat shelter that is " + height + " high, " + length + " long and " + width + " wide";
	}
	
	@Override
	public String getDescription() {
		return description;
	}

}
