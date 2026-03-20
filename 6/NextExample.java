import java.util.Scanner;

public class NextExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ใส่ชื่อ: ");
        String firstName = input.next();  // รับคำเดียว
        
        System.out.print("ใส่นามสกุล: ");
        String lastName = input.next();   // รับคำเดียว
        
        System.out.println("ชื่อ-นามสกุล: " + firstName + " " + lastName);
        
        input.close();
    }
}
