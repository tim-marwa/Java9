package com.ocaj.exam.chapter3;

import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 
  
public class StringBuilderExample { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        // create a StringBuilder object 
        // usind StringBuilder() constructor 
        StringBuilder str 
            = new StringBuilder(); 
  
        str.append("GFG"); 
  
        // print string 
        System.out.println("String = "
                           + str.toString()); 
  
        // create a StringBuilder object 
        // usind StringBuilder(CharSequence) constructor 
        StringBuilder str1 
            = new StringBuilder("AAAABBBCCCC"); 
  
        // print string 
        System.out.println("String1 = "
                           + str1.toString()); 
  
        // create a StringBuilder object 
        // usind StringBuilder(capacity) constructor 
        StringBuilder str2 
            = new StringBuilder(10); 
  
        // print string 
        System.out.println("String2 capacity = "
                           + str2.capacity()); 
  
        // create a StringBuilder object 
        // usind StringBuilder(String) constructor 
        StringBuilder str3 
            = new StringBuilder(str1); 
  
        // print string 
        System.out.println("String3 = "
                           + str3.toString()); 
// delete contents of string builder
        str1.delete(0, str1.length());
        //str.deleteCharAt(5)
        System.out.println("String1 empty= " + str1.toString()); 

    } 
}