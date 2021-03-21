package javaBasics_Class1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int sum;
		int subtraction;
		int multiplication;
		double division;
		int modulus;
		
		sum = 5 + 6;
		System.out.println("5 + 6 = " + sum);
		
		subtraction = 25 - 3;
		System.out.println("25 - 3 = " + subtraction);
		
		
		multiplication = 4 * 5;
		System.out.println("4 * 5 = " + multiplication);
		
		division = 50 / 2;
		System.out.println("50 / 2 = " + division);
		
		
		/*
		 * Modulus returns the Remainder of a division operation
		 * 10 / 3 --> 3 goes into 10 3 times (3 * 3 = 9) 
		 * what's left is the remainder = 1
		 */
		modulus = 10 % 3;
		System.out.println("10 % 3 = " + modulus);

	}

}
