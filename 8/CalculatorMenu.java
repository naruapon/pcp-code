import java.util.Scanner;

public class CalculatorMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("=== เครื่องคิดเลข ===");
        
        do {
            // แสดงเมนู
            System.out.println("\n--- เมนูหลัก ---");
            System.out.println("1. บวก (+)");
            System.out.println("2. ลบ (-)");
            System.out.println("3. คูณ (×)");
            System.out.println("4. หาร (÷)");
            System.out.println("0. ออกจากโปรแกรม");
            System.out.print("เลือกรายการ (0-4): ");
            
            choice = scanner.nextInt();
            
            // ประมวลผลตามเมนูที่เลือก
            if (choice >= 1 && choice <= 4) {
                System.out.print("ป้อนตัวเลขที่ 1: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("ป้อนตัวเลขที่ 2: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                String operator = "";
                
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        operator = "+";
                        break;
                    case 2:
                        result = num1 - num2;
                        operator = "-";
                        break;
                    case 3:
                        result = num1 * num2;
                        operator = "×";
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            operator = "÷";
                        } else {
                            System.out.println("ไม่สามารถหารด้วย 0 ได้!");
                            continue;
                        }
                        break;
                }
                
                System.out.printf("\nผลลัพธ์: %.2f %s %.2f = %.2f%n", 
                    num1, operator, num2, result);
                
            } else if (choice == 0) {
                System.out.println("\nกำลังออกจากโปรแกรม...");
                System.out.println("ขอบคุณที่ใช้เครื่องคิดเลข!");
            } else {
                System.out.println("คำสั่งไม่ถูกต้อง! กรุณาเลือก 0-4");
            }
            
        } while (choice != 0);
    }
}
