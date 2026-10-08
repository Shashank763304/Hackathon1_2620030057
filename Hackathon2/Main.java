import java.util.Scanner;

class BankAccount {
    // Data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Adds the given amount to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraws money only if sufficient balance is available
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn: $" + amount);
            } else {
                System.out.println("Error: Insufficient balance. Transaction failed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Returns the current balance
    public double checkBalance() {
        return balance;
    }

    // Displays account details and balance
    public void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading account details from the user
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holderName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating an object using the parameterized constructor
        BankAccount account = new BankAccount(accNum, holderName, initialBalance);

        // Perform one deposit operation
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Perform one withdrawal operation
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account details
        account.displayAccount();

        
    }
}
