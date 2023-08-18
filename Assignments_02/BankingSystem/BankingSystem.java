

public class BankingSystem {
public static void main(String[] args) {
	SavingsAccount savingsAccount = new SavingsAccount("SAH45678", "Sahid", 100, 0.05);
    savingsAccount.deposit(200.0);
    savingsAccount.withdraw(500.0);

    System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
    System.out.println("Account Number: " + savingsAccount.getAccountNumber());
    System.out.println("Balance: $" + savingsAccount.getBalance());

    CheckingAccount checkingAccount = new CheckingAccount("112233","Sashi ",910000,10000);
    checkingAccount .deposit(1000);
    checkingAccount .withdraw(1800);
    
    System.out.println("Account Holder: " + checkingAccount.getAccountHolderName());
    System.out.println("Account Number: " + checkingAccount.getAccountNumber());
    System.out.println("Balance: $" + checkingAccount.getBalance());

}
}
