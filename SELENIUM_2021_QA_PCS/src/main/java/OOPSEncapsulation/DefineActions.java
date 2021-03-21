package OOPSEncapsulation;

public class DefineActions {
	//method for login
	//instance variable
	public String userName="birhanu";
	public String password="abcd1979";
	//create a method
	public void login(String username, String user_password) {
	if(username.equals(userName)&&user_password.equals(password)) {
		System.out.println("User is logged in");
	}else {
		System.out.println("ERROR: invalid cridentials");
	}
	}
	//display user name
	public String displayUsername() {
		return userName;
	}
	//password resetting
	public void updatePassword(String newPassword) {
		this.password=newPassword;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
