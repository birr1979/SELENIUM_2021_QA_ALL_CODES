package polymorphism;

public class Parent {
	
	//Overridden Method
	public void eat() {
		System.out.println("Person is Eating");
	}
	
	//Cannot be overridden because it's static
	public static void drinking() {
		System.out.println("Person is Drinking");
	}
	
	//Cannot be overridden because it's private
	private void running() {
		System.out.println("Person is Running");
	}
	
	

}
