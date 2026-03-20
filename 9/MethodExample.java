public class MethodExample {
    
    // Method ที่ไม่รับ parameter และไม่ return ค่า
    public static void displayWelcomeMessage() {
        System.out.println("ยินดีต้อนรับสู่โปรแกรม Java");
        System.out.println("เริ่มต้นการเรียนรู้ Method");
    }
    
    // Method ที่รับ parameter แต่ไม่ return ค่า
    public static void displayPersonInfo(String name, int age) {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age + " ปี");
    }
    
    // Method ที่รับ parameter และ return ค่า
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    // Method ที่ return ค่าแบบมีเงื่อนไข
    public static String checkGrade(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        // เรียกใช้ Method ที่ไม่มี parameter
        displayWelcomeMessage();
        System.out.println();
        
        // เรียกใช้ Method ที่มี parameter
        displayPersonInfo("สมชาย", 20);
        System.out.println();
        
        // เรียกใช้ Method ที่ return ค่าและนำค่ามาใช้งาน
        int result = calculateSum(15, 25);
        System.out.println("ผลรวม: " + result);
        
        // เรียกใช้ Method และใช้ค่า return โดยตรง
        System.out.println("ผลรวมของ 30 และ 40 คือ: " + calculateSum(30, 40));
        
        // เรียกใช้ Method ที่ return String
        int studentScore = 75;
        String grade = checkGrade(studentScore);
        System.out.println("คะแนน " + studentScore + " ได้เกรด " + grade);
    }
}
