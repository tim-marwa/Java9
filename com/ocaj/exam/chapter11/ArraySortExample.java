package com.ocaj.exam.chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class ArraySortExample {
    public static void main(String[] args) {
    	String[] s = { "sort", "string", "array" };
    	Arrays.sort(s, null);
    	//null value acceptable for naturalorder.
    	//Arrays.sort(s, Comparator.naturalOrder());
    	System.out.println("Ascending"+ Arrays.toString(s)); 			   // [array, sort, string]
    	Arrays.sort(s, Comparator.reverseOrder());	// or Collections.reverseOrder())
    System.out.println("Descending"+Arrays.toString(s));
    }
}