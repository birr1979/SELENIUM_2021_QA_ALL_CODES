package javaClass1;

import java.util.Scanner;
public class SimpleCalculator {
	SimpleCalculator() {
		System.out.println("We are Happy to do your number Operations ");
	}
 

	public static void main(String[] args) {
		SimpleCalculator calc1=new SimpleCalculator();
		double x;
		double y;
		String O;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
    
        x = input.nextDouble();

        System.out.println("please enter the second number");
        y = input.nextDouble();

        Scanner Op = new Scanner(System.in);

        System.out.println("Please enter operation");
        O = Op.next();
        
		if (O.equals("+")) System.out.println(x+y);
		
		else if (O.equals ("-")) System.out.println(x-y);
		
		else if (O.equals ("*")) System.out.println(x*y);

		else if (O.equals ("/")) System.out.println("Division: "+ (x/y));
		else System.out.println("Invalid Operator");
		}
		
	}


