package Class5;

public class UserNameWordCount {
	static String userName;

	static void UserName(String FirstName, String MiddleName, String LastName){
		userName= FirstName+" "+MiddleName+" "+LastName; //Birhanu D Sendek
		int count = 0;
		for(String UserName:userName.split(" ")) {
			count++;
		}
		
		System.out.println(userName+": User's Name Count is = "+count);
	}
	
	
	static void UserName(String FirstName, String LastName) {
		userName=FirstName+" "+LastName;

		int count=0;
		for(String i: userName.split(" ")) {
			count++;
		}
		System.out.println(userName+": User's Name Count is = "+count);

	}

	public static void main(String[] args) {

		UserName("Birhanu", "sendek");
		



	}	

}


