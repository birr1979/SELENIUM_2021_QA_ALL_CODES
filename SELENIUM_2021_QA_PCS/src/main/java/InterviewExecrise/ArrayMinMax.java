package InterviewExecrise;
public class ArrayMinMax {

	public int max(int [] []numArray) {
		int max = 0;

		for(int i=0; i<numArray.length; i++ ) {
			for(int j=0;j<numArray[i].length;j++)
				if(numArray[i][j]>max) {
					max = numArray[i][j];
				}
		}
		return max;
	}
	
	public int min(int [] []numArray) {
		int min = numArray[0][0];
		for(int i=0; i<numArray.length; i++ ) {
			for(int j=0;j<numArray[i].length;j++)
				if(numArray[i][j]<min) {
					min = numArray[i][j];
				}
		}
		return min;
	}
	public static void main(String[] args) {


		/*Determine Minimum & Maximum
		Numbers from a Multidimensional Array
		• Create a multidimensional array as follows:
		• Array Name: numArray
		• Structure: { {2, 4, 5}, {3, 4, 7}, {1, 2, 9} }
		• Implement Nested For Loops & Conditional Statements to print out
		the following text:
		• The Minimum Number is: _____
		• The Maximum Number is: ____
		 */
		int[] [] numArray = { {2, 4, 5}, {3, 4, 7}, {1, 2, 9}};
		ArrayMinMax m = new ArrayMinMax();
		System.out.println("\n* The Minimum Number is: "+m.max(numArray));
		System.out.println("\n* The Minimum Number is: "+m.min(numArray));

	}
}


