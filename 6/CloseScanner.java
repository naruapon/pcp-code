import java.util.Scanner;

public class CloseScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ใส่ชื่อ: ");
        String name = input.nextLine();
        
        System.out.println("สวัสดี " + name);
        
        input.close();  // ปิด Scanner
    }
}
