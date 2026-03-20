import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = -1;
        
        System.out.println("=== ระบบลงทะเบียน ===");
        
        while (age < 0 || age > 150) {
            System.out.print("กรุณาป้อนอายุ (0-150 ปี): ");
            age = scanner.nextInt();
            
            if (age < 0) {
                System.out.println("อายุต้องไม่น้อยกว่า 0!");
            } else if (age > 150) {
                System.out.println("อายุต้องไม่เกิน 150 ปี!");
            }
        }
        
        System.out.println("ลงทะเบียนสำเร็จ! อายุของคุณ: " + age + " ปี");
        
        // แจ้งหมวดหมู่
        if (age < 18) {
            System.out.println("หมวดหมู่: เด็กและเยาวชน");
        } else if (age < 60) {
            System.out.println("หมวดหมู่: ผู้ใหญ่");
        } else {
            System.out.println("หมวดหมู่: ผู้สูงอายุ");
        }
    }
}
