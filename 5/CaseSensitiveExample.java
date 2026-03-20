public class CaseSensitiveExample {
    public static void main(String[] args) {
        int number = 10;
        int Number = 20;
        int NUMBER = 30;
        int NuMbEr = 40;
        System.out.println(number);  // 10
        System.out.println(Number);  // 20
        System.out.println(NUMBER);  // 30
        System.out.println(NuMbEr);  // 40
    }
}
