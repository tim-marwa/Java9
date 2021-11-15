package com.ocaj.exam.chapter3;

public class PrecedenceOperatorsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p1 = 1, p2 = 5, p3 = 10, p4 = 25;
		
		System.out.println(p1 + p2 - p3);
		
		System.out.println(p1 + p2 * p3);
		
		System.out.println((p1 + p2) * p3);
		
		System.out.println((p1 * (p2 + p3)) - p4);
		
	}

}
