package InterviewExecrise;

import java.util.Scanner;

public class LeapYear {

	Scanner leapYear =new Scanner(System.in);
	public LeapYear ()	{
		int year;
		boolean Leap;
		System.out.println("Please enter the year to check if its a leap year or not?");
		year=leapYear.nextInt();
		if(year%4==0) {
			if(year%100==0) {

				if(year%400==0)
					Leap=true;
				else
					Leap=false;
			}
			else
				Leap=true;
		}else
			Leap=false;

		if (Leap)
			System.out.println(Leap+":"+" Year "+year+" is a leap year.");

		else
			System.out.println(Leap+":"+" Year "+year+" is NOT a leap year.");

	}

	//Other ways to do it with direct comparison 
	public void LeapYearSecondMethod() {

		int year;
		System.out.println("\nPlease enter the year to check if its a leap year or not?");
		year=leapYear.nextInt();

		if ((year%400==0)||((year%4==0)&&(year%100!=0))) 
			System.out.println("True: Year "+year+" is a leap year.");
		else 
			System.out.println("False: Year "+year+" is NOT a leap year.");
	}

	public static void main(String[] args) {
		/*
		 * • Write a program to check if a given year (provided via user input) is a
		 * leap year or not • Rules for a Leap Year • The year must be evenly divisible
		 * by 4 (no remainder) • If the year can ALSO be evenly divided by 100, it is
		 * NOT a leap year • BUT…if the year is divided by 100 evenly AND can be divided
		 * by 400 evenly (no remainder), then it is a Leap year • Create a non-static
		 * method that accepts an integer for the year • Capture the year from the user
		 * • Print out true if it is a leap year or false if it’s not a leap year
		 */
		//1st method executing
		LeapYear checkYear =new LeapYear();

		//2nd method executing
		checkYear.LeapYearSecondMethod();





	}

}
