public class BankAccount {
    // Static attributes
    private static int accountCounter = 0;
    
    // Instance attributes
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    // Default constructor
    public BankAccount() {
        accountCounter++;
        this.accountNumber = "ACC" + String.format("%05d", accountCounter);
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }
    
    // Parameterized constructor
    public BankAccount(String accountHolder, double initialBalance) {
        accountCounter++;
        this.accountNumber = "ACC" + String.format("%05d", accountCounter);
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    
    // Static method
    public static int getTotalAccounts() {
        return accountCounter;
    }
    
    // Instance methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
