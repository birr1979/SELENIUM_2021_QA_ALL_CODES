package ABCDEFGHIJK;

class method {
	
	//static Variable
	
	static int x=4;
	
	//instance variable
	int y=7;

	/*
	 * Constructor is used to initialize an object whereas method
	 *  is used to exhibits functionality of an object. 
	 *  Constructors are invoked implicitly whereas methods
	 *   are invoked explicitly. Constructor does not return 
	 *   any value where the method may/may not return a value.
	 */
	
	
	method(){
		
		//local variable
		int z=9;
	}

	method(int x){
		
		//local variable
		int z=9;
	}
	
	method(double x){
		
		//local variable
		int z=9;
	}
	
	method(float x){
		
		//local variable
		int z=9;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	int method1(int c){
		
		System.out.println("this is method1");
		return c;
		
		
	}
	
	void method2(){
		System.out.println("this is method2");
	
	}
		
	

	public static void main(String[] args) {
		method m = new method();	
		x=7;
		m.y=90;


	m.method1(6);
	
	m.method2();
		
		

	}

}
