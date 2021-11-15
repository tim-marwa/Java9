package com.ocaj.exam.chapter9;

import java.io.IOException;

public class Thrower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thrower t = new Thrower();
		try{
			t.throw1();
		}catch(IOException ex){
			System.out.println("An IOException has ocurred");
		}
	}
//all method throws exception
	public void throw1() throws IOException {
		throw2();
	}
	
	public void throw2() throws IOException {
		throw3();
	}
	
	public void throw3() throws IOException {
		throw4();
	}
	
	public void throw4() throws IOException {
		throw new IOException();
	}
	
}
