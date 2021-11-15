package com.ocaj.exam.chapter8;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TypeA var1 = new TypeA();
		TypeA var2 = new TypeB();
		TypeA var3 = new TypeC();
		
		TypeB var4 = new TypeB();
		TypeB var5 = new TypeC();
		
		TypeC var6 = new TypeC();
		
		double detailedScore = 1.2;
		float score = (float) detailedScore;
	
		System.out.println("detailedScore:" + detailedScore + " score:" + score);
		
		int i = 1236;
		byte b = (byte)i;
		System.out.println("i:" + i+ " b:" + b);
	
		i = 8;
		Integer obj1 = new Integer(i);
		Integer obj2 = (Integer)i;
		// INVALID Byte b1 = i;
		Integer obj3 = i;
		// INVALID Float obj4 = i;
		Float obj4 = 5.7f;
		//Below is invalid;
		//	Integer obj5 = obj4;
		
		ClassB obj10 = new ClassB();
		ClassA obj20 = new ClassB();
		ClassA obj30 = new ClassA();
		
		System.out.println("obj10:" + obj10.whoAmI());
		System.out.println("obj20:" + obj20.whoAmI());
		System.out.println("obj30:" + obj30.whoAmI());
		
		//NOT VALID.Needs casting. System.out.println("obj20:" + "obj20.specialClassBMethod():" + obj20.specialClassBMethod());
		//casting superclass to sublass
		ClassB obj40 = (ClassB)obj20;
		System.out.println("obj40.specialClassBMethod():" + obj40.specialClassBMethod());
	
		System.out.println("((ClassB)obj20).specialClassBMethod():" + ((ClassB)obj20).specialClassBMethod());
		
	}

}
