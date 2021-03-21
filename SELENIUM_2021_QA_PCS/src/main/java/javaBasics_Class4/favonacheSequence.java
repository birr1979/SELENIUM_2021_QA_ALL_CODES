package javaBasics_Class4;

public class favonacheSequence {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13.....
//		int i1=0, i2=1, i3;
//		System.out.println(i1);	
//				for (int i=1; i<10;i++) {
//				
//					System.out.println(i2);	
//					
//					i3=i1+i2;
//					i1=i2;
//					i2=i3;
//							
//		}
	int i1=0, i2=1, i3,i=1;
System.out.println(i1);
System.out.println(i2);
	while (i<10)
	{
		i3=i1+i2;
		i1=i2;
		i2=i3;
		System.out.println(i3);
		i++;
		
	}
		
		
	
	}

}
