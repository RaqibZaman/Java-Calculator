package main;

public class Calc {
	public double c;		// calculation result - other classes (run) will take from here
	
	
	public void add(double a, double b) {	
		c = a + b;
		
	}
	
	public void subtract(double a, double b) {
		c = a - b;
		
	}
	
	public void multiply(double a, double b) {
		c = a * b;
		
	}
	
	public void divide(double a, double b) {		// setup try catch in case of zero division
		if (b == 0) {
			System.out.println("You cannot divide by zero");
		}
		else {
		c = a / b;
		}

		
	}
	
	public void modulus(double a, double b) {
		c = a % b;
		
	}
	
	public void exponent(double a, double b) {
		c = Math.pow(a, b);		
		
	}
	
	public void exponent2(double a) {
		c = Math.pow(a, 2);
		
	}
	
	public void var() {	
		
		
		/**
		 * Purpose: I need a way to instantiate variables by user request
		 * 
		 * harder to implement, I think needs an array, limit vars or not?
		 * having objects to have their own vars through constructors may be the way to go
		 * So have a separate Var class perhaps?
		 * 
		 */
		
	}

	

}
