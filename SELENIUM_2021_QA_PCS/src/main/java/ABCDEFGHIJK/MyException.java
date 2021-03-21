package ABCDEFGHIJK;

import javax.imageio.IIOException;

class MyException extends Exception {


	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString()  {
		return str1;
		
	}

	public static void main(String[] args) throws Exception {

//does the  try catch block continue or Breakstack over 
		/*
		 * Error” is a critical condition that cannot be handled by the code of the program. 
		 * “Exception” is the exceptional situation that can be handled by the code of the program.
		 * 
		 * exception types
		 * 
		 * Checked -compile time -throws key word need to be used 
		 * Unchecked -run-time- no error at compile time but runTime
		 * 
		 * IS Illegal argument unchecked exception????
		 * 
		 * 
		 * try-catch
		 * try -catch-Finally (does finally occuer always (System.exit(1);)
		 * throw -throws
		 * throws to handle checked exception (ex: property file import, )
		 * custom with trow key word
		 * 
		 * throw Vs thorws: 
		 * 1.
		 * 2.
		 * 3.
		 * 
		 */ 
		
		
		try {
			System.out.println("starting of try block");
			throw new MyException("any String");
		
		}catch(MyException exp) {
			System.out.println("starting catch block");
			System.out.println(exp);
		}
		System.out.println("------------------------------------");	
		
try {
	int x=10, y=0;
		int total=x/y;
		System.out.println(total);
		System.out.println("math completed success.");
}
catch(IndexOutOfBoundsException e) {
	System.out.println("ArithmeticException ocurred"+e.getMessage());
}catch(Exception x) {
	System.out.println("some exception occured");
}finally {
	System.out.println("finally");
}
		
		
		int num1=5, num2=6;
		
		System.out.println(num1+num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
