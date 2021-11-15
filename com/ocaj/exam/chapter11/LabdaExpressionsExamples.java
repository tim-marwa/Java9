package com.ocaj.exam.chapter11;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

public class LabdaExpressionsExamples {

   public static void main(String args[]) {
	   LabdaExpressionsExamples tester = new LabdaExpressionsExamples();	
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;	
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;	
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };	
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;	
      Path path = FileSystems.getDefault().getPath("\\dna_data\\DNA_rsults.txt");
      PathMatcher matcher1 = (Path p) -> { return (p.toString().contains("DNA")); };
      PathMatcher matcher2 = (Path p) -> { return (p.toString().startsWith("DNA")); };
      PathMatcher matcher4 = (Path p) -> { return (!p.toString().endsWith("DNA")); };
      PathMatcher matcher3 = (Path p) -> { return (p.toString().equals("DNA")); };
      System.out.println("contains = " + matcher1.matches(path));
      System.out.println("startsWith = " + matcher2.matches(path));
      System.out.println("endsWith = " + matcher4.matches(path));
      System.out.println("equals = " + matcher3.matches(path));
      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
      //without parenthesis
      GreetingService greetService1 = message -> System.out.println("Hello " + message);
      //with parenthesis
      GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
      greetService1.sayMessage("Mahesh");
      greetService1.sayMessage("Suresh");
   }
interface PathMatcher {
	      boolean matches(Path p);
	   }	
   interface MathOperation {
      int operation(int a, int b);
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
	
   private int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
}