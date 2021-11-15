package com.ocaj.exam.chapter9;

public class NumberGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			generateNumbers(0);
		} catch(EvenException e){
			System.out.println("Even Exception was caught.");
		}

	}

	private static void generateNumbers(int i) throws EvenException{
		do{
			System.out.println("Number:" +i);
			if(i%2 !=0 )
				throw new EvenException();
			else
				i++;
		}while(true);
		
	}
	
}
