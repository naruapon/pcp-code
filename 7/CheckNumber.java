public class CheckNumber {
    public static void main(String[] args) {
        int number = 15;
        
        System.out.println("ตรวจสอบจำนวน: " + number);
        
        // ตรวจสอบว่าเป็นจำนวนบวกหรือไม่
        if (number > 0) {
            System.out.println(number + " เป็นจำนวนบวก");
        }
        
        // ตรวจสอบว่าเป็นจำนวนลบหรือไม่
        if (number < 0) {
            System.out.println(number + " เป็นจำนวนลบ");
        }
        
        // ตรวจสอบว่าเป็นศูนย์หรือไม่
        if (number == 0) {
            System.out.println(number + " เป็นศูนย์");
        }
    }
}
