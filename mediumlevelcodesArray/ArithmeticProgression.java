public class ArithmeticProgression {
    public static void main(String[] args) {
        int set[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(longestProgression(set));
    }

    public static int longestProgression(int arr[]) {
        int n = arr.length;
        // If the array has 0 or 1 elements, return its length
        if (n <= 1) {
            return n;
        }

        int maxLength = 1;

        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            int currentLength = 1;

            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j + 1] == arr[j] + diff) {
                    currentLength++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    break;
                }
            }
        }

        return maxLength;
    }
}
