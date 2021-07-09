package javaBasics_Class4;

public class arraycomparison {

	public static void main(String[] args) {
		int val = 4;
		int[] valArray = {1,2,3,4,5};
		for(int i = 0; i < valArray.length ; i++)
		{
		     if (valArray[i] == val)
		       {System.out.println("yes");
		       return;
		       }
		     else
		      { System.out.println("no");
		      break;
		      }

		}
	}

}
