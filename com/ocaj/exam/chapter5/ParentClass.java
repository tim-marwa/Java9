package com.ocaj.exam.chapter5;

public class ParentClass {
	//Constructors. One with parameter. One with none
	public ParentClass(){
		System.out.println("ParentClass Constructor");
	}
	
	public ParentClass(String s){
		System.out.println("ParentClass Constructor:" + s);
	}
	//Method
	public String className(){
		return " ParentClass ";
	}
}
