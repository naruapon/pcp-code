public class PracticalExplicitCasting {
    public static void main(String[] args) {
        // ตัวอย่างที่ 1: การคำนวณเปอร์เซ็นต์
        int totalStudents = 50;
        int passedStudents = 42;
        
        // ต้องแปลงเป็น double เพื่อให้ได้ผลลัพธ์เป็นทศนิยม
        double passRate = ((double) passedStudents / totalStudents) * 100;
        System.out.println("อัตราการผ่าน: " + passRate + "%");
        
        // ตัวอย่างที่ 2: การหารที่ต้องการทศนิยม
        int numerator = 5;
        int denominator = 2;
        
        // หารแบบจำนวนเต็ม
        int intResult = numerator / denominator;
        System.out.println("\n5 / 2 (แบบจำนวนเต็ม) = " + intResult);
        
        // หารแบบทศนิยม
        double doubleResult = (double) numerator / denominator;
        System.out.println("5 / 2 (แบบทศนิยม) = " + doubleResult);
        
        // ตัวอย่างที่ 3: การแปลงสำหรับการแสดงผล
        double temperature = 36.6789;
        
        // แสดงเป็นจำนวนเต็ม
        System.out.println("\nอุณหภูมิ (ปัดทิ้ง): " + (int) temperature + "°C");
        
        // แสดงทศนิยม 2 ตำแหน่ง (ใช้การคูณและหาร)
        double tempRounded = (int) (temperature * 100) / 100.0;
        System.out.println("อุณหภูมิ (2 ทศนิยม): " + tempRounded + "°C");
        
        // ตัวอย่างที่ 4: การคำนวณเงินทอน
        double totalPrice = 157.75;
        int payment = 200;
        double change = payment - totalPrice;
        
        // แยกเป็นธนบัตรและเหรียญ
        int changeBills = (int) change;
        int changeCoins = (int) ((change - changeBills) * 100);
        
        System.out.println("\nราคาสินค้า: " + totalPrice + " บาท");
        System.out.println("จ่ายเงิน: " + payment + " บาท");
        System.out.println("เงินทอน: " + changeBills + " บาท " + changeCoins + " สตางค์");
        
        // ตัวอย่างที่ 5: การแปลงเพื่อจัดการอักขระ
        String text = "Hello";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int ascii = (int) c;
            
            // เปลี่ยนเป็นตัวพิมพ์ใหญ่โดยการปรับค่า ASCII
            if (c >= 'a' && c <= 'z') {
                char uppercase = (char) (c - 32);
                System.out.println(c + " (ASCII: " + ascii + ") -> " + 
                                   uppercase + " (ASCII: " + (int)uppercase + ")");
            }
        }
    }
}