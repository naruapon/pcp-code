public class StudentDemo {
    public static void main(String[] args) {
        // สร้างวัตถุนักศึกษาคนที่ 1
        Student student1 = new Student();
        student1.studentId = "6501001";
        student1.firstName = "สมชาย";
        student1.lastName = "ใจดี";
        student1.faculty = "วิทยาศาสตร์";
        student1.major = "วิทยาการคอมพิวเตอร์";
        student1.gpa = 3.45;
        
        // สร้างวัตถุนักศึกษาคนที่ 2
        Student student2 = new Student();
        student2.studentId = "6501002";
        student2.firstName = "สมหญิง";
        student2.lastName = "รักเรียน";
        student2.faculty = "วิศวกรรมศาสตร์";
        student2.major = "วิศวกรรมคอมพิวเตอร์";
        student2.gpa = 3.78;
        
        // ใช้งานวัตถุ
        System.out.println("=== ข้อมูลนักศึกษาคนที่ 1 ===");
        student1.displayInfo();
        student1.registerCourse("CS101");
        
        System.out.println("\n=== ข้อมูลนักศึกษาคนที่ 2 ===");
        student2.displayInfo();
        student2.registerCourse("EN201");
        
        // ตรวจสอบสถานะการสำเร็จการศึกษา
        if (student1.checkGraduationStatus()) {
            System.out.println(student1.firstName + " มีคุณสมบัติสำเร็จการศึกษา");
        }
    }
}
