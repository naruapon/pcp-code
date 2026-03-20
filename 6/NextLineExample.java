import java.util.Scanner;

public class NextLineExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ใส่ชื่อเต็ม: ");
        String fullName = input.nextLine();  // รับทั้งบรรทัด
        
        System.out.print("ใส่ที่อยู่: ");
        String address = input.nextLine();   // รับทั้งบรรทัด
        
        System.out.println("\n===== ข้อมูลของคุณ =====");
        System.out.println("ชื่อ: " + fullName);
        System.out.println("ที่อยู่: " + address);
        
        input.close();
    }
}
