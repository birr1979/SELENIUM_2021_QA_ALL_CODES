package javaBasics_Class1;

public class AutoDecrementIncrement {

	public static void main(String[] args) {
		
		int number1 = 100;
		int number2 = 500;
		
		//Auto Increment
		number1++;
		number1++;
		//same as --> number1 = number1 + 1;
		
		System.out.println("number1++ : " + number1);
		
		//Auto Decrement
		number2--;
		number2--;
		//same as --> number2 = number2 - 1;
		System.out.println("number2-- : " + number2);

	}

}
