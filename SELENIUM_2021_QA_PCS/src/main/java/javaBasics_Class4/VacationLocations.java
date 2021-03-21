package javaBasics_Class4;

import java.util.Scanner;

public class VacationLocations {

	public static void main(String[] args) {
				
		/*
		 * Create a program that will ask users 
		 * to list their favorite locations
		 * for a vacation (there is no limit to the
		 * number of locations)
		 */
		
		//1st --> Create an object of the Scanner Class to get user input
		Scanner scanObj = new Scanner(System.in);
		
		//2nd --> Ask the user how many dream locations they have
		System.out.println("How many dream locations for Vacations do you have?");
		int numOfLocations = scanObj.nextInt();
		
		//3rd --> Build the Dynamic Array based on # of locations provided by user 
		String [] locations = new String[numOfLocations];
		
		//4th --> Ask user to provide the locations (must match the # of locations provided earlier)
//		System.out.println("What is your 1st dream location?");
//		String location1 = scanObj.next();
//		locations[0] = location1;
//		
//		System.out.println("What is your 2nd dream location?");
//		String location2 = scanObj.next();
//		locations[1] = location2;
		 
		for(int i = 0; i < locations.length; i++) {
			System.out.println("What is your dream location # " + (i+1));
			locations[i] = scanObj.next();
		}
		
		//5th --> Print out the list of dream locations provided by the user 
		for(int v = 0; v < locations.length; v++) {
			System.out.println("Dream Location # " + (v+1) + ": " + locations[v]);
			//Dream Location # 1: Miami
		}
		
		
		
		
		
	}

}
