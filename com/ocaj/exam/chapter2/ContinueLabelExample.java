package com.ocaj.exam.chapter2;
public class ContinueLabelExample {	
	public static void labeledContinueTest(){
		myContinueLabel:
		while(true){
			System.out.println("While Loop 1");
			while(true){
				System.out.println("While Loop 2");
				while(true){
					System.out.println("While Loop 3");
					continue myContinueLabel;
			//		while(true)
			//			System.out.println("While Loop 4");
				}
			}
		}
	}
	public static void main(String[] args) {
		labeledContinueTest();
	}
}
