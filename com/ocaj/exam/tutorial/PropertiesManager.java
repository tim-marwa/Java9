package com.ocaj.exam.tutorial;

import java.util.Properties;

public class PropertiesManager {
	public static void main(String[] args){
		if(args.length == 0){System.exit(0);}
		Properties props = System.getProperties();
		//New Property Example
		props.setProperty("new_property2", "new value");
		
		switch(args[0]){
			case "-list_all":
				props.list(System.out);
				break;
			case "-list_prop":
				System.out.println(props.getProperty(args[1]));
				break;
			default:
				System.out.println("Usage: java PropertiesManager [-list_all]");
				System.out.println("       java.PropertiesManager [-list_prop [prperty]]");
		}
	}
}
