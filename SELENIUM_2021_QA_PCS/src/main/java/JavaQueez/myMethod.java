package JavaQueez;

public class myMethod {
	
	public void myMethod (String xyz) {
	
		System.out.println("Printing the argument: "+ xyz);
	}
	
	public static void main(String[] args) {
		
			
			myMethod callmethod=new myMethod();
			callmethod.myMethod("\nI am finished with Quiz 1");
	}

}
