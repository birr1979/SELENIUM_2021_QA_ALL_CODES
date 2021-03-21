package javaClass1;

public class Practice {
	int x;
	int y;
	
	
	Practice  (String Name){//constructor
		this.x=4;
		this.y=6;
		System.out.println("Sum is: = "+(x+y));
	}
	Practice (double name){
		this.x=7;
		this.y=9;
		System.out.println("Subtraction is: = " + (x-y));
	}
	public static void main(String[] args) {
		
		Practice obj1=new Practice("Name");

System.out.println(obj1.x+obj1.y);
Practice obj2=new Practice(2.0);

	}

}
