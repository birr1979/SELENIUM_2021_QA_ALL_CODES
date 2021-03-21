package mytestPackage;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String s1=" to Java";
	//s.lenght()
		System.out.println(s.length());//s.length()
	//s.concat()
		System.out.println(s.concat(s1));//s.concat()
		s= "   welcome  ";
	//s.trim()
		System.out.println(s); //s.trim()
				System.out.println("after trim  "+s.trim());
	//s.charAt()
				s="welcome";
				System.out.println(s.charAt(3));
	//s.contains()
				System.out.println(s.contains("wel"));
	//s.equals()
				System.out.println(s.equals("Welcom"));
				
	//s.equalsIgnoreCase()
				
	//s.replace('a','b')
				s="welcome to java";
				System.out.println(s.replace('o','f'));
				System.out.println(s.replace("to","for"));
				
	//s.substring() a string between starting and ending.
				
	s="welcome";
			System.out.println(s.substring(4,6));
	
	//s.toLowerCase()
	s="WELCOME";
	System.out.println(s.toLowerCase());
	
	//s.toUpperCase
	s="welcome";
		System.out.println(s.toUpperCase());
	
	}

}
