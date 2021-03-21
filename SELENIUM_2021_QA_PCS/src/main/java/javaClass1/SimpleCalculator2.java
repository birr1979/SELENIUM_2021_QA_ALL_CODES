package javaClass1;

import java.util.Scanner;

public class SimpleCalculator2 {
	double FirstNumber;
	double SecondNumber;
	String Operator;
		SimpleCalculator2(){
		
			System.out.println("Welcome we are happy to do your number Operations");
			System.out.println("Please Choose your Operation number +,-,* or /");
		}
	
	public static void main(String[] args) {
		SimpleCalculator2 calc =new SimpleCalculator2();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Entered Operation: "); calc.Operator =input.next();
		if (calc.Operator.equals("+")||calc.Operator.equals("-")||calc.Operator.equals("*")||calc.Operator.equals("/")) {
			
		System.out.println("Please Enter your First Number");calc.FirstNumber=input.nextDouble();
		System.out.println("Please Enter the Second Number");calc.SecondNumber=input.nextDouble();
		System.out.println("Thank you!------------------------");
	
		if (calc.Operator.contentEquals("+")) {
			System.out.println("\nYour Addition Operation: "+calc.FirstNumber+" + "+calc.SecondNumber+"= "+(calc.FirstNumber+calc.SecondNumber) );
		}
		else if (calc.Operator.contentEquals("-")) {
			System.out.println("\nYour Subtraction Operation: "+calc.FirstNumber+" - "+calc.SecondNumber+"= "+(calc.FirstNumber-calc.SecondNumber) );
		}
		else if (calc.Operator.contentEquals("*")) {
			System.out.println("\nYour Multiplication Operation: "+calc.FirstNumber+" * "+calc.SecondNumber+"= "+(calc.FirstNumber*calc.SecondNumber) );
		}
		else if (calc.Operator.contentEquals("/")) {
			System.out.println("\nYour Division Operation: "+calc.FirstNumber+" / "+calc.SecondNumber+"= "+(calc.FirstNumber/calc.SecondNumber) );
		}		
		
		}
		else {
			System.out.println("\nIncorrect Operator Entered, Please Check your Entery.");
			System.out.println("Program terminated.");
		}
		
		
		
	}

}
