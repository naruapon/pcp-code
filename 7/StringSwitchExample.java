public class StringSwitchExample {
    public static void main(String[] args) {
        String month = "มีนาคม";
        
        switch (month) {
            case "มกราคม":
                System.out.println("เดือนที่ 1 - 31 วัน");
                break;
            case "กุมภาพันธ์":
                System.out.println("เดือนที่ 2 - 28/29 วัน");
                break;
            case "มีนาคม":
                System.out.println("เดือนที่ 3 - 31 วัน");
                break;
            case "เมษายน":
                System.out.println("เดือนที่ 4 - 30 วัน");
                break;
            default:
                System.out.println("เดือนอื่นๆ");
                break;
        }
    }
}
