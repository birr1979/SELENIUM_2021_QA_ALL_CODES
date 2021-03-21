package javaClass1;

public class Constructor {

	// Create an instance variable
	String companyName;
	String companyAddress;
	String CEO;

	// Create a Constructor
	Constructor() {
		/*
		 * Assigning the value "PCS" to the instance variable Each time an object of
		 * this class is created That object's 'companyName' instance variable will be
		 * initialized with the value "PCS"
		 */
		this.companyName = "PCS";
		this.CEO = "Jay";
		this.companyAddress = "123 Elm Street";
		System.out.println("Object has been initialized - Constructor was called");

	}

	public static void main(String[] args) {

		// Creating an object of the ConstructorDemo class called 'obj'
		Constructor obj = new Constructor(); // as soon as the object is created (new)
		// the constructor (ConstructorDemo()) is invoked and the code inside is
		// executed

		// Don't need to do this since this is being handled in the Constructor
//		obj.companyName = "PCS";
//		obj.CEO = "Jay";
//		obj.companyAddress = "123 Elm Street";

//		System.out.println("Obj's Company Name: " + obj.companyName);
//		System.out.println("Obj's CEO: " + obj.CEO);
//		System.out.println("Obj's Company Address: " + obj.companyAddress);

//		ConstructorDemo obj2 = new ConstructorDemo(); // as soon as the object is created (new)
		// the constructor (ConstructorDemo()) is invoked and the code inside is
		// executed

		// Don't need to do this since this is being handled in the Constructor
//		obj2.companyName = "PCS";
//		obj2.CEO = "Jay";
//		obj2.companyAddress = "123 Elm Street";

//		System.out.println("Obj2's Company Name: " + obj2.companyName);
//		System.out.println("Obj2's CEO: " + obj2.CEO);
//		System.out.println("Obj2's Company Address: " + obj2.companyAddress);

		//Creating Multiple Objects
//		for (int i = 1;; i++) {
//			System.out.println("**********************");
//			new ConstructorDemo();
//			
//		}

	}

}