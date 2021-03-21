package Class5;

public class reverseString {

	public static void main(String[] args) {

		String os="new";
		int x=os.length();
		String rev = "";
		
		System.out.println(os.charAt(2));
		
		
		
		for (int i=x-1;i>=0;i--) {
			rev=rev+os.charAt(i);
		} 
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
