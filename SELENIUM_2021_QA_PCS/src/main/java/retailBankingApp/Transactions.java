package retailBankingApp;

import java.util.Scanner;

/**
 * @author birhanu_Sendek
 *
 */
public class Transactions {
	private int accountNumber = 21231979;
	private int pinNumber = 1985;
	private double accBalance = 100000;
	//getters and setters for the variables.
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}



	// 1st Method = Withdraw
	public double withdraw(int AccountNumber, int PinNumber, double withdrawalAmount) {

		if (AccountNumber == accountNumber && PinNumber == pinNumber) {
			if (accBalance >= withdrawalAmount) {
				double NewBalance = accBalance - withdrawalAmount;
				System.out.println("Withdrawal of $" + withdrawalAmount + " made successfully. \nCurrent New Account Balance: $" + NewBalance);
			} else {
				System.out.println("Insufficient Funds!");
			}
		} else {
			System.out.println("Invalid Credentials!");
		}
		return accBalance;
	}

	// 2nd Method = deposit
	public double deposit(int AccountNumber, int PinNumber, double DepositAmount) {
		double NewBalance = accBalance + DepositAmount;
		if (AccountNumber == accountNumber && PinNumber == pinNumber) {

			System.out.println("Deposit made successfully. \nCurrent New Account Balance: $" + NewBalance);
		} else {
			System.out.println("invalid Credentials!");
		}

		return NewBalance;
	}

	// 3rd Method Make Payments
	public double makePayment(int AccountNumber, int PinNumber, double PaymentAmount) {
		if (AccountNumber == accountNumber && PinNumber == pinNumber) {
			if (accBalance >= PaymentAmount) {
				accBalance = accBalance - PaymentAmount;
				System.out.println("Payment of $" + PaymentAmount + " made successfully.");
			} else {
				System.out.println("Insufficient funds!");
			}
		} else {
			System.out.println("Invalid Credentials!");
		}
		return accBalance;
	}

	// 4th Method closeAccount
	protected void closeAccount(int AccountNumber, int PinNumber) {
		String CloseConformation;
		
		if (AccountNumber == getAccountNumber() && PinNumber == getPinNumber()) {
			Scanner CloseAccount = new Scanner(System.in);
			System.out.println("Please Enter Account Closing Conformation, YES or NO?");
			CloseConformation = CloseAccount.next();
			CloseAccount.close();

			if (CloseConformation.equalsIgnoreCase("YES")) {
				System.out.println(
						"Account Closed Successfully." + "\nWithdrawing: $" + accBalance + " to close the account.");
				accBalance = 0;
			} else {
				System.out.println("Error: Valid account closing confirmation is required!");
			}

		} else {
			System.out.println("Invalid Credentials!");
		}
	}

	public static void main(String[] args) {
		// Method Implementations
		Transactions newtran = new Transactions();
	
		newtran.closeAccount(2123979, 1985);

	}

}
