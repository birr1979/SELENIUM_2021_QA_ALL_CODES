package InterviewExecrise;

import org.testng.annotations.Test;

public class testWithOutMain {
@Test
	public String reverseString(String originalString ) {
		String reverseString="";
		int x = 0;
		try {
			x = originalString.length();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=(x-1);i>=0;i--) {
			reverseString=reverseString+originalString.charAt(i);
			}
		
		return reverseString;
	}
	
	
}
