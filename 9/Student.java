public class Student {
    // ตัวแปรสมาชิก (Attributes)
    public String studentId;
    public String firstName;
    public String lastName;
    public String faculty;
    public String major;
    public double gpa;
    
    // เมธอด (Methods)
    public void displayInfo() {
        System.out.println("รหัสนักศึกษา: " + studentId);
        System.out.println("ชื่อ: " + firstName + " " + lastName);
        System.out.println("คณะ: " + faculty);
        System.out.println("สาขา: " + major);
        System.out.println("GPA: " + gpa);
    }
    
    public void registerCourse(String courseCode) {
        System.out.println("ลงทะเบียนวิชา " + courseCode + " สำเร็จ");
    }
    
    public boolean checkGraduationStatus() {
        // ตรวจสอบเงื่อนไขการสำเร็จการศึกษา
        return gpa >= 2.00;
    }
}
