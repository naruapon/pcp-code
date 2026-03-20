public class ReturnInLoop {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5, 1, 8};
        
        int max = findMax(numbers);
        System.out.println("ค่าสูงสุด: " + max);
        
        int position = findFirst(numbers, 9);
        if (position != -1) {
            System.out.println("พบ 9 ที่ตำแหน่ง: " + position);
        }
    }
    
    // หาค่าสูงสุด
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return -1;  // return ออกจากเมธอดทันที
        }
        
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;  // return หลังจบ loop
    }
    
    // หาตำแหน่งแรกของค่าที่ต้องการ
    public static int findFirst(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // return ทันทีเมื่อพบ (ออกจากเมธอด)
            }
        }
        return -1;  // ไม่พบ
    }
}
