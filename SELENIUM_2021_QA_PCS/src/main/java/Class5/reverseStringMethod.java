package Class5;

public class reverseStringMethod {
		
	
	public static void main(String[] args) {


		String Original="Ethiopia Is My Love.";
	String rev="";
		int x=Original.length();
		System.out.println("*********Reverse String*************");
		System.out.println("\nOriginal String is: " +Original);
		System.out.println("\nReversed String is: ");
		
		for (int i=(x-1);i>=0;i--) {
				rev=rev+Original.charAt(i);
			
			
		}
		
		System.out.print(rev);
		
	}

}

		
	


