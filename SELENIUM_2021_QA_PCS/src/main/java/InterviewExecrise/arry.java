package InterviewExecrise;

import java.util.Arrays;

public class arry {
	public static int array []= {12,100, -1,10,34,65};
	
	
	public static int [] myArray(int[] array) {
		
		
		for(int i=0;i<array.length;i++) {
					
			Arrays.sort(array);
			
			System.out.println(array[i]);
		}
		
		
		return array;
		
	}
	
	
	public static void main(String[] args) {
	myArray(array);
		
		
	}

}
