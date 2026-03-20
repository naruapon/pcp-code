import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        // Scanner จะถูกปิดอัตโนมัติเมื่อออกจาก try block
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("ใส่ชื่อ: ");
            String name = input.nextLine();
            
            System.out.println("สวัสดี " + name);
        } // ปิดอัตโนมัติที่นี่
    }
}
