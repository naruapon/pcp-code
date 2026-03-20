public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("เลขคู่ระหว่าง 0-20:");
        
        // วิธีที่ 1: เพิ่มทีละ 2
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\nวิธีที่ 2: ตรวจสอบด้วย modulo");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
