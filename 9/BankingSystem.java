public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.displayAccountInfo();
        
        BankAccount account2 = new BankAccount("Naruapon Suwanwijit", 5000.0);
        account2.deposit(1000.0);
        account2.displayAccountInfo();
        
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
