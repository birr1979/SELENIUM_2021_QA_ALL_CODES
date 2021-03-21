package javaBasics_Class1;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = 25; //assigning a value to num1 (initializing the variable)
		
		//Ternary Operator --> ?
		
		num2 = (num1 == 25) ? 100 : 200;
		/*
		 * num2 will be assigned a value of 100 IF the expression (num1 == 10) is TRUE
		 * num2 will be assigned a value of 200 IF the expression (num1 == 10) is FALSE
		 */
		
		System.out.println(num2);

	}

}
