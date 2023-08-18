
public class SavingsAccount extends BankAccount{

	private double interestRate;
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}
	@Override
	public String getAccountNumber() {
		return super.accountNumber;
	}
	@Override
	public String getAccountHolderName() {
		return super.accountHolderName;
	}
	@Override
	public double getBalance() {
		return super.balance;
	}
	@Override
	public void deposit(double amount) {
		
		if(amount > 0) {
			super.balance += amount;
			System.out.println(amount+" amount deposited");
		}else {
			System.out.println("Invalid Attempt");
		}
		
	}
	@Override
	public void withdraw(double amount) {
		double minimum_balance = 1000.0;
		if((super.balance - amount) >= minimum_balance) {
			super.balance -= amount;
			System.out.println(amount + " amount withdrawed");
			System.out.println(super.balance + " balance");
		}else {
			System.out.println("Insufficient Balance");
			System.out.println(super.balance +" balance");
		}
	}
	

}
