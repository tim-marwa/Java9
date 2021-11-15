
public class Constants {

	public static void main(String[] args) {
		final int TOUCHDOWN = 6;
		final int CONVERSION = 3;
		int td, pat, total ;
		td = 4 * TOUCHDOWN;
		pat = 3 * CONVERSION;
		total = (td + pat);
		System.out.println("Score: " + total);
		//Arithmetic operations
		double a = 10;
		double b = 20;
		double c = 25;
		double d = 25;
	      System.out.println("a + b = " + (a + b) );
	      System.out.println("a - b = " + (a - b) );
	      System.out.println("a * b = " + (a * b) );
	      //Divission ignores the leftover
	      System.out.println("b / a = " + (b / a) );
	      System.out.println("c / b = " + (c / b) );
	      //Modulus is the leftover after a division
	      System.out.println("b % a = " + (b % a) );
	      System.out.println("c % a = " + (c % a) );
	      System.out.println("a++   = " +  (a++) );
	      System.out.println("b--   = " +  (a--) );
	      // Check the difference in d++ and ++d
	      System.out.println("d++   = " +  (d++) );
	      System.out.println("++d   = " +  (++d) );
	}

}
