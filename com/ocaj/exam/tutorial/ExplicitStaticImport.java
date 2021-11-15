package com.ocaj.exam.tutorial;
//Explicitly Imports static member ITALY
import static java.util.Locale.ITALY;
//Implicitly Imports all static member in class Locale
import static java.util.Locale.*;
public class ExplicitStaticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Locale: " + ITALY);
		System.out.println("Locale: " + GERMANY);
		System.out.println("Locale: " + JAPAN);

	}

}
