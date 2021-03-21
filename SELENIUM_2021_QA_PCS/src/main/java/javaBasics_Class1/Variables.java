package javaBasics_Class1;

public class Variables {

	public static void main(String[] args) {
				
		
		//Declare Variable --> allocating space for an integer value
		int salary;
		
		//Initialize Variable --> assigning a value to the variable
		salary = 65;
		
		System.out.println(salary);
		
		salary = 500;
		System.out.println(salary);
		
		//Declaring & Initializing on the same line
		int myAge = 20;
		
			
		int socialSecurityNumber = 123456789;
				
		//Java is Case-Sensitive 
		String name;
		String Name;
		name = "Mary";
		
		//String name; --> Error: Duplicate Variable
		
		//Concatenation --> +
		//I want to print out "My name is: Jay"
		System.out.println("My name is: " + name);
		
		//I want to print out "My name is: Jay and my age is: 20"
		System.out.println("My name is: " + name + " and my age is: " + myAge);
		

	}

}
