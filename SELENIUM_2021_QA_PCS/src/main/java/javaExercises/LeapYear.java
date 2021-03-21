package javaExercises;

import java.util.Scanner;

public class LeapYear {

	boolean isLeapYear = false;

	public boolean isLeapYear(int year) {
		// year % 4 == 0 --> isLeapYear = true
		if (year % 4 == 0) {
			// year % 100 != 0 --> isLeapYear = true
			if (year % 100 != 0) {
				isLeapYear = true;
				// year % 100 == 0 && year % 400 == 0 --> isLeapYear = true
			} else if (year % 100 == 0 && year % 400 == 0) {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		
		return isLeapYear;
	}

	public static void main(String[] args) {

		// modulus - % returns the remainder of a division operation
		
		LeapYear ly = new LeapYear();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Year to see if it's a Leap Year: ");
		int year = scan.nextInt();
		
		if(ly.isLeapYear(year)) {
			System.out.println(year + " is a leap year");
		}else
			System.out.println(year + " is not a leap year");

	}

}
