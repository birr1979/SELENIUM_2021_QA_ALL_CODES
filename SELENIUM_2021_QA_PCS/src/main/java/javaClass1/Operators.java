	package javaClass1;
	
	public class Operators {
		
		public static void main (String[] args){
			
			int num1=100;
			int num2=20;
			System.out.println("This are Basic Artimatic Operators");
			System.out.println("num1+num2:  " +(num1+num2));
			System.out.println("num1-num2:  " +(num1-num2));
			System.out.println("num1*num2:  " +(num1*num2));
			System.out.println("num1/num2:  " +(num1/num2));
			System.out.println("num1%num2:  " +(num1%num2));
			
			System.out.println("This are Assignment Operators");
	int num3=1110;
	int num4=10;
	num4=num3;
	System.out.println("num1=num2:  " + num3);
	
	 num3=200;
	 num4=100;
	 
	System.out.println("+++++++++++++++++++++");
	System.out.println(num3+=num4);
	System.out.println(num3-=num4);
	System.out.println(num3*=num4);
	System.out.println(num3/=num4);
	System.out.println(num4%=num3);
	
	System.out.println("+++++++++++++++++++++");
	//Basic Arithmetic operators
	//Comparisons (==, !=, <,>,>=,<=)
	//Assignment (=,+=, -+, *=, /=, %)
	//Auto increment decrement operators (num-- or num++)
	//Logical (&& , ||, !b1-opposite)
	//Ternary num3=(num4=6)?valueA: ValueB?
	num3 =(num4==100)?400:600;
	
	System.out.println(num3);
	System.out.println("+++++++++++++++++++++");
	int num5=60;
	int num6=50;
	if (num5 < num6){ System.out.println("num 5 is lesser");}
	else {System.out.println("num5 is greater");	}
	
	{
	
		
		System.out.println("camelCasingIsLikeThis");
		
System.out.println("+++++++++++++++++++++");	
		int rand =1;
		rand=rand++;
		System.out.println(rand++);
System.out.println("+++++++++++++++++++++");		
		  int x = (int) (Math.random()*11);
	      double y = Math.random();
	      System.out.println(x);
	      
	      for (int iCount = 0; iCount< 10; iCount++)
	    	  System.out.println(iCount*100);
System.out.println("+++++++++++++++++++++");      
	           }
	      }

	
	}
		

	
	
	