package javaBasics_Class4;

public class Conditionals {

	public static void main(String[] args) {

//		int num1 = 10;
//		
//		if(num1 > 8) {
//			System.out.println(num1 + " is Greater than 8");
//		}

//		if(false) {
//			System.out.println("This is executed when condition is True");
//		}else {
//			System.out.println("This is executed when condition is False");
//		}

//		if(num1 > 12) {
//			System.out.println(num1 + " is Greater than 12");
//		}else {
//			System.out.println(num1 + " is NOT Greater than 12");
//		}
//		
//		System.out.println("Outside the if block");

		/*
		 * Nested If Block (If block inside of another if block)
		 */

		int number = 14;
		
		if(number > 0) {
			if(number > 10) {
				if(number > 20) {
					if(number > 30) {
						if(number > 40) {
							
						}
					}else {
						System.out.println(number + " is less than 30");
					}
				}else {
					System.out.println(number + " is less than 20");
				}
			}else {
				System.out.println(number + " is less than 10");
			}
		}else {
			System.out.println(number + " is less than 0");
		}

		/*
		 * If...Else If statement Used when we have multiple possible conditions to
		 * evaluate
		 */

		double hourlyRate = 75.00;
		if (hourlyRate <= 40.00) {
			System.out.println("You're making a decent wage");
		} else if (hourlyRate <= 45.00) {
			System.out.println("$45/hr is not bad at all!");
		} else if (hourlyRate <= 50.00) {
			System.out.println("You're doing great...Keep it up!");
		} else if (hourlyRate <= 55.00) {
			System.out.println("You're making silly money!");
		} else {
			System.out.println("Share the wealth!");
		}

		/*
		 * Switch Case Statement --> Alternative to the If..else if statement How it
		 * works: --> Once the expression is evaluated, JVM finds the matching case -->
		 * Once a matching case statement is found, all other case statements after the
		 * matching case statement will be executed --> To prevent other case statements
		 * from executing, use the BREAK statement
		 */

		String major = "English"; // could also be Computer Science, Math, Biology, etc.

		switch (major) {
		case "Biology":
			System.out.println("You can become a Biologist");
			break;
		case "Math":
			System.out.println("You can become a Math Teacher");
			break;
		case "Programming":
			System.out.println("You can become a Programmer");
			break;
		case "Computer Science":
			System.out.println("You can become a Software Engineer");
			break;
		default:
			System.out.println(major + " was not defined as a valid Major");
		}

//		System.out.println("***** If..else if... : *****");
//		
//		if(major.equals("Biology")) {
//			System.out.println("You can become a Biologists");
//		}else if(major.equals("Math")) {
//			System.out.println("You can become a Math Teachr");
//		}else if (major.equals("Programming")) {
//			System.out.println("You can become a Programmer");
//		}

	}

}
