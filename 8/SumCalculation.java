public class SumCalculation {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        
        System.out.println("คำนวณผลรวม 1 + 2 + 3 + ... + " + n);
        
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("รอบที่ " + i + ": sum = " + sum);
        }
        
        System.out.println("\nผลรวมทั้งหมด = " + sum);
        
        // สูตรคำนวณ: n(n+1)/2
        int formula = n * (n + 1) / 2;
        System.out.println("ตรวจสอบด้วยสูตร: " + formula);
    }
}
