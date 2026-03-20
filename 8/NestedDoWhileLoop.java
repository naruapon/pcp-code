public class NestedDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("ตารางคูณ 1-3:");
        do {
            int j = 1;
            System.out.println("\nสูตรคูณ " + i + ":");
            
            do {
                System.out.println(i + " × " + j + " = " + (i * j));
                j++;
            } while (j <= 5);
            
            i++;
        } while (i <= 3);
    }
}
