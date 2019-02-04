package main;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		double num1;
		double num2;
		int x = 1;			// loop condition
		int calcSymbolError = 0;		// if the user makes error typing calculation symbol, then triggers if condition to avoid printing out the previous value of c

		
		Calc runFun = new Calc();			// in order to access the methods of Calc class, you have to first make objects of that class.
		Scanner scan = new Scanner(System.in);
		
		
		while (x == 1) { 
			
		System.out.println("Enter 2 numbers for Calculations:");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
			
		
		System.out.println("Choose Calculation by typing: + - * / % ^ ^2 ... exit calculator by typing: exit");
		String test = scan.next();  			 // nextLine() doesn't work here...	
		
		
		if (test.equals("+")) {runFun.add(num1, num2);}		// == does not work b/c it tests if both variables are referencing the same memory address or not. So you use .equals() instead 
		else if (test.equals("-")) {runFun.subtract(num1, num2);}
		else if (test.equals("*")) {runFun.multiply(num1, num2);}
		else if (test.equals("/")) {runFun.divide(num1, num2);}
		else if (test.equals("%")) {runFun.modulus(num1, num2);}
		else if (test.equals("^")) {runFun.exponent(num1, num2);}
		else if (test.equals("^2")) {runFun.exponent2(num1);}
		else if (test.equals("exit")) {x = 0;}			// escapes while loop
		else  {
			System.out.println("Could not parse. Try again");
			calcSymbolError = 1;
			}
		
		
		if ((test.equals("/") && num2 == 0) || (test.equals("exit"))) {		// println the 0 division error in calc_class/divide_method
			
		}
		else if (calcSymbolError == 1) {
			calcSymbolError = 0;
		}
		else {
			System.out.println(runFun.c);
		}
		}
		
		scan.close();
	}

}

/**
 * ------------------
 * | GUI Calculator |
 * ------------------
 * [] Front side deals with graphics 
 * [] Back side deals with calculations
 * 
 * ----steps----
 * [X] 1. I need to setup the calculations
 * [] 2. Make functional program without GUI
 * 		[X] a. Add choice when to exit (loop otherwise)
 * 		[X] b. Deal with zero division
 * 		[] c. Be able to instantiate variables (setters, getters for vars)
 * [] 3. Then setup GUI
 * -------------------------
 * | Types of Calculations |
 * -------------------------
 * [X] Addition, Subtractions, Multiplication, Division, Modulus, Exponent, Exponent 2, 
 * [] variables (set | reset| multiple variables no limit?)
 * -----------------------
 * | Other functionality |
 * -----------------------
 * [] able to do 1 calculation after another
 * [] Compound calculations
 * [] exit button
 * [] Duplicate calculator? (opt.)
 * 
 * 
 */
