package oops_encapsulation;

public class PerformActions {

	public static void main(String[] args) {
		
		DefineActions actions = new DefineActions();
		
		//this will cause a security breach
//		actions.password = "123";
		
		
		//if you forgot you username
		System.out.println(actions.getUserName());
		
		//if you want to rest your password
		actions.setPassword("abcd4321");
		
		actions.login("jayMathur", "abcd4321");

	}

}
