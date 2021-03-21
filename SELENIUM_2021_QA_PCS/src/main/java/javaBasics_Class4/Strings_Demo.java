package javaBasics_Class4;

public class Strings_Demo {

	public static void main(String[] args) {
		
		String name1 = "Jay";
		String name2 = "Jay";
		
		//== compares 2 objects
//		if(name1 == name2) {
//			System.out.println("They're the same");
//		}else {
//			System.out.println("They're different");
//		}

		String name3 = new String("Rana");
		String name4 = new String ("Rana");
		
//		if(name3 == name4) {
//			System.out.println("They're the same");
//		}else {
//			System.out.println("They're different");
//		}
		
		//Ideal way to compare 2 strings is using the .equals String method
//		if(name3.equals(name4)) {
//			System.out.println("They're the same");
//		}else {
//			System.out.println("They're Different");
//		}
		
		String myString1 = "Your total today is: $10.56";
		char actualCharValue = myString1.charAt(21);
//		System.out.println(actualCharValue);
		
		char expectedCharValue = '$';
//		if(actualCharValue == expectedCharValue) {
//			System.out.println("Test Passed");
//		}else {
//			System.out.println("Test Failed - Incorrect Currency being applied");
//		}
//		
		String myString2 = "Hello";
		String myString3 = "hello";
		
//		if(myString2.equalsIgnoreCase(myString3)) {
//			System.out.println("Same");
//		}else {
//			System.out.println("Different");
//		}
		
		String myString4 = "Jay";
		String myString5 = "jay!";
//		System.out.println(myString4.compareTo(myString5));
		
		String myString6 = "My Name is Jay";
		String subStringResult = myString6.substring(3);
		System.out.println(subStringResult);
		
		String subStringResult_startEnd = myString6.substring(3, 7);
		System.out.println(subStringResult_startEnd);
		
		
		String myString7 = "Hello";
		System.out.println(myString7.length());
		
		String myString8 = "My Name is Rana";
		int indexOfI = myString8.indexOf('i');
		System.out.println(indexOfI);
	}

}
