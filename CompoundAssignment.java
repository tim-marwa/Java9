

public class CompoundAssignment {
	public static void main(String args[]) 
	    { 
	        int b = 120; 
	        b += 10; 
	        int b1 = 120; 
	        b1 *= 10; 
	        float s = 330; 
	        s -= 30; 
	        int b2 = 127; 
	        b2 %= 7; 
	        int b3 = 120; 
	        b3 &= 40; 
	        float s1 = 300; 
	        int k = 1;       
	        int[] a = { 1 };   
	        //k=k+1
	        //Evaluation of this right-hand operand then 
	        //assigns 4 to k, calculates the value 6 for k + 2, and 
	        //then multiplies 4 by 6 to get 24. This is added to the saved 
	        // value 1 to get 25, which is then stored into k by the += operator
	        k += (k = 4) * (k + 2);       
	        a[0] += (a[0] = 4) * (a[0] + 2);       
	        System.out.println( k + " , " + a[0]);
 
	        System.out.println(b); 
	        System.out.println(b1); 
	        System.out.println(b2); 
	        System.out.println(b3); 
	        System.out.println(s); 
	        System.out.println(s1); 

	    } 
	} 
