package com.ocaj.exam.chapter7;

public class PhoneBookEntry {
	private String name = "";
	private int phoneNumber = 0;
	private long lastUpdate = 0;
	
	public String getName(){
		return name;
	}
	
	public void setNameNumber(String name, int phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
		lastUpdate = System.currentTimeMillis();
	}
	
	public int getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
		lastUpdate = System.currentTimeMillis();
	}
}
