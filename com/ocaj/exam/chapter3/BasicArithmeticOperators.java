package com.ocaj.exam.chapter3;

public class BasicArithmeticOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int greyCannonBalls = 50;
		int blackCannonBalls = 50;
		int totalCannonBalls = greyCannonBalls + blackCannonBalls;
		int firedCannonBalls = 10;
		totalCannonBalls = totalCannonBalls - firedCannonBalls;
		int matches = 20;
		int matchboxes = 20;
		int totalMatches = matches * matchboxes;
		
		int pirates = 104;
		int pirateShips = 3;
		int assignedPiratesPerShip = pirates / pirateShips;
		int pirateRemainder = pirates % pirateShips;
		
		System.out.println("totalCannonBalls:" + totalCannonBalls);
		System.out.println("totalMatches:" + totalMatches);
		System.out.println("assignedPiratesPerShip:" + assignedPiratesPerShip);
		System.out.println("pirateRemainder:" + pirateRemainder);	
		
		int x = 10;
		int y = ++x;
		System.out.println("x=" + x + ", y=" + y);
		
		x=10;
		y=x++;
		System.out.println("x=" + x + ", y=" +y);

		x=10;
		y = --x;
		System.out.println("x=" + x + ", y=" +y);
		
		x=10;
		y = x--;
		System.out.println("x=" + x + ", y=" +y);
		
	}

}
