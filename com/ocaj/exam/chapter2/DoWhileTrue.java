package com.ocaj.exam.chapter2;

public class DoWhileTrue {

	public static void main(String[] args) throws InterruptedException {
		do {
			System.out.println("Start Processing inside do while loop");
			// look for a file at specific directory
			// if found, then process it, such as inserting rows into database
			System.out.println("End Processing of do while loop");

			Thread.sleep(5 * 1000);
		} while (true);
	}
}