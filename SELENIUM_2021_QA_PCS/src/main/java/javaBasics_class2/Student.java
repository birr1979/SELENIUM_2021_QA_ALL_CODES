package javaBasics_class2;

public class Student {
	
	//Create a no-arg constructor
	Student(){
		System.out.println("No-Arg Constructor was called");
	}
	
	//Create a Constructor with 1 argument
	Student(String studentName){
		System.out.println("Constructor w/1 Argument was called");
		System.out.println("Student's Name is: " + studentName);
	}
	
	//Create a Constructor with 2 arguments
	Student(String studentName, double GPA){
		System.out.println("Constructor w/2 Arguments was called");
		System.out.println("Student's Name is: " + studentName);
		System.out.println(studentName + "'s GPA is: " + GPA);
	}

	public static void main(String[] args) {
		
		//No-Arg constructor should be invoked
		Student child1 = new Student();
		
		//Constructor w/1 argument should be invoked
		Student child2 = new Student("Jay");
		
		//Constructor w/2 arguments should be invoked
		Student child3 = new Student("Rana", 3.56);
		
		//will throw an error because the constructor for this has not been defined
//		Student child4 = new Student(2.45, "Hank");
		
		
		
		
		

	}

}
