public class Countdown {
    public static void main(String[] args) {
        System.out.println("นับถอยหลังจาก 10:");
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500); // หน่วง 0.5 วินาที
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("เริ่ม!");
    }
}
