package javaBasics_Class4;

public class Continue {

	public static void main(String[] args) {

		String[] majors = { "Database Development", "English","Computer Science", "Math", "Programming" };

		//I want to print out only those majors that are related to the Tech industry
		
		for (int i = 0; i < majors.length; i++) {
			
			if (majors[i].equals("Math") || majors[i].equals("English")) {
				continue;//moves on to the next iteration in the loop
			} else {
				System.out.println("i: " +i + " -- Major: " + majors[i]);
			}
		}

	}

}
