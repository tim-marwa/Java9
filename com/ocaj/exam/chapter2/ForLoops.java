package com.ocaj.exam.chapter2;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int sum = 0;
      for (int i = 0, j = 20; sum > 10; ++i, --j)      // 1
      {
         sum = sum+ i + j;
      }
      System.out.println("Sum = " + sum);
   }


}
