package InterviewExecrise;

public class StringTest {
//	String word = "Birhanu";
	
	public static int  wordCount(String word) {
		
		int count=word.split(" ").length;
		System.out.println(count);
		return count;
	}
	
	public static void oddOrEven(int x) {
		if(x%2==0) {
			System.out.println("The Number is Even");
		}else{
			System.out.println("The Number is Odd");
		}
	}
	
	
	public static void main(String[] args) {
		//Create a method to count the number of words in a string. 
		//The input will be 1 string, and output should be an int value
wordCount("Birhanu Sendek");

//check if odd or even number
oddOrEven(3);

		
		
		
		
	}
	
	
	

}
