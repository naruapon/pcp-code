public class DoWhileAlwaysExecute {
    public static void main(String[] args) {
        int i = 10;
        
        System.out.println("=== do-while loop ===");
        System.out.println("ค่าเริ่มต้น: i = " + i);
        
        do {
            System.out.println("ทำงานในรอบที่มี i = " + i);
            i++;
        } while (i < 5);  // เงื่อนไข: 10 < 5 → false
        
        System.out.println("จบ loop, i = " + i);
    }
}
