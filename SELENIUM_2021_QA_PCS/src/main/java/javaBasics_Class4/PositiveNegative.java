package javaBasics_Class4;

public class PositiveNegative {
	
	
	//Create a non-static method 
	public String positiveNegative(int myNumber) {
		if(myNumber > 0) {
			return "Positive";
		}else if (myNumber < 0) {
			return "Negative";
		}else {
			return "Zero";
		}
	}

	public static void main(String[] args) {
		
		PositiveNegative obj1 = new PositiveNegative();
		String result = obj1.positiveNegative(0);
		System.out.println(result);
		
		
		
	}

}
