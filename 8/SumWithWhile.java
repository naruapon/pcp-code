public class SumWithWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        while (i <= 10) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }
        
        System.out.println("\nผลรวม 1-10 = " + sum);
    }
}
