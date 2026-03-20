public class ContinueInForLoop {
    public static void main(String[] args) {
        System.out.println("=== แสดงเฉพาะเลขคี่ (1-10) ===\n");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // ข้ามเลขคู่
            }
            System.out.println(i);
        }
    }
}
