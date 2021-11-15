package com.ocaj.exam.chapter2;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapExample {
	public static void main(String[] args) {
		 HashMap<Integer,String> hm = new HashMap<Integer,String>();    
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		      System.out.println("After invoking put() method ");  
		      for(Entry<Integer, String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      hm.putIfAbsent(103, "Gaurav");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Entry<Integer, String> m:hm.entrySet()){    
		        System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(104,"Ravi");  
		      map.putAll(hm);  
		      System.out.println("After invoking putAll() method ");  
		      for(Entry<Integer, String> m:map.entrySet()){    
		        System.out.println(m.getKey()+" "+m.getValue());    
		       }
	}

}
