package javaBasics_Class4;

public class ForLoop {

	public static void main(String[] args) {
		
//		for(int i = 1; i<15; i++) {
//			System.out.println("Iteration Number: " + i);
//		}
		
		//Infinite Loop --> Always Avoid this!
//		for(int i = 1; i<15; i--) {
//			System.out.println("Iteration Number: " + i);
//		}
		
//		System.out.println("Finished with the For Loop Execution");
		
		/*
		 * Use a For loop to iterate through an Array
		 */
		
		String [] subjects = {"Math", "English", "Science", "History", "Programming", "Chemistry"};
		
//		for(int i = 0; i < subjects.length; i++) {
//			System.out.println(subjects[i]);
//		}
		
		//For Each Loop --> used specifically with Arrays
		for(String subject : subjects) {
			System.out.println(subject);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
