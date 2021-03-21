package javaBasics_Class3;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// Create an object of the Scanner Class
		Scanner scanObj = new Scanner(System.in);

		// Ask for User's Input - I want to get the User's Name (String)
		System.out.println("What is your name?");// Capture User's Input - I want the user's salary

		// capturing the user's input
		String usersName = scanObj.next();// finds the next string value and caputures it into the variable

		// Ask for User's Input - I want to get the User's Salary (double)
		System.out.println("What is your salary?");
		double userSalary = scanObj.nextDouble(); // finds the next double value

		// Ask for User's Input - I want the user's Age
		System.out.println("What is your age?");
		int usersAge = scanObj.nextInt(); // finds the next int value
		
		
		//Always remember to close the scan object once we are done capturing user's input
		scanObj.close();

		System.out.println("Captured User's Name: " + usersName);

		System.out.println("Captured User's Age: " + usersAge);

		System.out.println("Captured User's Salary: " + userSalary);

	}

}
