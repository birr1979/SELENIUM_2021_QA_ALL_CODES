package javaClass1;


	
		public class MethodIntro {
			
			//Non-Static method that does not return any value
			public void add2Numbers(int num1, int num2) {
			
				int myTotal = num1 + num2; //myTotal is a Local Variable
				System.out.println(myTotal);
			}
			
			//Non-Static method that returns a value
			public int subtract2Numbers(int number1, int number2) {
				int myTotal = number1 - number2;
				
				return myTotal; //Must be the last line of code in the method definition		
			}
			
			//Static method that does not return any value
			public static void multiply(int num1, int num2) {
				int myTotal = num1 * num2;
				System.out.println(myTotal);
			}
			
			//Static method that returns a value
			public static double divide(int num1, int num2) {
				double myTotal = num1 / num2;
				return myTotal;
			}
			
			
			public static void main(String[] args) {
				
				
				
				//To access non-static methods, we must create an object of the class
				MethodIntro calcObject = new MethodIntro();
				
				//To access the non-static methods, call the object's reference variable and press .
//				calcObject.add2Numbers(12, 2);
				
				//Add 2 numbers together
//				int num1 = 5;
//				int num2 = 8;
//				int total = num1 + num2;
//				System.out.println(total);
						
				
				//I'm buying a mouse & computer, I need to know the total cost
//				int mousePrice = 80;
//				int computerPrice = 500;
//				int compTotal = mousePrice + computerPrice;
//				System.out.println(compTotal);
//				calcObject.add2Numbers(80, 500);
				
				
				//my wife and I want to each buy a new car, I need to know the total cost
//				int myCar = 35000;
//				int wifeCar = 45000;
//				int totalCarCost = myCar + wifeCar;
//				System.out.println(totalCarCost);
//				calcObject.add2Numbers(35000, 45000);
				
				//I'm supposed to receive money from 2 friends that I loaned money to earlier,
				//I need to know how much I'm going to receive
//				int friend1 = 60;
//				int friend2 = 80;
//				int totalMoney = friend1 + friend2;
//				System.out.println(totalMoney);
//				calcObject.add2Numbers(60, 80);
				
				
				System.out.println("**** Subtraction ****");
				
				int result;
				result = calcObject.subtract2Numbers(10, 4);
				System.out.println("Subtraction Result: " + result);
				
				//OR
				System.out.println(calcObject.subtract2Numbers(50, 30));
				
				result = calcObject.subtract2Numbers(4, 10);
				System.out.println(result);
				
				
				System.out.println("**** Multiplication ****");
				
				multiply(3, 6); //Static Methods don't require an Object reference to be accessed
				
				System.out.println("**** Division ****");
				
				double divisionResult = divide(20, 3);
				System.out.println(divisionResult);
				
				
				

				
				
			}

		
	}


