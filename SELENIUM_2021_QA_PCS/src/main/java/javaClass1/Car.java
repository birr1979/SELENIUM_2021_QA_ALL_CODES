package javaClass1;
//Instance variable

public class Car {
	public static String MycarName= "Marcedis-Benz";
	

	public static void main(String[] args) 
	
	{
		Car Obj1 = new Car();
		Car Obj2 = new Car();
		Car Obj3= new Car();
		
		System.out.println(Obj1.MycarName);
		System.out.println(Obj2.MycarName);
		System.out.println(Obj3.MycarName);
		Obj2.MycarName="BMW";
		System.out.println(MycarName);
		System.out.println("------------------------------");
		System.out.println(Obj2.MycarName);
		System.out.println(MycarName);
		
		String mystring ="I love Java";//mystring is a reference variable
		System.out.println(mystring);
	
	}

}
