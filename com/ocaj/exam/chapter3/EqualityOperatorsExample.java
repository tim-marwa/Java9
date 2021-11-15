package com.ocaj.exam.chapter3;
public class EqualityOperatorsExample {
	public static void main(String[] args) {
		int value = 12;
		//boolean compare
		System.out.println(true == true);
		//char compare
		System.out.println('a' != 'a');
		System.out.println((byte)value == (byte)value);
		System.out.println((short)value == (short)value);
		//integer compare
		System.out.println(value == value);
		//float compare
		System.out.println(12F == 12f);
		//double compare
		System.out.println(12D != 12d);
		System.out.println("Instances");
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		//different reference. False
		System.out.println(a == b);
		//different reference
		System.out.println(a == c);
		//same reference
		System.out.println(b == c);
		System.out.println(a != b);
		System.out.println(a != c);	
		//same reference
		System.out.println(b != c);	
	}
}
