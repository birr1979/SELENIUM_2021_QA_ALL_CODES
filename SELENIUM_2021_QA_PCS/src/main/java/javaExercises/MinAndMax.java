package javaExercises;

public class MinAndMax {

	public static void main(String[] args) {
		
		//an Array is simply a list
		//An array of lists --> Multi-dimensional array (list of lists)
		
		//{ {2, 4, 5}, {3, 4, 7}, {1, 2, 9} }
		int [][] numArray = {{2, 4, 5}, {3, 0, 7}, {1, 11, 9}};
		
		//Start the min & max values as the 1st values in the 1st array
		int minNumber = numArray[0][0];
		int maxNumber = numArray[0][0];
		
		//Minimum Number
		for(int outter = 0; outter < 3; outter++) {
			for(int inner = 0; inner < 3; inner++) {
				if(numArray[outter][inner] < minNumber) {
					minNumber = numArray[outter][inner];					
				}
			}
		}
		System.out.println("The Minimum Number is: " + minNumber);
		
		//Maximum Number
		for(int outter = 0; outter < 3; outter++) {
			for(int inner = 0; inner < 3; inner++) {
				if(numArray[outter][inner] > maxNumber) {
					maxNumber = numArray[outter][inner];
				}
			}
		}
		System.out.println("The Maximum Number is: " + maxNumber);

	}

}
