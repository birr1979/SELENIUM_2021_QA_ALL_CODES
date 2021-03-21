package javaBasics_Class4;

public class Arrays {

	public static void main(String[] args) {
		
		//Declare & initialize an Array Variable
		String [] groceries = {"Milk", "Eggs", "Bread", "Cookies", "Juice"};
		 
		//Access the 1st item in the array variable (Milk)
		/*
		 * to access an item in an array variable, 
		 * provide the index value of that item
		 *  ***** INDEX always begins from 0 ******
		 */
		
//		String firstItem = groceries[0]; --> OR
//		System.out.println(groceries[0]);
//		System.out.println(groceries[1]);
//		System.out.println(groceries[2]);
//		System.out.println(groceries[3]);
//		System.out.println(groceries[4]);
//		System.out.println(groceries[5]); --> Exception: Array Index Out Of Bounds Exception
		//This exception means you are trying to access an item of an array that does not exist
		//the index value you've provided is outside the range of index values for that array
		
		//Update Item in an Array --> I want to change cookies to chips
//		System.out.println("***** After Item Update *****");
//		groceries[3] = "Chips";
//		
//		System.out.println(groceries[0]);
//		System.out.println(groceries[1]);
//		System.out.println(groceries[2]);
//		System.out.println(groceries[3]);
//		System.out.println(groceries[4]);
		
		
		//Determine the # of items in an Array --> .length
		int arrayLength = groceries.length;
//		System.out.println("There are " + arrayLength + " items in the grocery list");
		
//		groceries[0]; --> Can't simply access the item...you must do something with it
		
		//Declare a variable that will contain an integer value
//		int myNumber = 10;
		
		//Multi-Dimensional Arrays
		String [] [] cars = 
			{{"Ford", "Dodge", "Chevy"}, {"BMW", "Benz", "Audi"}, {"Toyota", "Honda", "Hyundai"}};
		
		//Access the items inside a multi-dimensional Array (Chevy)
//		String item = cars[0][2];
//		System.out.println(item);
//		
//		//Access BMW
//		String item2 = cars[1][0];
//		System.out.println(item2);
//		
//		//Access Honda
//		String item3 = cars[2][1];
//		System.out.println(item3);
		
//		System.out.println(cars[1].length);
//		System.out.println(cars[1]);
		
		//Access all items in the cars array using a nested For Loop
//		for(int i = 0; i < cars.length; i++) {
//			
//			for(int z = 0; z < cars[i].length; z++) {
//				System.out.println(cars[i][z]);
//				System.out.println("****");
//			}
//			
//			System.out.println("---------------------");
//			
//			
//		}
		
		
		//Dynamic Arrays 
		int [] numberArray = new int[4];
		//we have created an array object that will be of length 4 (4 items in the array)
		
		//Add items to the numberArray
		numberArray[0] = 10;
		numberArray[1] = 20;
		numberArray[2] = 30;
		numberArray[3] = 40;
		
		for(int x : numberArray) {
			System.out.println(x);
		}
		
		
		
		

	}

}
