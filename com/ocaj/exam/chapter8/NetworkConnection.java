package com.ocaj.exam.chapter8;

public class NetworkConnection implements Logable{
	private long createdTimestamp;
	private String currentLogMessage;
	
	public NetworkConnection(){
		createdTimestamp = System.currentTimeMillis();
		currentLogMessage= "Initialized";
	}
	
	public void connect(){
		currentLogMessage = "Connected at " + System.currentTimeMillis();
	}
	
	public String getInitInfo(){
		return "NetworkConnection object created " + createdTimestamp;
	}
	
	public String getLogableEvent(){
		return currentLogMessage;
	}
}
