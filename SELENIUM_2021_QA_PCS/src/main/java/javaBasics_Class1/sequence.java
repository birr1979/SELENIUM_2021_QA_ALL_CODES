package javaBasics_Class1;

public class sequence {

	public static void main(String[] args) {
	
		
	//	dinamic aray
		
		
		//0 1 1 2 3 5 8 13 21 34.....
	
		int i1 =0;
		int i2=1;
		int i3;
		for (int i=0;i<=1;i++) {//statement 1
			System.out.println(i);
		}
		
		for (int i=1;i<10;i++) {  //statement 2
			i3=i2+i1;
			
			System.out.println(i3);
			i1=i2;
			i2=i3;
			
		}
		
		
//		 int n = 10, t1 = 0, t2 = 1;
////	        System.out.println("First " + n + " terms: ");
//
//	        for (int i = 1; i <= n; i++)
//	        {
//	            System.out.println(t1);
//
//	            int sum = t1 + t2;
//	            t1 = t2;
//	            t2 = sum;
//	        }	
	
		
	}

}
