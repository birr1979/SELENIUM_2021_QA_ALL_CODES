package javaBasics_class2;

public class PreDefinedMethods {

	public static void main(String[] args) {

		// Random Method in the Math Class (it's a static method)

		// I want to generate a random number between 0 and 10

//		// Return a double between 0.0 & 1.0
//		int randomNumber = (int) (Math.random() * 11); // Type Casting --> temporarily converts
//		// the value to an int data type
//
//		//System.out.println(Math.random());
//
//		System.out.println(randomNumber);
		for(int i=0;i<10;i++) {
			int x=(int) (Math.random()*100);
			System.out.println(i+" "+x);
		}
		
		
		
		
		
		

	}

}
