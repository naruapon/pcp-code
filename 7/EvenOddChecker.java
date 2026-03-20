public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 24;
        
        // ตรวจสอบเลขคู่ (หาร 2 ลงตัว)
        if (number % 2 == 0) {
            System.out.println(number + " เป็นเลขคู่");
        }
        
        // ตรวจสอบเลขคี่ (หาร 2 ไม่ลงตัว)
        if (number % 2 != 0) {
            System.out.println(number + " เป็นเลขคี่");
        }
    }
}
