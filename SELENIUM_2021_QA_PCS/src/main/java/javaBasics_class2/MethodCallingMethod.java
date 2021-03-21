package javaBasics_class2;

public class MethodCallingMethod {
	
	public  void method1() {
		System.out.println("Calling Method 1");
	}
	
	public static void method2() {
		MethodCallingMethod n=new MethodCallingMethod();
		n.method1(); //calling a static method so no object reference is required
		System.out.println("Finished calling Method 1");
		
	}

	public static void main(String[] args) {
		
		//Calling a static method so no object reference is required
		method2();
		System.out.println("Finished calling Method 2");
		

	}

}
