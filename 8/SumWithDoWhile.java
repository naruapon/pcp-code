public class SumWithDoWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        do {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        } while (i <= 10);
        
        System.out.println("\nผลรวม 1-10 = " + sum);
    }
}
