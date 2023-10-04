public class maxOne {
    public static int maxConsecutiveOnes(int[] arr, int M) {
        int maxCount = 0; // Maximum consecutive 1's count

        for (int i = 0; i < arr.length; i++) {
            int zeroCount = 0; // Count of 0's in the current subarray

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeroCount++;
                }

                // If the number of 0's in the current subarray exceeds M, break
                if (zeroCount > M) {
                    break;
                }

                // Update the maximum consecutive 1's count
                maxCount = Math.max(maxCount, j - i + 1);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
        int M = 2;
        int result = maxConsecutiveOnes(arr, M);
        System.out.println("Maximum consecutive 1's: " + result);
    }
}
