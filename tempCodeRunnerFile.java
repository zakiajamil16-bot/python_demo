import java.util.Scanner;

// Custom Exception for Negative Balance
class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Insufficient Balance
class NoSufficientBalanceException extends Exception {
    public NoSufficientBalanceException(String message) {
        super(message);
    }
}

// Abstract Base Class
abstract class Account {
    protected String accHolderName;
    protected int accNumber;
    protected double balance;

    public Account(String name, int accNumber, double balance) throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException("Balance cannot be negative!");
        }
        this.accHolderName = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws NoSufficientBalanceException {
        if (amount > balance) {
            throw new NoSufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Display details
    public void display() {
        System.out.println("\nAccount Holder: " + accHolderName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    // Abstract method
    abstract void calculateInterest();
}

// Savings Account Class
class SavingsAccount extends Account {

    public SavingsAccount(String name, int accNumber, double balance) throws NegativeBalanceException {
        super(name, accNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Savings Account Interest: " + interest);
    }
}

// Current Account Class
class CurrentAccount extends Account {

    public CurrentAccount(String name, int accNumber, double balance) throws NegativeBalanceException {
        super(name, accNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.02; // 2% interest
        System.out.println("Current Account Interest: " + interest);
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Creating Savings Account
            SavingsAccount sa = new SavingsAccount("Alice", 101, 5000);
            sa.deposit(1000);
            sa.withdraw(2000);
            sa.display();
            sa.calculateInterest();

            // Creating Current Account
            CurrentAccount ca = new CurrentAccount("Bob", 102, 3000);
            ca.deposit(500);
            ca.withdraw(1000);
            ca.display();
            ca.calculateInterest();

            // Triggering Exception (Optional Demo)
            System.out.println("\n--- Testing Exception ---");
            ca.withdraw(10000); // This will throw exception

        } catch (NegativeBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NoSufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}