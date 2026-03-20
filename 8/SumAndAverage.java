public class SumAndAverage {
    public static void main(String[] args) {
        double[] scores = {85.5, 92.0, 78.5, 95.0, 88.5};
        
        // คำนวณผลรวม
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        
        // คำนวณค่าเฉลี่ย
        double average = sum / scores.length;
        
        System.out.println("คะแนนทั้งหมด:");
        for (double score : scores) {
            System.out.println(score);
        }
        
        System.out.println("\nผลรวม: " + sum);
        System.out.printf("ค่าเฉลี่ย: %.2f%n", average);
    }
}
