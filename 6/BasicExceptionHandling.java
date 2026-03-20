import java.util.Scanner;
import java.util.InputMismatchException;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== โปรแกรมคำนวณพื้นที่สี่เหลี่ยม =====\n");
        
        try {
            System.out.print("ใส่ความกว้าง: ");
            int width = input.nextInt();
            
            System.out.print("ใส่ความยาว: ");
            int length = input.nextInt();
            
            int area = width * length;
            
            System.out.println("\nพื้นที่ = " + area + " ตารางหน่วย");
            
        } catch (InputMismatchException e) {
            System.out.println("\n ข้อผิดพลาด: กรุณาใส่ตัวเลขเท่านั้น!");
            System.out.println("โปรแกรมหยุดทำงาน");
        }
        
        input.close();
    }
}
