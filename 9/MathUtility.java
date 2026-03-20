public class MathUtility {
    // Static Variable
    private static final double PI = 3.14159;
    
    // Static Method คำนวณพื้นที่วงกลม
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    
    // Static Method คำนวณเส้นรอบวงกลม
    public static double calculateCircleCircumference(double radius) {
        return 2 * PI * radius;
    }
    
    // Static Method หาค่าสูงสุด
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    
    // Static Method หาค่าต่ำสุด
    public static int findMin(int a, int b) {
        return (a < b) ? a : b;
    }
    
    // Static Method คำนวณค่าเฉลี่ย
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    // Static Method ตรวจสอบจำนวนเฉพาะ
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}