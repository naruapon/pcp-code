public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("ตารางคูณ 1-3:");
        while (i <= 3) {
            int j = 1;
            System.out.println("\nสูตรคูณ " + i + ":");
            
            while (j <= 5) {
                System.out.println(i + " × " + j + " = " + (i * j));
                j++;
            }
            
            i++;
        }
    }
}
