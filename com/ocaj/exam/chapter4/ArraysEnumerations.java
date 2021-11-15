package com.ocaj.exam.chapter4;

public class ArraysEnumerations {

	private enum Suit{ CLUBS, DIAMONDS, HEARTS, SPADES};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testScore = new int[3];
		
		testScore[0] = 98;
		testScore[1] = 100;
		testScore[2] = 72;
		
		int shannonsTestScore = testScore[1];
		
		Suit cardSuit;
		cardSuit = Suit.CLUBS;
		
		if(cardSuit == Suit.CLUBS)
			System.out.println("The suit of this card is clubs.");
		
		float floatNum = 1.5f;
		int wasFloat = (int) floatNum;
		
		System.out.println("floatNum:" + floatNum+ " wasFloat:"+ wasFloat);
		
		int x = 3;
		int y = 2;
		
		System.out.println(x/y);
		System.out.println((double)x/y);
	}

}
