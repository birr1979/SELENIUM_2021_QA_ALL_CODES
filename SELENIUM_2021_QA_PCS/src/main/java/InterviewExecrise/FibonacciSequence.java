package InterviewExecrise;

import java.util.Scanner;

public class FibonacciSequence {
	public static Scanner Fibonacci=new Scanner(System.in);
	public static int length;
	public static int firstNumber=0;
	public static int secondNumber=1;
	static long []Fiboseq=new long[100];
	
	//method 1
//	 void seq() {
//		for (int i=1;i<100;i++) {
//					myfib[i]=firstNumber;	
//			int thirdNumber=firstNumber+secondNumber;
//			firstNumber=secondNumber;
//			secondNumber=thirdNumber;
		
			
	
	public static void FiboSeq() {
//		long [] realFib=seq();
		System.out.println("Please Enter length of the sequence.");
		length = Fibonacci.nextInt();
		
		System.out.println("Please Enter the Starting Number");
		
		int StartNumber = Fibonacci.nextInt();
		
//		long[]realFib=seq();
		if (StartNumber == 0) {
			System.out.println("Please Enter the Second Number.");
			secondNumber = Fibonacci.nextInt();

			if (secondNumber == 1) {
				System.out.println("Here are the "+ length+" Fabonacci Sequence Numbers displayed below.");
				System.out.println("------------------------------------------------------------");
				int firstNumber = 0;
				int secondNumber = 1;
				//WHILE LOOP
				int i=1;
				//				while(i<=length) {
				//					System.out.println(firstNumber);
				//					int thirdNumber=firstNumber+secondNumber;
				//					firstNumber=secondNumber;
				//					secondNumber=thirdNumber;
				//					i++;
				//										
				//				}
				//DO-WHILE LOOP
				do {
					System.out.println(firstNumber);
					int thirdNumber=firstNumber+secondNumber;
					firstNumber=secondNumber;
					secondNumber=thirdNumber;
					i++;
				}while(i<=length);
				//FOR LOOP		
				//				for (int i = 1; i <= length; i++) {
				//					System.out.println(firstNumber);
				//					int thirdNumber = firstNumber + secondNumber;
				//					firstNumber = secondNumber;
				//					secondNumber = thirdNumber;
				//				}
			} else {
				System.out.println(secondNumber+": is not a valid Fibonacci Second SequenceNumber, Please enter a valid Second number.");
			}
		} else {
			System.out.println(firstNumber+": is not a valid Fibonacci First Sequence Number, Please enter a valid Starting number.");
		}
	}

	public static void main(String[] args) {
		//The Fibonacci sequence is a series of numbers where a number is the Sum of the previous two numbers
		// Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, etc.
		//	• For this exercise, create a program that does the following:
		//		• Allows for user input of the length of the sequence to display, the starting
		//		number, and the 2nd number in the sequence (the starting and 2nd number are
		//		required)
		//		• Validate that user input for 1st & 2nd number is in fact a Fibonacci number – if
		//		it’s not a valid Fibonacci number, then ask for the input again
		//		• Create at least 1 non-static & 1 static method (you may have more of
		//		each, as you wish)
		//		• Use the For Loop, While Loop, and Do-While Loops
		/*	int i1 =0; //found on google.and has the same result. 
		int i2=1;
		int i3;
		for (int i=0;i<=1;i++) {//statement 1
			System.out.println(i);
		}

		for (int i=1;i<10;i++) {  //statement 2
			i3=i2+i1;

			System.out.println(i3);
			i1=i2;
			i2=i3;

		}
		 */

		FibonacciSequence F =new FibonacciSequence();
		F.FiboSeq();

	}

}
