package javaBasics_Class1;

public class DataTypes {
	
	public static void main(String[] args) {
		
		/*
		 * Primitive Data Types (8)
		 * Byte --> -128 to 127
		 * Short --> -32,768 to 32,767
		 * Int --> -2,147,483,648 to 2,147,483,647
		 * Long --> -9,223,372,036,854,775,808 to
9,223,372,036,854,775,807
		 * Float --> 6/7 precision points (decimal points)
		 * Double --> 15 precision points (decimal points)
		 * Boolean --> True or False
1		 * Char --> Accepts a single character
		 */
		
		String x="50";
		byte y= Byte.valueOf(x);
		
		
		
		//Declare a variable called myByte that will hold byte data
		byte myByte;
		
		//Initialized myByte with a value of 10
		myByte = 124;
		
		//Using the variable myByte by printing it in the console
		System.out.println("Byte value is: " + myByte);
		
		short myShort;
		myShort = 5000;
		System.out.println("Short value is: " + myShort);
		
		int myInt;
		myInt = 12309313;
		System.out.println("Int value is: " + myInt);
		
		long myLong;
		myLong = 231039103912089245l; //l suffix is required
		System.out.println("Long value is: "  + myLong);
		
		float myFloat;
		myFloat = 1.49201f;
		System.out.println("Float value is: " + myFloat);
		
		double myDouble;
		myDouble = 452.4920390132;
		System.out.println("Double value is: " + myDouble);
		
		boolean myTrueBoolean;
		boolean myFalseBoolean;
		myTrueBoolean = true;
		myFalseBoolean = false;
		System.out.println("True Boolean Value is: " + myTrueBoolean);
		System.out.println("False Boolean Value is: " + myFalseBoolean);
		
		char myChar;
		myChar = '%';
		System.out.println("Char value is: " + myChar);
		
		
	}

}
