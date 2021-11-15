//Package statement
package com.ocaj.exam.tutorial;
//Imports the class ArrayList from the java.util package
import java.util.ArrayList;
//Imports all classes from the java.io package
//import java.io.*;

import java.util.Scanner;
public class PlaneMainClass {

	public static void main(String[] args) {
		// Create a console from the java.io package
		//Console console =  System.console();
		//String planet = console.readLine(" \nEnter your favouurate planet: ");
		// Create a list of planets
		ArrayList<String> planetList = new ArrayList<String>();
	       Scanner console = new Scanner(System.in);
	       System.out.println(" \nEnter your favouurate planet:  " );
	       String planet = console.next();

	    console.close();       
		//Add user input to the list
		planetList.add(planet);
		//Add a string to the list
		planetList.add("Gliese 581 c");
		System.out.println(" \nTwo cool planets: " + planetList);
	}

}
