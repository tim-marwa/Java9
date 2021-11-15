package com.ocaj.exam.chapter7;

public abstract class Plant {
	private int age = 0;
	private int height = 0;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void addYearToAge(){
		age++;
	}
	
	public abstract void doSpring();
	public abstract void doSummer();
	abstract public void doFall();
	public abstract void doWinter();
	
}
