package OOPSEncapsulation;

public class PerformActions {

	public static void main(String[] args) {
		// call the define action class
		DefineActions Login=new DefineActions();
		Login.login("birhanu", "abcd1979");
		
		
		//forgot username
		System.out.println(Login.displayUsername());
		//password reset
		
		Login.updatePassword("abcd");

	}

}
