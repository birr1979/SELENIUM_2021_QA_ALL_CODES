package javaBasics_class2;

public class StringsDemo {

	public static void main(String[] args) {
		
		//String Literal method to create String Object
		/*
		 * Instead of creating 2 different objects, 
		 * JVM will create 1 object with the value "Hello World"
		 * myString1 reference variable will point to that object 
		 * myString2 reference variable will point to that object
		 */
		String myString1 = "Hello World";
		String myString2 = "Hello World";
		
//		if(myString1 == myString2) {
//			System.out.println("They're the Same");
//		}else {
//			System.out.println("They're different");
//		}
		
		//Instantiation method to create String Object 
		/*
		 * A new String object is created each time the 'new' 
		 * keyword is used
		 * myString3 points to 1 String object 
		 * myString4 points to another String object
		 */
		String myString3 = new String("We're starting to learn Java");
		String myString4 = new String("We're starting to learn Java");
		
//		if(myString3 == myString4) {
//			System.out.println("They're the Same");
//		}else {
//			System.out.println("They're different");
//		}
		
		/*
		 * It is not a good practice to compare strings using the == operator
		 * Instead, we need to use some pre-defined String methods
		 * 
		 */
		
		//The appropriate way to compare 2 strings --> .equals String method
		if(myString3.equals(myString4)) {
			System.out.println("They're the Same");
		}else {
			System.out.println("They're different");
		}
		
		System.out.println(myString3.length());
		
	}

}
