package com.ocaj.exam.chapter4;

public class EnumerationExample {
	private enum TypeOfShoe {RUNNING, BASKETBALL, CROSS_TRAINING};
	
	TypeOfShoe shoe;	
	void createRunningShoes(){
		shoe = TypeOfShoe.RUNNING;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {



	}

}
