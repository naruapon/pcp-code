public class PassByReferenceExample {
    
    public static void modifyArray(int[] arr) {
        System.out.println("ก่อนเปลี่ยนแปลงใน Method: " + arr[0]);
        arr[0] = 999;
        System.out.println("หลังเปลี่ยนแปลงใน Method: " + arr[0]);
    }
    
    public static void reassignArray(int[] arr) {
        System.out.println("ก่อน reassign: " + arr[0]);
        arr = new int[]{5, 6, 7};
        arr[0] = 100;
        System.out.println("หลัง reassign ใน Method: " + arr[0]);
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("ค่าเริ่มต้น: " + numbers[0]);
        
        // เปลี่ยนแปลงข้อมูลภายใน object
        modifyArray(numbers);
        System.out.println("ค่าหลังเรียกใช้ modifyArray: " + numbers[0]);
        System.out.println();
        
        // ลองทำการ reassign
        reassignArray(numbers);
        System.out.println("ค่าหลังเรียกใช้ reassignArray: " + numbers[0]);
    }
}
