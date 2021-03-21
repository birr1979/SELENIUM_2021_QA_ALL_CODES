package polymorphism;

public class MethodOverloading {
	
	/*
	 * We want to be able to add 2, 3, or 4 numbers
	 */
	
	//Overloaded Method -- add 2 integers
	public void add(int num1, int num2) {
		int total = num1 + num2;
		System.out.println("Sum of 2 numbers: " + total);
	}
	
	//Overloaded Method -- add 3 integers
	public void add(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		System.out.println("Sum of 3 numbers: " + total);
	}
	
	//Overloaded Method -- add 4 integers
	public void add(int num1, int num2, int num3, int num4) {
		int total = num1 + num2 + num3 + num4;
		System.out.println("Sum of 4 numbers: " + total);
	}
	
	//Overloaded Method -- add 1 integer with 1 double (different parameter data types)
	public void add (int num1, double num2) {
		double total = num1 + num2;
		System.out.println("Sum of 1 int & 1 double: " + total);
	}
	
	//Overloaded Method -- multiply 1 integer with 1 double (different sequence of parameter datatypes)
	public void multiply (int num1, double num2) {
		double total = num1 * num2;
		System.out.println("Product of 1 int & 1 double: " + total);
	}
	
	//Overloaded Method -- multiple 1 double with 1 integer (different sequence of parameter datatypes)
	public void multiply(double num1, int num2) {
		double total = num1 * num2;
		System.out.println("Product of 1 double & 1 int: " + total);
	}
	
	

	public static void main(String[] args) {
		MethodOverloading calc = new MethodOverloading();
		calc.add(5, 6);
		calc.add(60, 32, 82);
		calc.add(700, 492, 1203, 24092);
		calc.add(71, 2049.13);
		calc.multiply(8.1, 9);
		calc.multiply(10, 4921.41);

	}

}
