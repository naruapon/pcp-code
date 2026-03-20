public class NewBankAccount {
    // Instance Variables
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    // Constructor
    public NewBankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    // Instance Method สำหรับฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("ฝากเงิน " + amount + " บาท สำเร็จ");
            System.out.println("ยอดเงินคงเหลือ: " + balance + " บาท");
        } else {
            System.out.println("จำนวนเงินไม่ถูกต้อง");
        }
    }
    
    // Instance Method สำหรับถอนเงิน
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("ถอนเงิน " + amount + " บาท สำเร็จ");
            System.out.println("ยอดเงินคงเหลือ: " + balance + " บาท");
            return true;
        } else {
            System.out.println("ไม่สามารถถอนเงินได้ ยอดเงินไม่เพียงพอหรือจำนวนเงินไม่ถูกต้อง");
            return false;
        }
    }
    
    // Instance Method สำหรับตรวจสอบยอดเงิน
    public void checkBalance() {
        System.out.println("บัญชี: " + accountNumber);
        System.out.println("เจ้าของบัญชี: " + ownerName);
        System.out.println("ยอดเงินคงเหลือ: " + balance + " บาท");
    }
    
    // Instance Method สำหรับโอนเงิน
    public boolean transfer(NewBankAccount destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("โอนเงินไปยังบัญชี " + destinationAccount.accountNumber + " สำเร็จ");
            return true;
        } else {
            System.out.println("ไม่สามารถโอนเงินได้");
            return false;
        }
    }
}
