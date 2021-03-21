package javaBasics_Class1;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean result;
		
		//Logical Operators will ALWAYS return a boolean value only (True or False)
		
		//&& --> AND Operator: Returns TRUE if both values are TRUE (else it returns FALSE)
		result = bool1 && bool2;
		System.out.println("bool1 && bool2: " + result);
		
		//|| --> OR Operator: Return TRUE if either value is TRUE
		result = bool1 || bool2;
		System.out.println("bool || bool2: " + result);
		
		// ! --> NOT Operator: Returns the opposite of the boolean value being processed
		result = !bool1;
		System.out.println("!bool1: " + result);
		result = !bool2;
		System.out.println("!bool2: " + result);
		
		
		

	}

}
