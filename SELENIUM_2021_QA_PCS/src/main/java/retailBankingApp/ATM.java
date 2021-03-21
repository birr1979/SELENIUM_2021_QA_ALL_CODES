package retailBankingApp;
/**
 * @author birhanu_Sendek
 *
 */

public class ATM extends Transactions{
	// METHOD to DisplayTransactionHistory >> using inheritance
	private String displayTransactionHistory(int AccountNumber,int PinNumber) {

		String transactionDetails= "Transaction History was displayed.";

		if(AccountNumber==getAccountNumber() && PinNumber==getPinNumber()) {
			System.out.println(transactionDetails);
		}else {
			System.out.println("Invalid Credentials!");
		}
		return transactionDetails;
	}

	public static void main(String[] args) {
		//Method Implementations
		ATM A=new ATM();

		/*
		1.	Deposit a valid amount into the account & display the new Balance
		2.	Withdraw a valid amount from the account & display the new Balance
		3.	Make a payment of a valid amount from the account & display the new Balance
		4.	Display the Transaction History for the account
		 */
		A.deposit(21231979, 1985, 1200.00);
		System.out.println("-----------------------");
		A.withdraw(21231979, 1985, 11900.00);
		System.out.println("-----------------------");
		A.makePayment(21231979, 1985, 3000); //Other way of printing new current balance using getAccBalance -setters and getters
		System.out.println("Current New Account Balance: $"+A.getAccBalance());
		System.out.println("-----------------------");
		A.displayTransactionHistory(21231979, 1985);

	}

}
