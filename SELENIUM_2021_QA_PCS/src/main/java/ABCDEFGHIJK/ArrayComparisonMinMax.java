package ABCDEFGHIJK;

import java.util.Arrays;
import java.util.Collections;

public class ArrayComparisonMinMax {
	
	
	

	public static void main(String[] args) {

		 Integer[] num = { 2, 4, 100, 5, 9 };
		 
	        // using Collections.min() to
	        // find minimum element
	        // using only 1 line.
	        int min = Collections.min(Arrays.asList(num));
	 
	        // using Collections.max()
	        // to find maximum element
	        // using only 1 line.
	        int max = Collections.max(Arrays.asList(num));
	 
	        // printing minimum and maximum numbers
	        System.out.println("Minimum number of array is : "
	                           + min);
	        System.out.println("Maximum number of array is : "
	                           + max);
	        
	        
	        //using loop
	        int[] a = { 2, 4, 100, 500, 9 };
	        int x=a[0];
	        

	        	for(int i=0;i<a.length;i++) {
	        		if(a[i]<x) {
	        			x=a[i];
	        		}
	        	}
	        	System.out.println("max is "+x);
    		

	}

}
