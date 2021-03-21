package oops_encapsulation;

public class DefineActions {
	
	private String userName = "jayMathur";
	private String password = "abcd1234";
	
	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Create a method to login
	public void login(String username, String user_password) {
		if(username.equals(userName) && user_password.equals(password)) {
			System.out.println("User has logged in!");
		}else {
			System.out.println("ERROR: Invalid Credentials!");
		}
	}
	
//	public String getUsername() {
//		return userName;
//	}
//	
//	public void setPassword(String newPassword) {
//		this.password = newPassword;
//	}

}
