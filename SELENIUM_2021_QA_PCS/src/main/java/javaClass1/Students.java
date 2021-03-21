package javaClass1;

public class Students {
	String StudentName;
	String StudentMajor;
	String StudentYear;
	String SchoolName = "Student Goes to PCS Academy";
	public Students() {
		String StudentInformation= "\n---------Student Details------------";
				System.out.println(StudentInformation);
	}
		public static void main(String[] args) {
		
		
		Students Student1=new Students();
		String Class[]= {"CLASS1", "CLASS2"};
		Student1.StudentName="John Doe";
		Student1.StudentMajor="Math";
		Student1.StudentYear="2nd Year";
		
		System.out.println("Student Name: "+Student1.StudentName);
		System.out.println(Student1.SchoolName);
		System.out.print("Student is enrolled in "+Class.length+" Classes: "+ Class[0] +","+ Class[1]);
		System.out.println("\n"+Student1.StudentName +"'s Major: " + Student1.StudentMajor);
		System.out.println(Student1.StudentName +"'s Year: "+Student1.StudentYear);
		
	
		Students Student2=new Students();
		String Class2[]= {"CLASS1", "CLASS2","ClASS3"};
		Student2.StudentName="Jane Doe";
		Student2.StudentMajor="Science";
		Student2.StudentYear="1st Year";
		System.out.println("Student Name: "+Student2.StudentName);
		System.out.println(Student2.SchoolName);
		System.out.print("Student is enrolled in "+Class2.length+" Classes: "+ Class2[0] +","+ Class2[1]+","+Class2[2]);
		System.out.println("\n"+Student2.StudentName +"'s Major: " + Student2.StudentMajor);
		System.out.println(Student2.StudentName +"'s Year: "+Student2.StudentYear);		

		
		Students Student3=new Students();
		String Class3[]= {"CLASS1"};
		Student3.StudentName="David Smith";
		Student3.StudentMajor="English";
		Student3.StudentYear="3st Year";
		System.out.println("Student Name: "+Student3.StudentName);
		System.out.println(Student3.SchoolName);
		System.out.print("Student is enrolled in "+Class3.length+" Classes: "+ Class3[0]);
		System.out.println("\n"+Student3.StudentName +"'s Major: " + Student3.StudentMajor);
		System.out.println(Student3.StudentName +"'s Year: "+Student3.StudentYear);		
	}

}
