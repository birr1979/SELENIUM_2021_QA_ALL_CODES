package javaBasics_Class4;

public class Shapes {

	static int x=9;
	public static void main(String[] args) {
		//shapes
		
		for(int i=0;i<x;i++) {
			for (int j=0;j<x;j++) {
					System.out.print(" * ");
			}
		System.out.println(" ");
		}
System.out.println("\n");
		for(int i=0;i<x;i++) {
			for (int j=0;j<x;j++) {
				if (i==0||j==0) {
					System.out.print(" * ");
			}else {
				System.out.print("  ");
			}
		System.out.println();
		}
		
		
	}

}}
