package com.ocaj.exam.chapter2;

public class DoWhile {

	public static void main(String[] args) {
		   int var = 20, i=0;
		      do{
		         while(true){
		         if( i++ > var) break;
		         }
		      }while(i<var--);
		      System.out.println(var);
		   }

}
