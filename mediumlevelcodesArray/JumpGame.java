public class JumpGame {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 2 };
        System.out.println("Can jump to the end: " + jump(nums));
    }

    private static boolean jump(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0 && i != arr.length - 1) {
                return false; 
            }
            i += arr[i]; 
        }
        return true;
    }
}