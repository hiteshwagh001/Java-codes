public class rearrangePoNe {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] positive = new int[n];
        int[] negative = new int[n];
        int posIdx = 0, negIdx = 0;

        // Step 1: Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positive[posIdx++] = num;
            } else {
                negative[negIdx++] = num;
            }
        }

        // Step 2: Merge positive and negative arrays alternately
        int i = 0, j = 0, k = 0;
        while (i < posIdx && j < negIdx) {
            arr[k++] = positive[i++];
            arr[k++] = negative[j++];
        }

        // Add remaining positive numbers, if any
        while (i < posIdx) {
            arr[k++] = positive[i++];
        }

        // Add remaining negative numbers, if any
        while (j < negIdx) {
            arr[k++] = negative[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, -3, 5, 7, -9, -2, 6, -8 };
        rearrange(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
