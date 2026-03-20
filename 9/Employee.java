public class Employee {
    private String employeeId;
    private String name;
    private double salary;
    
    // Static attribute สำหรับนับจำนวนพนักงาน
    private static int employeeCount = 0;
    
    // Static attribute สำหรับเก็บอัตราโบนัสที่ใช้ร่วมกัน
    private static double bonusRate = 0.10;
    
    public Employee(String name, double salary) {
        employeeCount++;
        this.employeeId = "EMP" + String.format("%04d", employeeCount);
        this.name = name;
        this.salary = salary;
    }
    
    public double calculateBonus() {
        return salary * bonusRate;
    }
    
    public static void setBonusRate(double newRate) {
        if (newRate >= 0 && newRate <= 1.0) {
            bonusRate = newRate;
        }
    }
    
    public static int getEmployeeCount() {
        return employeeCount;
    }
    
    public void displayInfo() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}
