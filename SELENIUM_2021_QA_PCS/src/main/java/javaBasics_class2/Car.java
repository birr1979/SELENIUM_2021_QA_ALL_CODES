package javaBasics_class2;

public class Car {
	
	//Create a static variable (class variables)
	public static int numOfWheels = 4;
	
	//Create an instance variable (specific to each object)
	String model;
		
	public static void main(String[] args) {
		
		//Create an object of the Car class
		Car BMW = new Car();
		//Non-primitive data types are used to declare/initialize Reference Variables
		
		//Create additional objects
		Car mercedes = new Car();
		Car toyota = new Car();
		Car honda = new Car();
		Car audi = new Car();
		
		//How many wheels does the BMW car object have? 
		//int bmwWheels = BMW.numOfWheels;
//		int bmwWheels = numOfWheels;
//		System.out.println("Number of Wheels for BMW: " + bmwWheels);
		
		//not accessing the variable through the object b/c it's a static variable
		System.out.println("Number of Wheels for BMW: " + numOfWheels); 
		
		//How many wheels does the mercedes car object have?
		System.out.println("Number of Wheels for Mercedes: " + mercedes.numOfWheels);
		
		numOfWheels = 6;
		
		System.out.println("Updated value for numOfWheels static variable: " + numOfWheels);
		
		System.out.println("Updated Number of Wheels for BMW: " + numOfWheels);
		
		//Access the each object's 'model' instance variable
		BMW.model = "3 series";
		mercedes.model = "E 350";
		toyota.model = "Camry";
		honda.model = "Accord";
		
		//What is the model for the BMW object?
		System.out.println("BMW Model is: " + BMW.model);
		
		//What is the model for the mercedes object?
		System.out.println("Mercedes Model is: " + mercedes.model);
		
		
		
		
		
//		new Car();//Eligible for Garbage Collection
		
		//Create Multiple Car Objects
//		for(int i=1;; i++) {
//			new Car();
//			System.out.println(i);
//		}
		
	}
	
	

}
