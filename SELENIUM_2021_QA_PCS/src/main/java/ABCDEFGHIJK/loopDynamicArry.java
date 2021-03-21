package ABCDEFGHIJK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class loopDynamicArry {
	
public static void main (String [] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the Arry");
	int numberOfCourses=scan.nextInt();
	String [] myCourses=new String[numberOfCourses];
	
	
	
	
	
	for(int i=0;i<myCourses.length;i++) {
		System.out.println("Enter course "+(i+1)+"'s Name.");
		myCourses[i]=scan.next();
	}
		
	scan.close();
	

	for (int k=0;k<numberOfCourses;k++) {
		System.out.println(myCourses[k]);
		
	}
	
	
	
	
	
	
	
	
//	
//	
//	List<String>Arry=new ArrayList();
//	Arry.add("Name");
//	
//
//	
//	
//	int x=Arry.size();
//	
//	
//	for(int i=0;i<x;i++) {
//		System.out.println(Arry.get(i));
//				
//	}
	
	
	
}
	

}
