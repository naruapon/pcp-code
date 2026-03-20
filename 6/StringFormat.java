public class StringFormat {
    public static void main(String[] args) {
        String firstName = "นฤพล";
        String lastName = "สุวรรณวิจิตร";
        
        // แสดงข้อความปกติ
        System.out.printf("ชื่อ: %s %s%n", firstName, lastName);
        
        // กำหนดความกว้าง (ชิดขวา)
        System.out.printf("ชื่อ: [%15s]%n", firstName);
        
        // กำหนดความกว้าง (ชิดซ้าย)
        System.out.printf("ชื่อ: [%-15s]%n", firstName);
        
        // ตัวพิมพ์ใหญ่ทั้งหมด
        System.out.printf("ชื่อ: %S%n", firstName);
    }
}
