package com.ocaj.exam.chapter2;
public class BreakLabelExample {
	public static void main(String[] args){
		//Declare Label
		myBreakLabel:
		while(true){
			System.out.println("While Loop1");
			while(true){
				System.out.println("While Loop2");
				while(true){
					System.out.println("While Loop3");
					break myBreakLabel;
				}
			}
		}
		System.out.println("Exit1");
		System.out.println("Exit2");
		System.out.println("Exit3");
	}
}
