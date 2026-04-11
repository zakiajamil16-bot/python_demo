import java.util.*;

class User {
    private String name;
    private double balance;

    public User(String name) {
        this.name = name;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        balance += amount;
    }
}

abstract class Expense {
    protected double amount;
    protected User paidBy;

    public Expense(double amount, User paidBy) {
        this.amount = amount;
        this.paidBy = paidBy;
    }

    abstract void split(List<User> users);
}

class EqualExpense extends Expense {

    public EqualExpense(double amount, User paidBy) {
        super(amount, paidBy);
    }

    void split(List<User> users) {
        double share = amount / users.size();

        for (User u : users) {
            if (!u.getName().equals(paidBy.getName())) {
                u.updateBalance(-share);
                paidBy.updateBalance(share);
            }
        }
    }
}

public class ExpenseSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        System.out.println("Enter number of users:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter user name: ");
            String name = sc.nextLine();
            users.add(new User(name));
        }

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. Show Balances");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Who paid?: ");
                    String payer = sc.nextLine();

                    User paidBy = null;
                    for (User u : users) {
                        if (u.getName().equalsIgnoreCase(payer)) {
                            paidBy = u;
                        }
                    }

                    if (paidBy == null) {
                        System.out.println("User not found!");
                        break;
                    }

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    Expense e = new EqualExpense(amount, paidBy);
                    e.split(users);

                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    System.out.println("\nBalances:");
                    for (User u : users) {
                        System.out.println(u.getName() + " : " + u.getBalance());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}