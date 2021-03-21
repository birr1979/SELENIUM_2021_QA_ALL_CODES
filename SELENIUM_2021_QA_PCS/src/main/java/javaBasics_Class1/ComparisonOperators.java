package javaBasics_Class1;

public class ComparisonOperators {

	public static void main(String[] args) {
		
		int value1 = 50;
		int value2 = 45;
		boolean result;
		
		//== --> EQUALS Operator: Returns TRUE if both values are the same
//		if(value1 == value2) {
//			System.out.println("value1 & value2 are the same");
//		}else {
//			System.out.println("they're different");
//		}
		
		result = value1 == value2;
		System.out.println(value1 + " == " + value2 + ": " + result);
		
		//!= --> NOT Equals Operator: Returns TRUE if both values are NOT the same
		result = value1 != value2;
		System.out.println(value1 + " != " + value2 + ": " + result);
		
		// > --> Greater Than Operator: Returns TRUE if the left side is greater than the right side
		result = value1 > value2;
		System.out.println(value1 + " > " + value2 + ": " + result);
		
		// < --> Less Than Operator: Returns TRUE if the left side is less than the right side
		result = value1 < value2;
		System.out.println(value1 + " < " + value2 + ": " + result);
		
		//>= --> Greater Than or Equal to Operator: Returns TRUE if the left side is Greater than or equal to the right side
		result = value1 >= value2;
		System.out.println(value1 + " >= " + value2 + ": " + result);
		
		//<= --> Less Than or Equal to Operator: Returns TRUE if the left side is Less than or equal to the right side
				result = value1 <= value2;
				System.out.println(value1 + " <= " + value2 + ": " + result);
		
		
	}

}
