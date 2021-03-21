package mytestPackage;

public class ConstructorDemo {
	
	int x;
	int y;
	ConstructorDemo()// default constructor
	{
		x=10;
		y=20;
		
	}
	
	ConstructorDemo(int a, int b)// Parameterized constructor
	{
		x=a;
		y=b;
		
	}
void display ()
{
System.out.println(x+y);	
}
	public static void main(String[] args) {
		// Main method
ConstructorDemo cm1=new ConstructorDemo();
cm1.display();

ConstructorDemo cm2=new ConstructorDemo(100,200);
cm2.display();
	}
//the deference between constructor and method
	//1. method name can be anything, constructor must be the same as class name
	//2. can return value, constructor does not
	//3. method used to write logic, constructor used to initialize variables
	//4. needs to call methods explicitly, constructor automatically invoke at the time of object creation
	//constructor is a special type of method
}

//Assignments 
//1. create a student class contains the following variables and method
		//class name =student
		//variables SID, Sname, Sub1, Sub2, Sub3
		//Method getStuData(), getStuMarks(), totalMarks()
		//create the object in the main method
	//2. write a program to demonstrate constructor
	//with 3 integer variable and sum.