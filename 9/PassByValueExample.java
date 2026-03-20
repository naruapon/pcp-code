public class PassByValueExample {
    
    public static void modifyPrimitive(int number) {
        System.out.println("ก่อนเปลี่ยนแปลงใน Method: " + number);
        number = number * 2;
        System.out.println("หลังเปลี่ยนแปลงใน Method: " + number);
    }
    
    public static void main(String[] args) {
        int originalNumber = 10;
        System.out.println("ค่าเริ่มต้น: " + originalNumber);
        
        modifyPrimitive(originalNumber);
        
        System.out.println("ค่าหลังเรียกใช้ Method: " + originalNumber);
    }
}
