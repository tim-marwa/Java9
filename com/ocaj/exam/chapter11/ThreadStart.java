package com.ocaj.exam.chapter11;
class ThreadStart 
{ 
  public static void main(String args[]) 
  { 
  
    // lambda expression to create the object 
    new Thread(()->  {System.out.println("New thread created");}).start(); 
  } 
} 