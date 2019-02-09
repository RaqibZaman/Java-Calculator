package Java_Calculator;

public class Calc {
	public static double c;		// calculation result - other classes (run) will take from here
	
	
	public static double add(double a, double b) {	
		c = a + b;
		return c;
		
	}
	
	public static double subtract(double a, double b) {
		c = a - b;
		return c;
		
	}
	
	public static double multiply(double a, double b) {
		c = a * b;
		return c;
		
	}
	
	public static double divide(double a, double b) {		// setup try catch in case of zero division
		c = a / b;
		return c;

	}
	
	public static double modulus(double a, double b) {
		c = a % b;
		return c;
		
	}
	
	public static double exponent(double a, double b) {
		c = Math.pow(a, b);
		return c;
		
	}
	
	public static double exponent2(double a) {
		c = Math.pow(a, 2);
		return c;
		
	}
	

}
