public class CompanySystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Somsak", 30000);
        Employee emp2 = new Employee("Somchai", 35000);
        
        System.out.println("Total employees: " + Employee.getEmployeeCount());
        
        emp1.displayInfo();
        System.out.println();
        
        // เปลี่ยนอัตราโบนัสส่งผลต่อทุก Object
        Employee.setBonusRate(0.15);
        
        emp2.displayInfo();
        System.out.println();
        
        // emp1 ก็ได้อัตราโบนัสใหม่ด้วย
        System.out.println("Updated bonus for " + "emp1: " + emp1.calculateBonus());
    }
}
