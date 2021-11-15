package com.ocaj.exam.chapter5;

public class LogManager {

	public void logInfo(String message, int errorNumber){
		System.out.println("Error: " + errorNumber + " | " + message);
	}
	
	public void logInfo(String message){
		logInfo(message, -1);
	}

}
