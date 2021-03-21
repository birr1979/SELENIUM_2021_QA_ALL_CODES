package mytestPackage;

public class Methodvariables {
	//Java methods: a block of code, calculations: 
	int x=10;
	int y=20;
	
	/*void sum()
	{
	System.out.println(x+y);
	
	}*/
	/*int sum()
	{
		return (x+y);
	}
	*/
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	//main method: object should be created inside the main method
	Methodvariables cal= new Methodvariables();
	//	cal.sum();
	//	int z=cal.sum();
	//	System.out.println(z);
		
		cal.sum(100,200);
	}

}
