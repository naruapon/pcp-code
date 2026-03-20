public class BreakInForLoop {
    public static void main(String[] args) {
        System.out.println("=== ตัวอย่าง break ใน for loop ===");
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("พบเลข 5 แล้ว หยุด loop!");
                break;  // ออกจาก loop ทันที
            }
            System.out.println("i = " + i);
        }
        
        System.out.println("จบ loop");
    }
}
