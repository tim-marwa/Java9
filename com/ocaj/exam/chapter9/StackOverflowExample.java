package com.ocaj.exam.chapter9;

import java.util.ArrayList;

public class StackOverflowExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		forceStackOverFlowError();
	}

	private static void forceStackOverFlowError(){
		Integer counter = 0;
		ArrayList<Integer> unstoppable = new ArrayList<>();
		while(true){
			unstoppable.add(counter);
			counter++;
			if(counter % 10000 == 0)
				System.out.println("Counter:" + counter);
		}
	}
	
}
