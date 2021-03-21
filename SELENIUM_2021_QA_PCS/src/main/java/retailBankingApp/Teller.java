package retailBankingApp;

/**
 * @author birhanu_Sendek
 *
 */
public class Teller extends Transactions{
	private String username = "itsme";
	private String password = "letmein";
	
	Transactions T=new Transactions();
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	// 1st Method for Login
	public void login(String UserName, String Password) {
		if (UserName == getUsername() && Password == getPassword()) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Login Unsuccessful!");
		}

	}

	// 2nd method for sellDebt
	public void sellDebt(String debtTypeSold) {
		switch (debtTypeSold.toUpperCase()) {
		case "CREDIT CARD":
			System.out.println(debtTypeSold + " was sold.");
			break;
		case "NEW AUTO LOAN":
			System.out.println(debtTypeSold + " was sold.");
			break;
		case "USED AUTO LOAN":
			System.out.println(debtTypeSold + " was sold.");
			break;
		default:
			System.out.println("<<" + debtTypeSold + ">>" + " was not recognized!");
			break;
		}

	}

	public static void main(String[] args) {
		// Method Implementations
		Teller T = new Teller();
		/*
		 * 
		 * 	1.	Login & Display the login status
			2.	Deposit a valid amount into the account & display the new Balance
			3.	Withdraw a valid amount from the account & display the new Balance
			4.	Make a payment of a valid amount from the account & display the new Balance
			5.	Sell a Credit Card
			6.	Sell a New Auto Loan
			7.	Sell a Used Auto Loan
			8.	Close the Account

		 */
		//1.
		
		T.login("itsme","letmein");
		System.out.println("-----------------------");
		T.deposit(21231979, 1985, 22000);
		System.out.println("-----------------------");
		T.withdraw(21231979, 1985, 11500);
		System.out.println("-----------------------");
		T.makePayment(21231979, 1985, 4530.75); //Other way of printing new current balance using getAccBalance -setters and getters
		System.out.println("Current New Account Balance: $"+T.getAccBalance());
		System.out.println("-----------------------");
		T.sellDebt("Credit CARD");
		T.sellDebt("New Auto LOAN");
		T.sellDebt("Used auto loan");
		System.out.println("-----------------------");
		T.closeAccount(21231979, 1985);//is a scanner that takes AccountCloseConformation from the user.



	}

}
