public class BankAccount {
    private String accountNumber;
    private int balance;
    private String ownerName;

    public BankAccount(String accountNumber, int balance, String ownerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount +" Deposited in account "+accountNumber);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount+ " Withdrawed from "+accountNumber);
        }else{
            System.out.println("Invalid withdraw amount (or) Insufficient balance");
        }
    }
    public int getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }

}
