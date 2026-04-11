import java.util.Scanner;

class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

class NoSufficientBalanceException extends Exception {
    public NoSufficientBalanceException(String message) {
        super(message);
    }
}

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

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws NoSufficientBalanceException {
        if (amount > balance) {
            throw new NoSufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void display() {
        System.out.println("\nAccount Holder: " + accHolderName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    abstract void calculateInterest();
}

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


public class BankingSystem {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

    
            SavingsAccount sa = new SavingsAccount("Alice", 101, 5000);
            sa.deposit(1000);
            sa.withdraw(2000);
            sa.display();
            sa.calculateInterest();

        
            CurrentAccount ca = new CurrentAccount("Bob", 102, 3000);
            ca.deposit(500);
            ca.withdraw(1000);
            ca.display();
            ca.calculateInterest();

            
            System.out.println("\n--- Testing Exception ---");
            ca.withdraw(10000); // This will throw exception

        } catch (NegativeBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NoSufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}