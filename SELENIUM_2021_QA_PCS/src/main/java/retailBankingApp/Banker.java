package retailBankingApp;

import java.util.Scanner;

/**
 * @author Birhanu_Sendek
 *
 */
public class Banker extends Teller {
	//Loan Application
	private String loanApplication() {
		double Income;
		double LoanAmount;
		String LoanStatus="Approved";
		String Loanstatus="Denied";
		Scanner Loan =new Scanner(System.in);
		System.out.println("Please Enter your Income");
		Income =Loan.nextDouble();
		System.out.println("Please Enter your Desired Loan Amount");
		LoanAmount=Loan.nextDouble();

				
		if(LoanAmount<=(0.35*Income)) {
			System.out.println("Loan Application was: "+LoanStatus+" for $"+LoanAmount);
			double accountBalanceBeforeLoan=getAccBalance();
			System.out.println("Account balance BEFORE loan deposit: $"+accountBalanceBeforeLoan);

			double accountBalanceAfterLoan = T.getAccBalance() +LoanAmount;
			T.deposit(21231979, 1985, (LoanAmount));
			System.out.println("Account balance AFTER loan deposit: $"+accountBalanceAfterLoan);
			int LoanApplicationFee=50;
			T.withdraw(21231979, 1985, LoanApplicationFee);
			System.out.println("Loan Application fee of $50.00 was withdrawn from your account.");

		}else {
			LoanAmount=0;
			System.out.println("Loan Application was: "+ Loanstatus+"."+"\nLoan Amount = "+LoanAmount);
			System.out.println("current balance is: $"+T.getAccBalance());
			int LoanApplicationFee=50;
			T.withdraw(21231979, 1985, LoanApplicationFee);
			System.out.println("Loan Application fee of $50.00 was withdrawn from your account.");

		}

		return LoanStatus;


	}
	public static void main(String[] args) {
		//Method Implementations
		Banker B= new Banker();

		/*
		 * 	1.	Login and display the login status (login credentials must be provided via user input)
				a.	Continue to prompt the user for valid credentials as long as login is not achieved successfully
			2.	Complete Loan Application via user input
				a.	Income and desired loan amount must be captured via user input
			3.	When the loan is approved perform the following actions:
				a.	display “Loan Application was approved for $____” (loan amount)
				b.	display “Account balance BEFORE loan deposit: $____”
				c.	deposit the loan amount into the account
				d.	display “Account balance AFTER loan deposit: $____”
				e.	withdraw loan application fee of $50 and display “Loan Application fee of $50.00 was withdrawn from your account”
				f.	display “New Balance is: $___”
			4.	When the loan is denied perform the following actions:
				a.	Display “Loan application was denied
				b.	Display “current balance is: $___”
				c.	Withdraw $50.00 loan application fee and display “Loan application fee of $50.00 was withdrawn from your account
				d.	Display “new balance is: $____”
			5.	Close the Account

		 */
		//1. Login

		B.login("itsme", "letmein");
		System.out.println("-------------------------------- valid Password");
		B.login("itsme", "lethimin");
		System.out.println("-------------------------------- invalid Password");
		B.login("itshim", "letmein");
		System.out.println("-------------------------------- invalid User Name");
		//2. Loan application

		B.loanApplication();
		System.out.println("-------------------------------- Loan Application");


		B.closeAccount(21231979, 1985);
		System.out.println("-------------------------------- Account Closing");
	}

}
