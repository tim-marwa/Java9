package com.ocaj.exam.chapter2;

import java.util.ArrayList;

public class EnhancedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Float> fishLenghtList = new ArrayList<Float>();
		fishLenghtList.add((float) 10.0);
		fishLenghtList.add((float) 5.5);
		fishLenghtList.add((float) 18.0);
		fishLenghtList.add((float) 29.5);
		fishLenghtList.add((float) 45.5);

		System.out.print("\nIs > 28:");
		//Enhanced for loop
		for (Float f : fishLenghtList)
			if (f > 28)
				System.out.print(" " + f);
		System.out.print("\nAll:");
		//Enhanced for loop
		for (Float f : fishLenghtList)
				System.out.print(f + " ");

	}

}
