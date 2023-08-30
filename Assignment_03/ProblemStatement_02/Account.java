
public class Account {
	private int accountNumber;
	private double balance;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public boolean withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {

		return "Account [Account Number = "+ this.getAccountNumber() + ", Balance = "+ this.getBalance() + "]";
	}
}
