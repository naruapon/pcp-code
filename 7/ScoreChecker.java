public class ScoreChecker {
    public static void main(String[] args) {
        int score = 85;
        
        System.out.println("คะแนนของคุณ: " + score);
        
        // ตรวจสอบคะแนนผ่าน
        if (score >= 50) {
            System.out.println("คุณสอบผ่าน");
        }
        
        // ตรวจสอบคะแนนดีมาก
        if (score >= 80) {
            System.out.println("คุณได้คะแนนดีมาก");
        }
        
        // ตรวจสอบคะแนนเต็ม
        if (score == 100) {
            System.out.println("คะแนนเต็ม สุดยอด!");
        }
    }
}
