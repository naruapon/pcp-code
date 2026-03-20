import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        // สร้าง Scanner Object
        Scanner input = new Scanner(System.in);
        
        // รับข้อมูลจากผู้ใช้
        System.out.print("กรุณาใส่ชื่อของคุณ: ");
        String name = input.nextLine();
        
        // แสดงผลข้อมูลที่รับมา
        System.out.println("สวัสดี " + name + "!");
        
        // ปิด Scanner
        input.close();
    }
}
