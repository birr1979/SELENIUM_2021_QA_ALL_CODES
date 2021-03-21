package ABCDEFGHIJK;

public class throwss {
public static void myMethod() throws ArithmeticException, IndexOutOfBoundsException {
	
	int num1=10;
	int num2=0;
	int total=num1/num2;
	System.out.println("total is "+total);

}
	
	
	
	
	public static void main(String[] args) {
		
		try {
		myMethod();
		}catch(ArithmeticException x) {
			System.out.println("exception error"+x.getMessage());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("its me");
		}
		

	}

}
