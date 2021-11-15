package com.ocaj.exam.chapter11;

  
class FunctionalInterface2 
{ 
    public static void main(String args[]) 
    { 
        // lambda expression to define the calculate method 
    	Strumable s = () -> {System.out.println("Strummed");}; 
        // parameter passed and return type must be 
        // same as defined in the prototype 
        s.calculate(); 
    } 
} 
@FunctionalInterface
interface Strumable 
{ 
    public void calculate(); 
} 