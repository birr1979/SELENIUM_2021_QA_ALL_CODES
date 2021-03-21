package Shapes;

public class shapes {
static int x=9;
	public static void main(String[] args) {
//shape #1
		for (int i=0;i<x;i++) {
			for (int j=0; j<x;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
		
		//shape #2
				for (int i=0;i<x;i++) {
					for (int j=0; j<i;j++) {
						System.out.print(" * ");
					}
					System.out.println(" ");
				}
					
				//shape #3
				for (int i=0;i<x;i++) {
					for (int j=0; j<i;j++) {
						
						System.out.print(" @");
					}
					System.out.println(" ");
				}
		for (int i=x+1;i>=0;i--) {
			for (int j=i-1;j>0;j--) {
				System.out.print(" @");
			}
			System.out.println(" ");
		}
		
		//shape #4
				for (int i=0;i<=x;i++) {
					for (int j=0; j<=x;j++) {
						if (i==0||j==0||i==x||j==x) {
							System.out.print(" E ");
						}else {
								System.out.print("   ");
						}
						
					}
				System.out.println("");
				}
		
				System.out.println("\n");
				//shape #5
				for (int i=0;i<=x+4;i++) {
					for (int j=0; j<x;j++) {
						if (i==(int)x/2||j==(int)x/2) {
							System.out.print(" ## ");
						}else {
								System.out.print("    ");
						}
						
					}
				System.out.println("");
				}
		

	}

}
