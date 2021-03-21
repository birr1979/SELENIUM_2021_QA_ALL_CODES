package javaExercises;

import java.util.Scanner;

public class Palindrome {

	public boolean isPalindrome(String orginalString) {

		String reverseString = "";

		// building the reverse string
		for (int i = orginalString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + orginalString.charAt(i);
		}

		if (orginalString.toLowerCase().equals(reverseString.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Palindrome pal = new Palindrome();
		
		System.out.println("Enter the word you want to test");
		String testWord = scan.next();
		
		if(pal.isPalindrome(testWord)) {
			System.out.println(testWord + " is Palindrome");
		}else {
			System.out.println(testWord + " is not Palindrome");
		}
		
	}

	
}
