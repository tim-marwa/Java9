package com.ocaj.exam.chapter9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\ntryCatchSimple");
		tryCatchSimple();
		System.out.println("\ndemonstrateTryCatch0");
		demonstrateTryCatch0();
		System.out.println("\ndemonstrateTryCatch1");
		demonstrateTryCatch1();
		System.out.println("\ndemonstrateTryCatch2");
		demonstrateTryCatch2();
		System.out.println("\ndemonstrateTryCatch3");
		demonstrateTryCatch3();
		
		System.out.println("\ndemonstrateTryFinally0");
		demonstrateTryFinally0();
		System.out.println("\ndemonstrateTryFinally2");
		try{
			demonstrateTryFinally2();
		} catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
		
		//System.out.println("\ndemonstrateTryCatchFinallyWithResources");
		//demonstrateTryCatchFinallyWithResources();
		
		System.out.println("\ndemontrateTryWithResources");
		demontrateTryWithResources();
		
		System.out.println("\ndemonstrateMultiCatch");
		demonstrateMultiCatch();

		System.out.println("\nforceIllegalArgumentException");
		forceIllegalArgumentException();

		System.out.println("\nforceArrayIndexOutOfBoundsException");
		forceArrayIndexOutOfBoundsException();

		System.out.println("\nforceIndexOutOfBoundsException");
		forceIndexOutOfBoundsException();
		
		System.out.println("\nforceNumberFormatException");
		forceNumberFormatException();
	
		System.out.println("\nforceNullPointerException");
		forceNullPointerException();
		
		System.out.println("\nforceIllegalStateException");
		forceIllegalStateException();
		
		System.out.println("\nforceClassCastException");		
		forceClassCastException();
		
		System.out.println("\nforceArithmeticException");	
		forceArithmeticException();
		
		System.out.println("\ndemonstrateTryFinally1");
		demonstrateTryFinally1();
		
	}

	private static void tryCatchSimple(){
		try{
			System.out.println("What's up!");
			throw new ArithmeticException();
			//System.out.println(", Hello!!"); //Code never reached
			//System.out.println(", Hi there! "); //Code never reached
		}catch( ArithmeticException ae){
			System.out.println(", Howdy! ");
			ae.printStackTrace();
		}
	}

	private static void demonstrateTryCatch0(){
		try {
			throw new NumberFormatException();
		} catch(NumberFormatException nfe){
			//Exception is caught here
			nfe.printStackTrace();
		} catch(IllegalArgumentException iae){
			iae.printStackTrace();
		} catch(RuntimeException re){
			re.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void demonstrateTryCatch1(){
		try{
			int result = (3 / 0); //Throws ArithmeticException
		} catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());
			ae.printStackTrace();
		}
	}
	
	private static void demonstrateTryCatch2(){
		try{
			throw new NumberFormatException();
		} catch(NumberFormatException nfe){
			//This catch clause should not be empty
		}
	}
	
	private static void demonstrateTryCatch3(){
		try{
			throw new NumberFormatException();
		} catch(IllegalArgumentException iae){
			iae.printStackTrace();
		}
	}
	
	private static void demonstrateTryFinally0(){
		try {
			System.out.print("Jab");
		} finally{
			System.out.println(" and Roundhouse");
		}
	}
	
	private  static void demonstrateTryFinally1(){
		try{
			System.out.print("Jab");
			System.exit(0);
		} finally{
			System.out.println(" and Roundhouse");
		}
	}
	
	private  static void demonstrateTryFinally2(){
		System.out.print("Bread");
		try{
			throw new NumberFormatException(); //unchecked exception
		} finally{
			System.out.println(" and "); //this gets executed!
		}
		//System.out.println(" butter"); //this statement is not reached
	}
	
	public static void demonstrateTryCatchFinallyWithResources(){
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("\nNumber of apples: ");
			int apples = sc.nextInt();
			System.out.print("\nNumber of oranges: ");
			int oranges = sc.nextInt();
			System.out.println("Pieces of Fruit: " + (apples + oranges));
		} catch(InputMismatchException ime){
			ime.printStackTrace();
		} finally{
			sc.close();
		}
	}
	
	private static void demontrateTryWithResources(){
		try(Scanner sc = new Scanner(System.in)){
			System.out.print(" \nNumber of apples: ");
			int apples = sc.nextInt();
			System.out.print("\nNumber of oranges: ");
			int oranges = sc.nextInt();
			System.out.println("Pieces of Fruit: " + (apples + oranges));
		} catch(InputMismatchException ime){
			ime.printStackTrace();
		}
	}
	
	private static void demonstrateMultiCatch(){
		try{
			Random random = new Random();
			int i = random.nextInt();
			if(i==0)
				throw new ArrayIndexOutOfBoundsException();
			else
				throw new NullPointerException();
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			e.printStackTrace();
		}
	}
	
	private static void forceIllegalArgumentException(){
		try{
			int s=1;
			Path path = Paths.get(((Integer)s).toString());
		} catch(IllegalArgumentException iae){
			iae.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void forceNumberFormatException(){
		try {
			Double.parseDouble("2.1");
			Double.parseDouble("INVALID");
		} catch(NumberFormatException nfe){
			nfe.printStackTrace();
		}
	}
	
	private static void forceArrayIndexOutOfBoundsException(){
		try {
			Float[][] num = new Float[2][3];
			num[2][0] = 1.0f;
			num[2][1] = 2.0f;
			System.out.println(num[2][2]);
			System.out.println(num[2][3]); //ArrayIndexOutOfBoundsException
		} catch(ArrayIndexOutOfBoundsException aioobe){
			aioobe.printStackTrace();
		}
	}
	
	private static void forceIndexOutOfBoundsException(){
		try {
			List gorillaSpecies = new LinkedList();
			gorillaSpecies.add("Eastern");
			gorillaSpecies.add("Western");
			System.out.println(gorillaSpecies.get(1));
			System.out.println(gorillaSpecies.get(2)); //IndexOutOfBoundsException
		} catch (IndexOutOfBoundsException ioobe){
			ioobe.printStackTrace();
		}
	}
	
	private static void forceNullPointerException(){
		try {
			String iceCreamFlavor = "vanilla";
			iceCreamFlavor = null;
			System.out.println(iceCreamFlavor);
		} catch(NullPointerException npe){
			npe.printStackTrace();
		}
	}
	
	private static void forceIllegalStateException(){
		try {
			ArrayList chord = new ArrayList();
			chord.add("D");
			chord.add("G");
			chord.add("B");
			chord.add("G");
			Iterator it = chord.iterator();
			while(it.hasNext()){
				it.next();
				it.remove();
				it.remove(); //IllegalStateException (remove depends on next)
			}
		} catch(IllegalStateException ise){
			ise.printStackTrace();
		}
	}
	
	private static void forceClassCastException(){
		try {
			Object x = new Float("1.0");
			System.out.println((Double) x);
			System.out.println((String) x); //ClassCastException
		} catch(ClassCastException cce){
			cce.printStackTrace();
		}
	}

	private static void forceArithmeticException(){
		try {
			int apple;
			apple = 4/2;
			apple = 4/0; //ArithmeticException
		} catch(ArithmeticException ae){
			ae.printStackTrace();
		}
	}
	
}
