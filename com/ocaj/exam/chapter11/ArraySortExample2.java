package com.ocaj.exam.chapter11;

import java.util.Arrays;
import java.util.Collections;


public class ArraySortExample2 {
    public static void main(String[] args) {
    	String[] s = { "sort", "string", "array" };
    	s = Arrays.stream(s).sorted().toArray(String[]::new);  // or Stream.of()
    	System.out.println("Ascending"+ Arrays.toString(s)); 			   // [array, sort, string]
    	s = Arrays.stream(s).sorted(Collections.reverseOrder()).toArray(String[]::new);
    System.out.println("Descending"+Arrays.toString(s));
    }
}