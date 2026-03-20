public class DecimalControl {
    public static void main(String[] args) {
        double price = 1250.5;
        double discount = 0.15;
        double finalPrice = price * (1 - discount);
        
        System.out.printf("ราคาเต็ม: %.2f บาท%n", price);
        System.out.printf("ส่วนลด: %.0f%%%n", discount * 100);
        System.out.printf("ราคาสุทธิ: %.2f บาท%n", finalPrice);
    }
}
