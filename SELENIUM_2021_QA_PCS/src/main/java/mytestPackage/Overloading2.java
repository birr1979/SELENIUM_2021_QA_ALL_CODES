package mytestPackage;

public class Overloading2 {

	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
		public static void main(String[] args) {
		//#Overloading is: creating methods/constructors with the same name with different parameters
		//it saves: memory, time,
 		Overloading2 mo =new Overloading2();
		mo.add(10, 20);
		mo.add(12.6, 7);
		
	}

}
