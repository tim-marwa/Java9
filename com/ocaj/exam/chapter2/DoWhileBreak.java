package com.ocaj.exam.chapter2;

public class DoWhileBreak {

	public static void main(String[] args) {
		int i = 5, var = 10;
		do {
			System.out.println(i);
			i++;
		} while (i <= var--);
	}
}
