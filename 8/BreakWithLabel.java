public class BreakWithLabel {
    public static void main(String[] args) {
        System.out.println("=== ไม่ใช้ label (break ออกจาก inner loop เท่านั้น) ===\n");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: i = " + i);
            
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("  Inner: j = " + j + " -> break");
                    break;  // ออกจาก inner loop
                }
                System.out.println("  Inner: j = " + j);
            }
            System.out.println();
        }
        
        System.out.println("=== ใช้ label (break ออกจาก outer loop) ===\n");
        
        outerLoop:  // ตั้งชื่อ label
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer: i = " + i);
            
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("  Inner: j = " + j + " -> break outerLoop");
                    break outerLoop;  // ออกจาก outer loop ทันที
                }
                System.out.println("  Inner: j = " + j);
            }
            System.out.println();
        }
        
        System.out.println("จบโปรแกรม");
    }
}
