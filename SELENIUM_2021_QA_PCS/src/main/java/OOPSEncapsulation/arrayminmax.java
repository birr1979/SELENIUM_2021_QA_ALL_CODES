package OOPSEncapsulation;
import java.util.*;
public class arrayminmax {

	
		   public int max(int [] []array) {
			      int max = 0;
			     
			      for(int i=0; i<array.length; i++ ) {
			    	  for(int j=0;j<array[i].length;j++)
			         if(array[i][j]>max) {
			            max = array[i][j];
			         }
			      }
			      return max;
			   }
			   public int min(int [] []array) {
			      int min = array[0][0];
			     
			      for(int i=0; i<array.length; i++ ) {
			    	  for(int j=0;j<array[i].length;j++)
			         if(array[i][j]<min) {
			            min = array[i][j];
			         }
			      }
			      return min;
			   }
			   public static void main(String args[]) {
			      int[] [] myArray = { {2, 4, 5}, {3, 4, 7}, {1, 2, 9}};
			      arrayminmax m = new arrayminmax();
			      System.out.println("\nThe Minimum Number is: "+m.max(myArray));
			      System.out.println("\nThe Minimum Number is: "+m.min(myArray));
			   }
			}
		    

