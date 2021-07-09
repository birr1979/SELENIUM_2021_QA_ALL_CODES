package InterviewExecrise;

import java.util.Scanner;

public class Fibonacci {

	//Method to determine the real fibonacci sequence up to 100 numbers
	public static long[] realFibonacci() {

		// declare an array of 100 elements
		long[] myFib = new long[100];

		// set up the initial numbers (0, 1)
		int num1 = 0, num2 = 1;
		int sum;

		// Using this loop to build the array of 100 numbers that are part of the
		// fibonacci sequence
		for (int i = 0; i < myFib.length; i++) {

			// Adding a value to the sequence
			myFib[i] = num1;

			// Prepare for the next calculation for the next number in the sequence
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;

			// {0, 1, 1, 2

		}
		return myFib; // returning the array of fibonacci numbers

	}

	// Method to Validate the User's Input
	public static boolean validateInput(int num) {
		long[] realFib = realFibonacci(); // Creating an array of the real fibonacci sequence

		boolean validated = false; // default value

		// Validating that the number provided by user exists in the realFib array
		for (int i = 0; i < realFib.length; i++) {
			// loop through each element in the realFib array and compare with 'num'
			if (num == realFib[i]) {
				validated = true;
				break;
			} else {
				if (i == realFib.length - 1) {
					System.out.println(num + " is not a valid Fibonacci Sequence Number");
					validated = false;
				}

			}
		}
		return validated;

	}

	// Method to generate the fibonacci sequence based on user's input
	public void fibonacci() {

		Scanner scan = new Scanner(System.in);

		// Capture the length of the sequence
		System.out.println("Enter the size of the fibonacci sequence that you want to see - max 100");
		int counter = scan.nextInt();
		int number1;
		int number2;

		// Capture the Starting Number
		do {

			System.out.println("Enter the Starting Point of the Fibonacci Sequence");
			number1 = scan.nextInt();

		} while (!validateInput(number1));

		// Capture the Starting Number
		do {

			System.out.println("Enter the Second Number of the Fibonacci Sequence");
			number2 = scan.nextInt();

		} while (!validateInput(number2));

		// close the scan object
		scan.close();

		// Print out the sequence based on the user's input
		System.out.println("Fibonacci Sequence of " + counter + " numbers: ");
		for (int i = 1; i <= counter; i++) {
			if (i == counter) {
				System.out.println(number1);
			}else {
				System.out.println(number1 + ", ");
			}

			//Preparing for the next calculation (same as the realFib array created earlier)
			int sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}

	}

	public static void main(String[] args) {
//
//		Fibonacci usersFib = new Fibonacci();
//		usersFib.fibonacci();
		
		
		int a=0;
		int b=1;
		
		for (int i=0; i<10;i++) {
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			
		}

	}



}


