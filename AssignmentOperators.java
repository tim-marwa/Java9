
public class AssignmentOperators {

	public static void main(String[] args) {
		byte starting = 3; short firstValue = 5; 
		int secondValue = 7;
		//casting
		int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
		System.out.println(functionValue);
short s = Short.MAX_VALUE;
char c = (char) s;
System.out.println( c == Short.MAX_VALUE);
System.out.println( Long.MAX_VALUE);
float f = Float.POSITIVE_INFINITY;
//casting needed
long l = (long) f;
int i = (int) f;
//No casting needed
double dd = f;

System.out.println("long: " + l + " int: " + i+" float: " + f + " double: " + dd);

int j = 255;
byte d = (byte) j;

// size is too large and resulted in negative
System.out.println(d);
		double a = 10;
		double b = 20;
		a = b;
	    System.out.println("a = b " + (a) );
		a += b;
	    System.out.println("a = a + b " + (a) );
		a -= b;
	    System.out.println("a = a - b " + (a) );
		a *= b;
	    System.out.println("a = a * b " + (a) );
		a /= b;
	    System.out.println("a = a/b " + (a) );
		a %= b;
	    System.out.println("a = a%b " + (a) );
	    //Comparing values
	    boolean state;
	    state = ( a == b);
	    System.out.println("a == b " + (state) );
	    state = ( a != b);
	    System.out.println("a != b " + (state) );
	    state = ( a > b);
	    System.out.println("a > b " + (state) );
	    state = ( a >= b);
	    System.out.println("a >= b " + (state) );
	    state = ( a < b);
	    System.out.println("a < b " + (state) );
	    state = ( a <= b);
	    System.out.println("a <= b " + (state) );
	    //Assessing Logic
	    boolean yes = true;
	    boolean no =  false;
	    boolean result;
	    boolean status;
	    result = yes && no;
	    System.out.println("&& " + (result) );
	    result = yes || no;
	    System.out.println("|| " + (result) );
	    result = !no;
	    System.out.println("! " + (result) );
	    /*Examining conditions
	    ( booloen-expression ) ? if-true-return-this: if-false-return-this 
	    */
	    status = ( yes || no ) ? true : false ;
	    System.out.println("yes || no?  " + (status) );
	    status = ( no = true ) ? true : false ;
	    System.out.println("yes = true?  " + (status) );
	}

}
