import java.util.*;
import java.util.Map.Entry;

public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Account> accounts = new HashMap<>();
		int accountNumbersCount = 100900;
		while(true) {
			
			System.out.println("\nBank Application : ");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Funds");
			System.out.println("3. Withdraw Funds");
			System.out.println("4. Check Balance");
			System.out.println("5. List All Accounts");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					Account newAccount = new Account(accountNumbersCount);
					accounts.put(accountNumbersCount, newAccount);
					System.out.println("Account created successfully. Account number: " + accountNumbersCount);
                    accountNumbersCount++;
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    Account depositAccount = accounts.get(depositAccountNumber);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                        System.out.println("Amount deposited successfully. Current balance: " + depositAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    
                    
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    Account withdrawAccount = accounts.get(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        if (withdrawAccount.withdraw(withdrawAmount)) {
                            System.out.println("Amount withdrawn successfully. Current balance: " + withdrawAccount.getBalance());
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int checkBalanceAccountNumber = scanner.nextInt();
                    Account checkBalanceAccount = accounts.get(checkBalanceAccountNumber);
                    if (checkBalanceAccount != null) {
                        System.out.println("Current balance: " + checkBalanceAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("List of All Accounts:");
//                    for (Account account : accounts.values()) {
//                        System.out.println(account);
//                    }
                    for (Entry<Integer, Account> entry : accounts.entrySet()) {
                        Integer key = entry.getKey();
                        Account value = entry.getValue();
                        System.out.println("Key: " + key + ", Value: " + value);
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
			}
		}
		
	}
}
