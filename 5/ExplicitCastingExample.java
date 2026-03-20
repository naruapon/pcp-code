public class ExplicitCastingExample {
    public static void main(String[] args) {
        // ตัวอย่างที่ 1: การแปลงจาก double เป็น int
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // ทศนิยมถูกตัดทิ้ง
        System.out.println("double: " + doubleValue);
        System.out.println("int: " + intValue);
        System.out.println("ข้อมูลที่สูญหาย: " + (doubleValue - intValue));
        
        // ตัวอย่างที่ 2: การแปลงจาก long เป็น int
        long longValue = 1234567890L;
        int intFromLong = (int) longValue;
        System.out.println("\nlong: " + longValue);
        System.out.println("int: " + intFromLong);
        
        // ตัวอย่างที่ 3: การแปลงที่ทำให้เกิด overflow
        long bigLong = 3000000000L; // ใหญ่กว่าค่าสูงสุดของ int
        int intOverflow = (int) bigLong;
        System.out.println("\nlong (ค่าใหญ่): " + bigLong);
        System.out.println("int (overflow): " + intOverflow);
        
        // ตัวอย่างที่ 4: การแปลงจาก int เป็น byte
        int intNum = 130; // ใหญ่กว่าค่าสูงสุดของ byte (127)
        byte byteNum = (byte) intNum;
        System.out.println("\nint: " + intNum);
        System.out.println("byte: " + byteNum);
        
        // ตัวอย่างที่ 5: การแปลงจาก int เป็น char
        int asciiValue = 65;
        char character = (char) asciiValue;
        System.out.println("\nint (ASCII): " + asciiValue);
        System.out.println("char: " + character);
        
        // ตัวอย่างที่ 6: การแปลงในนิพจน์คำนวณ
        double price = 99.99;
        int wholeDollars = (int) price;
        double cents = (price - wholeDollars) * 100;
        System.out.println("\nราคาเต็ม: $" + price);
        System.out.println("ดอลลาร์: $" + wholeDollars);
        System.out.println("เซนต์: " + (int) cents + " cents");
    }
}