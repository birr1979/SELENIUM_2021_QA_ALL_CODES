package InterviewExecrise;

class a extends ArraySort{
	public static int x=12;
}

public class ArraySort {
	
	
	
	public static void main(String[] args) {
		
	
//		int i=0;
//		while (i<myInt.length) {
//	Arrays.sort(myInt);
//			System.out.println(myInt[i]);
//		
//			i++;
//		}
	

		String name="Birhanu";
		
		for(int i=(name.length()-1);i>=0;i--) {
			
			System.out.println(String.valueOf(name.charAt(i)).toUpperCase());
		}
		//ODD or EVEN Print
		for (int j=1;j<=10;j++) {
			if(j%2!=0)
				continue;
			System.out.println(j);
		}
		
		//fibonacci seq
		System.out.println("Fibo Seq");
		int a=0;
		int b=1;
		for (int k=0;k<=20;k++) {
			int c=a+b;
			a=b;
			b=c;
		System.out.println(a);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	

}
