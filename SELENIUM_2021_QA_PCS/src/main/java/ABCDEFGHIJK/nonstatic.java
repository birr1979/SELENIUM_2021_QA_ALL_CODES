package ABCDEFGHIJK;

public class nonstatic {
int x=7;
int y=9;
static int k;

public nonstatic() {
	
	
	int c=x+y+k;
	System.out.println(c);
}
	
public nonstatic (String myString){
	System.out.println(myString);
}
	public static void main(String[] args) {
		
		
		nonstatic obj1=new nonstatic("ethiopia");
		
		nonstatic n=new nonstatic();
	
		
	

		
		

	}

	

}
