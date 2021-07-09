  package InterviewExecrise;

import java.util.Scanner;

public class PalindromeString {


	public boolean Palindromestring (String NewWord) {

		Scanner S=new Scanner(System.in);
		System.out.println("Please enter the word to check the Palindrom");
		NewWord=S.next();
		S.close();
		StringBuffer buffer = new StringBuffer(NewWord);
		buffer.reverse();
		String reversString = buffer.toString();
		boolean ispalindrome;
		if(NewWord.equalsIgnoreCase(reversString)){
			ispalindrome=true;

		} else {
			ispalindrome=false;

		}
		return ispalindrome;
	}

	public static void main(String[] args) {

		/*
	Determine if a given String is a Palindrome
		• Palindrome: A word that remains the same when it is spelled
		backwards or forwards
		• Examples: madam, civic, radar, wow, mom, noon, rotator, stats
		• Write a non-static method that will take any string provided by the
		user and determine if it is a palindrome or not.
		• The method should return a ‘TRUE’ or ‘FALSE’
		• The method should be called as part of a conditional statement
		• The Conditional Statement should return the following text:
		• word being tested is a Palindrome (if TRUE)
		• word being tested is not a Palindrome (if FALSE)
		• The program should not be Case-Sensitive (Wow is the same as wow)

		 */ 
		PalindromeString word=new PalindromeString();
		boolean ispalindrome = word.Palindromestring(null);
		if (ispalindrome) 
		{

			System.out.println("The word being tested is a Palindrome");

		}else 
		{
			System.out.println("The word being tested is not a Palindrome");
		}
		
		//other ways
		String os="new";

		int x=os.length();
		String rev = "";
		for (int i=x-1;i>=0;i--) {
			rev=rev+os.charAt(i);
		} 
		System.out.println(rev);

	}
}

