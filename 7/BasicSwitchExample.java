public class BasicSwitchExample {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("วันจันทร์");
                break;
            case 2:
                System.out.println("วันอังคาร");
                break;
            case 3:
                System.out.println("วันพุธ");
                break;
            case 4:
                System.out.println("วันพฤหัสบดี");
                break;
            case 5:
                System.out.println("วันศุกร์");
                break;
            case 6:
                System.out.println("วันเสาร์");
                break;
            case 7:
                System.out.println("วันอาทิตย์");
                break;
            default:
                System.out.println("วันไม่ถูกต้อง");
                break;
        }
    }
}
