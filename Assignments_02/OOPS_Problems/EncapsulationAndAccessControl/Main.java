public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("01234567890" , 10, "sahid");
        System.out.println("Account Holder Name : "+account1.getOwnerName());
        System.out.println("Initial Balance : "+account1.getBalance());
        account1.deposit(5000);
        account1.withdraw(800);
        System.out.println("Current Balance : "+account1.getBalance());

        BankAccount account2 = new BankAccount("6785930321" , 100, "sasi");
        System.out.println("Account Holder Name : "+account2.getOwnerName());
        System.out.println("Initial Balance : "+account2.getBalance());
        account2.deposit(500);
        account2.withdraw(400);
        System.out.println("Current Balance : "+account2.getBalance());
        account2.getAccountNumber();
    }
}
