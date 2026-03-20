public class MethodTypesDemo {
    public static void main(String[] args) {
        // ใช้งาน Static Method โดยไม่ต้องสร้าง Object
        System.out.println("=== การใช้งาน Static Method ===");
        double area = MathUtility.calculateCircleArea(5.0);
        System.out.println("พื้นที่วงกลมรัศมี 5: " + area);
        
        double circumference = MathUtility.calculateCircleCircumference(5.0);
        System.out.println("เส้นรอบวงกลมรัศมี 5: " + circumference);
        
        int max = MathUtility.findMax(25, 18);
        System.out.println("ค่าสูงสุดระหว่าง 25 และ 18: " + max);
        
        double average = MathUtility.calculateAverage(85, 90, 78, 92, 88);
        System.out.println("ค่าเฉลี่ย: " + average);
        
        boolean isPrime = MathUtility.isPrime(17);
        System.out.println("17 เป็นจำนวนเฉพาะหรือไม่: " + isPrime);
        
        System.out.println("\n=== การใช้งาน Instance Method ===");
        // สร้าง Object เพื่อใช้งาน Instance Method
        NewBankAccount account1 = new NewBankAccount("001-1234567", "สมชาย ใจดี", 10000);
        NewBankAccount account2 = new NewBankAccount("001-7654321", "สมหญิง รักเรียน", 5000);
        
        System.out.println("บัญชีที่ 1:");
        account1.checkBalance();
        System.out.println();
        
        System.out.println("บัญชีที่ 2:");
        account2.checkBalance();
        System.out.println();
        
        System.out.println("ทำรายการฝากเงิน:");
        account1.deposit(2000);
        System.out.println();
        
        System.out.println("ทำรายการถอนเงิน:");
        account1.withdraw(3000);
        System.out.println();
        
        System.out.println("ทำรายการโอนเงิน:");
        account1.transfer(account2, 5000);
        System.out.println();
        
        System.out.println("ตรวจสอบยอดเงินหลังทำรายการ:");
        account1.checkBalance();
        System.out.println();
        account2.checkBalance();
    }
}
